package com.padcmyanmar.simplehabit.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.simplehabit.R;
import com.padcmyanmar.simplehabit.adapters.AllTopicesAdapter;
import com.padcmyanmar.simplehabit.adapters.EveningMeditationAdapter;
import com.padcmyanmar.simplehabit.adapters.HealthyMindAdapter;
import com.padcmyanmar.simplehabit.adapters.MostPopularAdapter;
import com.padcmyanmar.simplehabit.adapters.NewsSimpleHabitsAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by PC on 5/17/2018.
 */

public class SeriesFragment extends Fragment {

    @BindView(R.id.rv_evening_meditation)
    RecyclerView rvEveningMeditation;

    @BindView(R.id.rv_pretty_minds)
    RecyclerView rvHealthyMinds;

    @BindView(R.id.rv_news_on_simple_habits)
    RecyclerView rvNewsOnSompleHabits;

    @BindView(R.id.rv_most_popular)
    RecyclerView rvMostPopular;

    @BindView(R.id.rv_all_topics)
    RecyclerView rvAllTopices;

    private EveningMeditationAdapter mEveningMeditationAdapter;

    private HealthyMindAdapter mHealthyMindAdapter;

    private NewsSimpleHabitsAdapter mNewsSimpleHabitsAdapter;

    private MostPopularAdapter mMostPopularAdapter;

    private AllTopicesAdapter mAllTopicesAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_series,container,false);
        ButterKnife.bind(this,view);


        mEveningMeditationAdapter=new EveningMeditationAdapter();
        LinearLayoutManager linearLayoutManager1=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        rvEveningMeditation.setLayoutManager(linearLayoutManager1);
        rvEveningMeditation.setAdapter(mEveningMeditationAdapter);

        mHealthyMindAdapter=new HealthyMindAdapter();
        LinearLayoutManager linearLayoutManager2=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        rvHealthyMinds.setAdapter(mHealthyMindAdapter);
        rvHealthyMinds.setLayoutManager(linearLayoutManager2);

        mNewsSimpleHabitsAdapter=new NewsSimpleHabitsAdapter();
        LinearLayoutManager linearLayoutManager3=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        rvNewsOnSompleHabits.setLayoutManager(linearLayoutManager3);
        rvNewsOnSompleHabits.setAdapter(mNewsSimpleHabitsAdapter);

        mMostPopularAdapter=new MostPopularAdapter();
        LinearLayoutManager linearLayoutManager4=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        rvMostPopular.setAdapter(mMostPopularAdapter);
        rvMostPopular.setLayoutManager(linearLayoutManager4);

        mAllTopicesAdapter=new AllTopicesAdapter();
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        rvAllTopices.setLayoutManager(linearLayoutManager);
        rvAllTopices.setAdapter(mAllTopicesAdapter);

        return view;
    }
}
