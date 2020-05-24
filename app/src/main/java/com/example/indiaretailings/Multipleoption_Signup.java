package com.example.indiaretailings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class Multipleoption_Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multipleoption__signup);
    }

    public void skipscreen(View view) {
        startActivity(new Intent(Multipleoption_Signup.this, Personalise.class));
    }

    public void creatAccount(View view) {
        startActivity(new Intent(Multipleoption_Signup.this, Sign_Up_Screen.class));
    }

    public void LoginWithMobile(View view) {

        startActivity(new Intent(Multipleoption_Signup.this,Mobile_Verification_Screen.class));

    }

    public void signupwith_fasebook(View view) {
    }

    public void signup_with_Google(View view) {
    }

    public void signup_with_Twitter(View view) {
    }

    public void signup_with_Linkedin(View view) {
    }
}
