package com.h.huaweimappolyline.network;

import com.h.huaweimappolyline.models.polylineBody.PolylineBody;
import com.h.huaweimappolyline.models.polylineResponse.PolylineResponse;

import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

public interface RetrofitInterface {

    @POST("mapApi/v1/routeService/driving?key=CV5fVA%2f6pQ5H0e6JaqB7H7c5eOG5nA%2bQygXNCCodgrkNdbbLb8VyrFUiq%2bEhc7FHFQTkHhQZbrCJYBWxSQkG%2fK3fZlTZ")
    Observable<PolylineResponse> getPolylines(@Body PolylineBody polylineBody);

}
