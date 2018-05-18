package com.padcmyanmar.simplehabit.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.simplehabit.R;
import com.padcmyanmar.simplehabit.viewholder.NewsSimpleHabitViewHolder;

/**
 * Created by PC on 5/18/2018.
 */

public class NewsSimpleHabitsAdapter extends RecyclerView.Adapter<NewsSimpleHabitViewHolder> {
    @Override
    public NewsSimpleHabitViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View itemNewsSimpleHabits=layoutInflater.inflate(R.layout.item_news_simple_habits,parent,false);
        NewsSimpleHabitViewHolder newsSimpleHabitViewHolder=new NewsSimpleHabitViewHolder(itemNewsSimpleHabits);
        return newsSimpleHabitViewHolder;
    }

    @Override
    public void onBindViewHolder(NewsSimpleHabitViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 12;
    }
}
