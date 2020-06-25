package com.h.huaweimappolyline.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.schedulers.Schedulers;

import static com.h.huaweimappolyline.utils.Consants.BASE_URL;

public class NetworkUtil {

    public static RetrofitInterface getRetrofitNoHeader() {

        RxJavaCallAdapterFactory rxAdapter = RxJavaCallAdapterFactory.createWithScheduler(Schedulers.io());

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(rxAdapter)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build().create(RetrofitInterface.class);

    }



//    public static RetrofitInterface getRetrofitByToken(String token) {
//
//        Gson gson = new GsonBuilder()
//                .setLenient()
//                .create();
//
//        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
//
//        String newToken = "Bearer " + token;
//        httpClient.addInterceptor(chain -> {
//
//            Request original = chain.request();
//            Request.Builder builder = original.newBuilder()
//                    .addHeader("Authorization", newToken)
//                    .method(original.method(), original.body());
//            return chain.proceed(builder.build());
//
//        });
//
//        RxJavaCallAdapterFactory rxAdapter = RxJavaCallAdapterFactory.createWithScheduler(Schedulers.io());
//
//        return new Retrofit.Builder()
//                .baseUrl(BASE_URL)
//                .client(httpClient.build())
//                .addCallAdapterFactory(rxAdapter)
//                .addConverterFactory(GsonConverterFactory.create(gson))
//                .build().create(RetrofitInterface.class);
//    }
}
