package com.example.otimus.ppmo.rest;

import com.example.otimus.ppmo.model.TenderItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Otimus on 7/24/2017.
 */

 public interface ApiInterface {

    @GET("getTenderList.php")
    Call<List<TenderItem>> getTenderList();
}
