package com.padcmyanmar.simplehabit.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.simplehabit.R;
import com.padcmyanmar.simplehabit.viewholder.HealthyMindViewHolder;

/**
 * Created by PC on 5/18/2018.
 */

public class HealthyMindAdapter extends RecyclerView.Adapter<HealthyMindViewHolder> {
    @Override
    public HealthyMindViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View itemHealthyMind=layoutInflater.inflate(R.layout.item_healthy_mind,parent,false);
        HealthyMindViewHolder healthyMindViewHolder=new HealthyMindViewHolder(itemHealthyMind);
        return healthyMindViewHolder;
    }

    @Override
    public void onBindViewHolder(HealthyMindViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 12;
    }
}
