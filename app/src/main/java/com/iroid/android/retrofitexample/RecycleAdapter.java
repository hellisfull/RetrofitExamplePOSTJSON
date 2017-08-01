package com.iroid.android.retrofitexample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Jesna on 10/6/2016.
 */

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.SubClass> {
    private List<NewsItem> newsList;
    Context context;

    public RecycleAdapter(Context context, List<NewsItem> retlist) {
        this.context = context;
        this.newsList =retlist;
    }


    @Override
    public RecycleAdapter.SubClass onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_row, parent, false);
        return new SubClass(view);
    }

    @Override
    public void onBindViewHolder(RecycleAdapter.SubClass holder, int position) {

        NewsItem newsItem = newsList.get(position);
        String img_url = "http://iroidtech.com/wecare/uploads/news_events/";

        holder.tvNewsTitle.setText(newsItem.getTitle());
        holder.tvNewsDate.setText(newsItem.getCreatedDate());
        holder.tvNewsContent.setText(newsItem.getDescription());

     if (!TextUtils.isEmpty(newsItem.getImage())) {
            Picasso.with(context)
                    .load(img_url+newsItem.getImage())
                    .error(R.drawable.images)
                    .into(holder.ivNewsImage);
        }


    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public class SubClass extends RecyclerView.ViewHolder{
        protected ImageView ivNewsImage;
        protected TextView tvNewsTitle, tvNewsContent, tvNewsDate;


        public SubClass(View view) {
            super(view);
            this.ivNewsImage = (ImageView) view.findViewById(R.id.thumbnail);
            this.tvNewsTitle = (TextView) view.findViewById(R.id.title);
            this.tvNewsContent = (TextView) view.findViewById(R.id.content);
            this.tvNewsDate = (TextView) view.findViewById(R.id.date);
        }
        }
    }

