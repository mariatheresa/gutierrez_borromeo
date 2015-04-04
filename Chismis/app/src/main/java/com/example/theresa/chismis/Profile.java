package com.example.theresa.chismis;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import Adapter.ProfileAdapter;

/**
 * Created by theresa on 4/4/15.
 */
public class Profile extends ListActivity {

    String  mov[]={"hello there!","happy kiddo","#FML","OJT :( ", "I need to get a life","im a zombie","ohhhhhhh my god!" ,"praise the lord!","gosh! emergosh!","summmerrrrrrrrrrrr","adasdhsfasdfkladsgsdagdasgagasgdasgasdgsgasgasgsaagascs","okkk whadahdfdsfsdcsdsdafd fdsdd"};





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.list);



        ProfileAdapter ow = new ProfileAdapter(this, mov);
        View header = getLayoutInflater().inflate(R.layout.from_list_profile, null);
        ListView lv = getListView();

        lv.addHeaderView(header);
        setListAdapter(ow);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.profile, menu);
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
