package com.example.pay_slip_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InformationMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_menu);
    }

    public void onClickSupplementInfoButton(View view){
        Intent intent = new Intent(this, SupplementInformation.class); //supplement case activity
        startActivity(intent);
    }

    public void onClickGeneralInfoButton(View view){
        Intent intent = new Intent(this, GeneralInformation.class);
        startActivity(intent);
    }

    public void onClickInfoMenuBackButton(View view){
        onBackPressed();
    }
}
