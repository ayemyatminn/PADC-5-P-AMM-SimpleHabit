package com.padcmyanmar.simplehabit.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.simplehabit.R;

import butterknife.ButterKnife;

/**
 * Created by PC on 5/17/2018.
 */

public class OnTheGoFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_on_the_go,container,false);
        ButterKnife.bind(this,view);
        return view;
    }
}
