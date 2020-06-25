package com.h.huaweimappolyline;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.h.huaweimappolyline.models.polylineBody.Destination;
import com.h.huaweimappolyline.models.polylineBody.Origin;
import com.h.huaweimappolyline.models.polylineBody.PolylineBody;
import com.h.huaweimappolyline.models.polylineResponse.PolylineResponse;
import com.h.huaweimappolyline.network.NetworkUtil;
import com.h.huaweimappolyline.utils.Validation;

import org.json.JSONObject;

import retrofit2.HttpException;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

import static com.h.huaweimappolyline.utils.Consants.KEY;

public class MainActivityPresenter {

    private final Context mContext;
    private final CompositeSubscription mSubscriptions;
    private MainActivityInterface mainActivityInterface;

    public MainActivityPresenter(Context context, MainActivityInterface mainActivityInterface) {
        this.mainActivityInterface = mainActivityInterface;
        this.mContext = context;
        mSubscriptions = new CompositeSubscription();
    }

    public void getPolylines() {
        if (Validation.isConnected(mContext)) {
            PolylineBody polylineBody = new PolylineBody();
            Origin origin = new Origin();
            origin.setLat("30.0444");
            origin.setLng("31.2357");

            Destination destination = new Destination();
            destination.setLat("30.0131");
            destination.setLng("31.2089");

            polylineBody.setDestination(destination);
            polylineBody.setOrigin(origin);

            mSubscriptions.add(NetworkUtil.getRetrofitNoHeader()
                    .getPolylines(polylineBody)
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeOn(Schedulers.io())
                    .subscribe(this::handleResponse, this::handleError));
        } else {
            Toast.makeText(mContext, "Check you internet connection", Toast.LENGTH_SHORT).show();
        }
    }

    private void handleError(Throwable throwable) {

        Log.d("RESPONSE", "handleResponse: " + throwable.getMessage());
        String message = "";
        if (throwable instanceof retrofit2.HttpException) {
            try {
                retrofit2.HttpException error = (retrofit2.HttpException) throwable;
                JSONObject jsonObject = new JSONObject(((HttpException) throwable).response().errorBody().string());
                message = jsonObject.getString("Message");
            } catch (Exception e) {
                message = throwable.getMessage();
            }

        }
    }

    private void handleResponse(PolylineResponse polylineResponse) {
        this.mainActivityInterface.getPolylineData(polylineResponse);
    }
}
