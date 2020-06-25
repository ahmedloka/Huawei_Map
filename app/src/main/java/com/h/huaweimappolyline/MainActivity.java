package com.h.huaweimappolyline;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.h.huaweimappolyline.models.polylineResponse.Paths;
import com.h.huaweimappolyline.models.polylineResponse.Polyline;
import com.h.huaweimappolyline.models.polylineResponse.PolylineResponse;
import com.h.huaweimappolyline.models.polylineResponse.Routes;
import com.h.huaweimappolyline.models.polylineResponse.Steps;
import com.huawei.hms.maps.CameraUpdateFactory;
import com.huawei.hms.maps.HuaweiMap;
import com.huawei.hms.maps.MapView;
import com.huawei.hms.maps.OnMapReadyCallback;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.Marker;
import com.huawei.hms.maps.model.MarkerOptions;
import com.huawei.hms.maps.model.PolylineOptions;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, MainActivityInterface {

    private static final String MAPVIEW_BUNDLE_KEY = "MapViewBundleKey";
    private HuaweiMap hmap;
    private MapView mMapView;
    public static final String TAG = "MapActivity";
    private Marker mMarker;
    private MainActivityPresenter presenter;
    private List<LatLng> latLngList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainActivityPresenter(this, this);
        presenter.getPolylines();

        mMapView = findViewById(R.id.mapview_mapviewdemo);
        Bundle mapViewBundle = null;
        if (savedInstanceState != null) {
            mapViewBundle = savedInstanceState.getBundle(MAPVIEW_BUNDLE_KEY);
        }
        mMapView.onCreate(mapViewBundle);
        // get map by async method
        mMapView.getMapAsync(MainActivity.this);
    }


    @Override
    public void onMapReady(HuaweiMap map) {

        hmap = map;
        hmap.setMyLocationEnabled(false);
        hmap.setTrafficEnabled(true);


        hmap.getUiSettings().setRotateGesturesEnabled(true);
        hmap.getUiSettings().setCompassEnabled(false);

        hmap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLngList.get(0), 12.0f));
        hmap.addMarker(new MarkerOptions().position(latLngList.get(0)));
        hmap.addPolyline(new PolylineOptions()
                .addAll(latLngList)
                .color(Color.BLUE)
                .width(3));
    }

    @Override
    public void getPolylineData(PolylineResponse polylineResponse) {
        List<Routes> routesList = polylineResponse.getRoutes();
        List<Paths> paths = new ArrayList<>();
        List<Steps> steps = new ArrayList<>();
        List<Polyline> polylines = new ArrayList<>();
        latLngList = new ArrayList<>();

        for (int x = 0; x < routesList.size(); x++) {
            //here we can access each array list with main.get(x).
            for (Paths paths1 : routesList.get(x).getPaths()) {
                paths.add(paths1);
            }
            for (int y = 0; y < paths.size(); y++) {
                for (Steps step :
                        paths.get(y).getSteps()) {
                    steps.add(step);
                }
            }
            for (int i = 0; i < steps.size(); i++) {
                for (Polyline polyline :
                        steps.get(i).getPolyline()) {
                    polylines.add(polyline);
                }
            }
        }

        for (int i = 0; i < polylines.size(); i++) {
            latLngList.add(new LatLng(Double.valueOf(polylines.get(i).getLat())
                    , Double.valueOf(polylines.get(i).getLng())));
        }

    }

}
