package com.example.theresa.chismis;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import Adapter.PagerAdapter;

/**
 * Created by theresa on 26/3/15.
 */

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import Adapter.PagerAdapter;


public class Homepage extends ActionBarActivity {

    private ViewPager mPager;

    ActionBar mActionbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        /** Getting a reference to action bar of this activity */
        mActionbar = getSupportActionBar();


        /** Set tab navigation mode */
        mActionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        /** Getting a reference to ViewPager from the layout */
        mPager = (ViewPager) findViewById(R.id.pager);

        /** Getting a reference to FragmentManager */
        FragmentManager fm = getSupportFragmentManager();

        /** Defining a listener for pageChange */
        ViewPager.SimpleOnPageChangeListener pageChangeListener = new ViewPager.SimpleOnPageChangeListener(){
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                mActionbar.setSelectedNavigationItem(position);
            }
        };

        /** Setting the pageChange listener to the viewPager */
        mPager.setOnPageChangeListener(pageChangeListener);

        /** Creating an instance of FragmentPagerAdapter */
        PagerAdapter fragmentPagerAdapter = new PagerAdapter(fm);

        /** Setting the FragmentPagerAdapter object to the viewPager object */
        mPager.setAdapter(fragmentPagerAdapter);

        mActionbar.setDisplayShowTitleEnabled(true);

        /** Defining tab listener */
        ActionBar.TabListener tabListener = new ActionBar.TabListener() {

            @Override
            public void onTabUnselected(Tab tab, FragmentTransaction ft) {
            }

            @Override
            public void onTabSelected(Tab tab, FragmentTransaction ft) {
                mPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabReselected(Tab tab, FragmentTransaction ft) {
            }
        };

        /** Creating fragment1 Tab */
        Tab tab = mActionbar.newTab()
                .setText("Home")
                .setTabListener(tabListener);

        mActionbar.addTab(tab);

        /** Creating fragment2 Tab */
        tab = mActionbar.newTab()
                .setText("Notification")
                .setTabListener(tabListener);

        mActionbar.addTab(tab);

        tab = mActionbar.newTab()
                .setText("Request")
                .setTabListener(tabListener);

        mActionbar.addTab(tab);

        tab = mActionbar.newTab()
                .setText("Profile")
                .setTabListener(tabListener);

        mActionbar.addTab(tab);

        tab = mActionbar.newTab()
                .setText("About Us")
                .setTabListener(tabListener);

        mActionbar.addTab(tab);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.homepage, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.logout:
                Intent intent=new Intent(this, Login.class);
                startActivity(intent);
            return true;
            case R.id.Status:
                Intent intent1= new Intent(this,Post.class);
                startActivity(intent1);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}