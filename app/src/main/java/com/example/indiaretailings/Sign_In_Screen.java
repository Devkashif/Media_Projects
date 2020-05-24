package com.example.indiaretailings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

public class Sign_In_Screen extends AppCompatActivity {

    EditText et_Uname_orEmail,et_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__in__screen);

        et_Uname_orEmail = findViewById(R.id.loginemail);
        et_pass = findViewById(R.id.loginpass);

    }

    public void SigninUser(View view) {
        startActivity(new Intent(Sign_In_Screen.this,Personalise.class));
    }

    public void CreateNewAccount(View view) {
        startActivity(new Intent(Sign_In_Screen.this,Sign_Up_Screen.class));
    }
}
