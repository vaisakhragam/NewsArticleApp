package com.ny.newsarticle.newarticleapp.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroClient {


    /********
     * URLS
     *******/
    private static final String ROOT_URL = "http://api.nytimes.com/svc/mostpopular/v2/mostviewed/all-sections/";

    /**
     * Get Retrofit Instance
     */
    private static Retrofit getRetrofitInstance() {
        return new Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    /**
     * Get API Service
     *
     * @return API Service
     */
    public static RetroInterface getApiService() {
        return getRetrofitInstance().create(RetroInterface.class);
    }

}
