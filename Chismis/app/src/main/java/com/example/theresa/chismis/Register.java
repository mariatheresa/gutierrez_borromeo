package com.example.theresa.chismis;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by theresa on 23/3/15.
 */
public class Register extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.register, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.register) {
            Message.message(this, "You have successfully signed up!");
            Intent iN = new Intent(this, Login.class);
            startActivity(iN);
        }
        return super.onOptionsItemSelected(item);
    }

    public void submit (View view){
        Message.message(this, "Submit is under construction.");
    }
}
