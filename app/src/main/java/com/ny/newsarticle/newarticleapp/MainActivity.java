package com.ny.newsarticle.newarticleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ny.newsarticle.newarticleapp.adapter.NewsArticleAdapter;
import com.ny.newsarticle.newarticleapp.api.ArticleModel;
import com.ny.newsarticle.newarticleapp.api.ResultHolder;
import com.ny.newsarticle.newarticleapp.api.RetroClient;
import com.ny.newsarticle.newarticleapp.api.RetroInterface;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView article_recyclerview;
    private NewsArticleAdapter newsArticleAdapter;
    ArrayList<ResultHolder> articleList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        article_recyclerview = findViewById(R.id.article_recyclerview);

        article_recyclerview.setLayoutManager(new LinearLayoutManager(this));
        newsArticleAdapter = new NewsArticleAdapter(MainActivity.this, articleList);

        article_recyclerview.setAdapter(newsArticleAdapter);

        RetroInterface api = RetroClient.getApiService();

        /**
         * Calling JSON
         */

        System.out.println("@@call");
        Call<ArticleModel> call = api.getArticleList("9fc2c4900af748229841e04e43b4fccf");

        call.enqueue(new Callback<ArticleModel>() {
            @Override
            public void onResponse(Call<ArticleModel> call, Response<ArticleModel> response) {

                System.out.println("@@@res=" + response);

                System.out.println("@@@size=" + response.body().getResults().size());
                newsArticleAdapter.loadArticles(response.body().getResults());

            }

            @Override
            public void onFailure(Call<ArticleModel> call, Throwable t) {
                System.out.println("@@failure");

                System.out.println("@@fail=" + t.getLocalizedMessage());
                System.out.println("@@fail=" + t.getMessage());
                System.out.println("@@fail=" + t.getStackTrace());
            }
        });
    }

}
