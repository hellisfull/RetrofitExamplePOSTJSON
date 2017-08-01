package com.iroid.android.retrofitexample.network;

import com.iroid.android.retrofitexample.NewsItem;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Jesna on 10/6/2016.
 */

public interface IGetNewsEvents {

    @GET("api/news_events/list?format=json")
    Call<ArrayList<NewsItem>> getNewsItems();

}
