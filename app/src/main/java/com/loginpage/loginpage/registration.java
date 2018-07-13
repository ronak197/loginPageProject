package com.loginpage.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class registration extends AppCompatActivity {

    EditText fname, lname, agetext, uname, pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        fname = (EditText) findViewById(R.id.edt_fname);
        lname = (EditText) findViewById(R.id.edt_lname);
        agetext = (EditText) findViewById(R.id.edt_age);
        uname = (EditText) findViewById(R.id.edt_uname);
        pwd = (EditText) findViewById(R.id.edt_pwd);
    }

    public void onReg(View view){
        String firstname = fname.getText().toString();
        String lastname = lname.getText().toString();
        String age = agetext.getText().toString();
        String username = uname.getText().toString();
        String password = pwd.getText().toString();
        String type = "register";
        backgroundWorker bckwokr = new backgroundWorker(this);
        bckwokr.execute(type,firstname,lastname,age,username,password);
    }

    public void tologin(View view){
        Intent openloginintent = new Intent(this,MainLoginScreen.class);
        startActivity(openloginintent);
    }
}
