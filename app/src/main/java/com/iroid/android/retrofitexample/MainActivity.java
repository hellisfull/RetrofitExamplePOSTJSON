package com.iroid.android.retrofitexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.iroid.android.retrofitexample.network.IGetNewsEvents;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv_retrofit;
    /*private List<NewsItem> feedsList;*/
    private RecycleAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_retrofit = (RecyclerView) findViewById(R.id.rv_retrofit);
        rv_retrofit.setLayoutManager(new LinearLayoutManager(this));

        IGetNewsEvents apiService =
                MyApplication.getClient().create(IGetNewsEvents.class);

        Call<ArrayList<NewsItem>> call = apiService.getNewsItems();

        call.enqueue(new Callback<ArrayList<NewsItem>>() {
            @Override
            public void onResponse(Call<ArrayList<NewsItem>> call, Response<ArrayList<NewsItem>> response) {
                Log.d("SIZE>>",32+" "+response.body().size());
                adapter = new RecycleAdapter(MainActivity.this, response.body());
                /*feedsList =new ArrayList<>();
                NewsItem item=new NewsItem();
                item.setTitle("title");
                feedsList.add(item);*/
                rv_retrofit.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<ArrayList<NewsItem>> call, Throwable t) {

            }
        });



    }

}
