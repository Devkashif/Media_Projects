package com.example.indiaretailings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class Sigin_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigin__page);

    }

    public void Sigin(View view) {

        startActivity(new Intent(Sigin_Page.this,Sign_In_Screen.class));
    }

    public void Signup(View view) {
        startActivity(new Intent(Sigin_Page.this,Multipleoption_Signup.class));
    }

    public void skip(View view) {
        startActivity(new Intent(Sigin_Page.this,Personalise.class));
    }
}
