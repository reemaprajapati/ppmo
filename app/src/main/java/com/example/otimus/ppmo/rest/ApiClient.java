package com.example.otimus.ppmo.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Otimus on 7/24/2017.
 */

public class ApiClient {

    public static final String BASE_URL="http://192.168.0.187:8080/procurement/";
    public static Retrofit retrofit=null;

    public  static Retrofit getClient(){
        if(retrofit==null){
            retrofit=new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return  retrofit;
    }
}
