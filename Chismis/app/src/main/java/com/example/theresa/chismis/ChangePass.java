package com.example.theresa.chismis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by theresa on 26/3/15.
 */
public class ChangePass extends ActionBarActivity {
    private EditText oldPass;
    private EditText newPass;
    private EditText retold;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_password);


    }


    private boolean isValidPassword(String pass) {
        if (pass != null && pass.length() > 6) {
            return true;
        }
        return false;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.change) {

            oldPass = (EditText) findViewById(R.id.old);
            newPass = (EditText) findViewById(R.id.newp);
            retold=(EditText) findViewById(R.id.retypeNew);

            findViewById(R.id.changePass).setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    final String pass = oldPass.getText().toString();
                    final String newp = newPass.getText().toString();
                    final String rep = retold.getText().toString();

                    if (pass!="123456") {
                        oldPass.setError("wrong password");
                    }

                    if (!isValidPassword(newp)) {
                         newPass.setError("Invalid Password");
                    }else{
                         if (!isValidPassword(rep)) {
                                retold.setError("Invalid Password");
                         }else {
                             if (newPass != retold) {
                                 retold.setError("password not much");
                             }
                         }
                    }
                }
            });

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.changepass, menu);
        return true;
    }




}
