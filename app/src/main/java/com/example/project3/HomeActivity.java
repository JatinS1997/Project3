package com.example.project3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


public class HomeActivity extends AppCompatActivity {



    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    Toolbar toolbar;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);


        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        // Add Fragments Here

        adapter.AddFragments(new FragmentCall(),"Calls");
        adapter.AddFragments(new FragmentContact(),"Contacts");
        adapter.AddFragments(new FragmentFav(),"Favs");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


        //Toolbar

        toolbar =findViewById(R.id.toolbar);
        this.setSupportActionBar(toolbar);

    }
}
