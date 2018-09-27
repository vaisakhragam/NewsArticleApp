package com.ny.newsarticle.newarticleapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ny.newsarticle.newarticleapp.R;
import com.ny.newsarticle.newarticleapp.api.MetaDataHolder;
import com.ny.newsarticle.newarticleapp.api.ResultHolder;


import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class NewsArticleAdapter extends RecyclerView.Adapter<NewsArticleAdapter.ViewHolder> {

    List<ResultHolder> arrayList;
    Context context;


    public NewsArticleAdapter(Context context, List<ResultHolder> arrayList) {

        this.context = context;
        this.arrayList = arrayList;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.article_holder, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        final ResultHolder ResultHolder = arrayList.get(position);
        holder.article_title.setText(ResultHolder.getTitle());
        holder.article_byline.setText(ResultHolder.getByline());
        holder.article_date.setText(ResultHolder.getPublished_date());
        holder.article_section.setText(ResultHolder.getSection());
        for (MetaDataHolder mediaMetadatum : ResultHolder.getMedia().get(0).getMedia_metadata()) {
            if (mediaMetadatum.getFormat().equalsIgnoreCase("square320")) {
                Glide.with(context).load(mediaMetadatum.getUrl()).into(holder.article_image);
                break;
            }
        }


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView article_title, article_byline, article_section, article_date;
        public CircleImageView article_image;

        public ViewHolder(View view) {
            super(view);
            article_title = view.findViewById(R.id.article_title);
            article_byline = view.findViewById(R.id.article_byline);
            article_section = view.findViewById(R.id.article_section);
            article_date = view.findViewById(R.id.article_date);
            article_image = view.findViewById(R.id.article_image);


        }
    }

    public void loadArticles(List<ResultHolder> ResultHolders) {
        this.arrayList = ResultHolders;
        notifyDataSetChanged();
    }

}
