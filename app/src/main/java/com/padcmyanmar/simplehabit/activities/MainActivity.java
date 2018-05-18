package com.padcmyanmar.simplehabit.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.padcmyanmar.simplehabit.R;
import com.padcmyanmar.simplehabit.adapters.SimpleHabitAdapter;
import com.padcmyanmar.simplehabit.fragments.OnTheGoFragment;
import com.padcmyanmar.simplehabit.fragments.SeriesFragment;
import com.padcmyanmar.simplehabit.fragments.TeacherFragment;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.vp_simple_habit)
    ViewPager vpSimpleHabit;

    @BindView(R.id.tb_simple_habit)
    TabLayout tbSimpleHabit;

    private SimpleHabitAdapter mSimpleHabitAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this,this);

        setSupportActionBar(toolbar);
        if (getSupportActionBar()!=null){
            getSupportActionBar().setTitle(R.string.title_simple_habit);
        }
        mSimpleHabitAdapter=new SimpleHabitAdapter(getSupportFragmentManager());
        vpSimpleHabit.setAdapter(mSimpleHabitAdapter);

        mSimpleHabitAdapter.addTab("ON THE GO",new OnTheGoFragment());
        mSimpleHabitAdapter.addTab("SERIES",new SeriesFragment());
        mSimpleHabitAdapter.addTab("TEACHERS",new TeacherFragment());

        tbSimpleHabit.setupWithViewPager(vpSimpleHabit);
        vpSimpleHabit.setOffscreenPageLimit(mSimpleHabitAdapter.getCount());


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
