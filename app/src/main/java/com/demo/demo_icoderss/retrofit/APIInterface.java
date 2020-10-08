package com.demo.demo_icoderss.retrofit;

import com.demo.demo_icoderss.models.MainResponse;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIInterface {

    @FormUrlEncoded
    @POST("v3/restaurantmenus")
    Call<MainResponse> GetMenuItem(@FieldMap HashMap<String,String> hashMap);

}