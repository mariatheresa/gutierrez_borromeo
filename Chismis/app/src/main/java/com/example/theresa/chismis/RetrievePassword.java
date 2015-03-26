package com.example.theresa.chismis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by theresa on 23/3/15.
 */
public class RetrievePassword extends ActionBarActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.retrievepassword);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.retrievepassword, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.retrieve) {
            Message.message(this, "You have successfully reset your password!");
            Intent iN = new Intent(this, Login.class);
            startActivity(iN);
        }
        return super.onOptionsItemSelected(item);
    }
}
