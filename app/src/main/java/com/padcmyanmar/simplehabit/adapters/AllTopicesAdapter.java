package com.padcmyanmar.simplehabit.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.simplehabit.R;
import com.padcmyanmar.simplehabit.viewholder.AllTopicesViewHolder;

/**
 * Created by PC on 5/18/2018.
 */

public class AllTopicesAdapter extends RecyclerView.Adapter<AllTopicesViewHolder> {
    @Override
    public AllTopicesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View itemAllTopices=layoutInflater.inflate(R.layout.item_all_topices,parent,false);
        AllTopicesViewHolder allTopicesViewHolder=new AllTopicesViewHolder(itemAllTopices);
        return allTopicesViewHolder;
    }

    @Override
    public void onBindViewHolder(AllTopicesViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 7;
    }
}
