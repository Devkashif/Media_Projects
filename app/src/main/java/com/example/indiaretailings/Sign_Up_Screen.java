package com.example.indiaretailings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class Sign_Up_Screen extends AppCompatActivity {

    private EditText etfullname,etemail,etmobile,etcompany,etindustry,etpsspecify,etcity;
    LinearLayout desiglayout;
    ImageView showlist;
    Spinner designationspinner,countryspinner;
    String[] designation = {"Select Your Designation","Designation","Web Designer","CEO","President","Vice President","Director","Director Technology", "Business Analyst","Other"};
    String[] countrylist = {"Select Your Country","India","America","Brazil","Canada","China"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__up__screen);

        etfullname = findViewById(R.id.fullname);
        etemail = findViewById(R.id.email);
        etmobile = findViewById(R.id.mobilenum);
        etcompany = findViewById(R.id.company);
        etindustry = findViewById(R.id.industry);
        etpsspecify = findViewById(R.id.plsspecify);
        etcity = findViewById(R.id.city);

        countryspinner = findViewById(R.id.countryspinner);
        designationspinner = findViewById(R.id.designation);

        designationspinner.setAdapter(new ArrayAdapter<String>(Sign_Up_Screen.this, android.R.layout.simple_dropdown_item_1line,designation));
        countryspinner.setAdapter(new ArrayAdapter<String>(Sign_Up_Screen.this,android.R.layout.simple_dropdown_item_1line,countrylist));
    }

    public void openSignIn(View view) {
        startActivity(new Intent(Sign_Up_Screen.this,Sign_In_Screen.class));
    }

    public void Create_account(View view) {
        startActivity(new Intent(Sign_Up_Screen.this,Personalise.class));
    }
}

