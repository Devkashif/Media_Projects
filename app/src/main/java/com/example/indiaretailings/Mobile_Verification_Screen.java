package com.example.indiaretailings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Mobile_Verification_Screen extends AppCompatActivity {

    EditText etmobilenumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile__verification__screen);

        etmobilenumber = findViewById(R.id.Mobilenum_for_otp);
    }

    public void Send_OTP(View view) {
    }

    public void resend_OTP(View view) {
    }

    public void verify(View view) {
    }
}
