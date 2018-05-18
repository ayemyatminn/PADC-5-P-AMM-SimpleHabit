package com.padcmyanmar.simplehabit.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.simplehabit.R;
import com.padcmyanmar.simplehabit.viewholder.EveningMeditationViewHolder;

/**
 * Created by PC on 5/18/2018.
 */

public class EveningMeditationAdapter extends RecyclerView.Adapter<EveningMeditationViewHolder> {
    @Override
    public EveningMeditationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View itemEveningMeditation=layoutInflater.inflate(R.layout.item_evening_meditation,parent,false);
        EveningMeditationViewHolder eveningMeditationViewHolder=new EveningMeditationViewHolder(itemEveningMeditation);
        return eveningMeditationViewHolder;
    }

    @Override
    public void onBindViewHolder(EveningMeditationViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 12;
    }
}
