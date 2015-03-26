package com.example.theresa.chismis;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import Adapter.PagerAdapter;

/**
 * Created by theresa on 26/3/15.
 */
public class Homepage extends FragmentActivity {

    ViewPager viewpager;
    android.support.v7.app.ActionBar ab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        viewpager=(ViewPager)findViewById(R.id.pager);
        PagerAdapter padapter=new PagerAdapter(getSupportFragmentManager());
        viewpager.setAdapter(padapter);
    }


}