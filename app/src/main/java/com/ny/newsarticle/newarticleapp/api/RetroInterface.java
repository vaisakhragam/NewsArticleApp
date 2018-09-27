package com.ny.newsarticle.newarticleapp.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetroInterface {

    @GET("/svc/mostpopular/v2/mostviewed/all-sections/7.json")
    Call<ArticleModel> getArticleList(@Query("api-key")String apiKey);
}
