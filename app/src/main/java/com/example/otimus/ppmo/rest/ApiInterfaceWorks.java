package com.example.otimus.ppmo.rest;

import com.example.otimus.ppmo.model.TenderItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by admin on 8/14/2017.
 */

public interface ApiInterfaceWorks {
    @GET("getWorks.php")
    Call<List<TenderItem>> getWorks();
}
