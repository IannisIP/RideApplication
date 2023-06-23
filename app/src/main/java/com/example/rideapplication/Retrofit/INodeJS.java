package com.example.rideapplication.Retrofit;

import com.example.rideapplication.Entities.User;
import com.example.rideapplication.Entities.Ride;
import com.example.rideapplication.Entities.Driver;

import java.util.ArrayList;

import io.reactivex.Observable;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.GET;

public interface INodeJS {
    @POST("register")
    @FormUrlEncoded
    Observable<String> registerUser(@Field("email") String email,
                                   @Field("name") String name,
                                   @Field("password") String password);

    @POST("androidlogin")
    @FormUrlEncoded
    Observable<User> loginUser(@Field("email") String email,
                               @Field("password") String password);

    @POST("androidReviews1")
    @FormUrlEncoded
    Observable<String> sendReview(@Field("rating") String rating,
                                  @Field("comment") String comment,
                                  @Field("userFk") String userFk,
                                  @Field("restaurantFk") String restaurantFk);

    @POST("androidUpdateReviews")
    @FormUrlEncoded
    Observable<String> updateReview(@Field("rating") String rating,
                                  @Field("comment") String comment,
                                  @Field("userFk") String userFk,
                                  @Field("restaurantFk") String restaurantFk);

    @POST("androidDeleteReviews")
    @FormUrlEncoded
    Observable<String> deleteReview(@Field("rating") String rating,
                                    @Field("comment") String comment,
                                    @Field("userFk") String userFk,
                                    @Field("restaurantFk") String restaurantFk);
    @GET("restaurant")
    Call<ArrayList<Ride>> getAllRides();
}
