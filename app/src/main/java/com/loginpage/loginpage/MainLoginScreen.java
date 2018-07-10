package com.loginpage.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainLoginScreen extends AppCompatActivity {

    EditText userText, pwdText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login_screen);

    userText = (EditText) findViewById(R.id.usernameText);
    pwdText = (EditText) findViewById(R.id.passwordText);
    }

    public void onLogin(View view){
        String username = userText.getText().toString();
        String password = pwdText.getText().toString();
        String type = "login";

        backgroundWorker bckwokr = new backgroundWorker(this);
        bckwokr.execute(type,username,password);
    }

    public void openReg(View view){
        Intent openregintent = new Intent(this,registration.class);
        startActivity(openregintent);
    }
}
