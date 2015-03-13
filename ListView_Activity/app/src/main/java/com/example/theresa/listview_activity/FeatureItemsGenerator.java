package com.example.theresa.listview_activity;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by theresa on 28/2/15.
 */
public class FeatureItemsGenerator {
    public static ArrayList<FeatureItem> generateFeatureItemLIst(){
        ArrayList<FeatureItem> list=new ArrayList<FeatureItem>();
        list.add(new FeatureItem("Apple Watch", R.drawable.apple_watch, "Smartwatch","IOS"));
        list.add(new FeatureItem("HTS Nexus 9", R.drawable.htc_nexus_9,  "Tablet","Android"));
        list.add(new FeatureItem("HTC One M8", R.drawable.htc_one_m8, "Smartphone","Android"));
        list.add(new FeatureItem("Ipad Air 2",R.drawable.ipad_air_2,"Tablet","IOS"));
        list.add(new FeatureItem("Iphone 6",R.drawable.iphone6,"Smartphone","IOS Wear?"));
        list.add(new FeatureItem("Moto 360",R.drawable.moto_360,"Smartwatch","Android Wear"));
        list.add(new FeatureItem("Samsung S5",R.drawable.samsung_s5,"Smartphone","Android"));

        return list;
    }


}
