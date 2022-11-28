package com.example.restapi_2018033;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyAPICall {

    @GET("v3/dc1d2a04-52e1-41a3-af89-3d034390f252")
    Call<DataModel> getData();
}

