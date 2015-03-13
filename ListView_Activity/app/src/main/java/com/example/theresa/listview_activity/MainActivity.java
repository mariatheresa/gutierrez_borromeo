package com.example.theresa.listview_activity;

import android.app.ListActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FeatureItemAdapter ow = new FeatureItemAdapter(this, FeatureItemsGenerator.generateFeatureItemLIst());
        setListAdapter(ow);
    }


}
