package com.example.rideapplication.Retrofit;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitClient {
    public static Retrofit instance;

    public static Retrofit getInstance() {
        if(instance == null){
            instance = new Retrofit.Builder()
                    .baseUrl("http://192.168.43.219:3000/") // In emulator 127.0.0.1 will change to 10.0.2.2
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return instance;
    }
}
