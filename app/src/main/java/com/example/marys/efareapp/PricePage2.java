package com.example.marys.efareapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class PricePage2 extends AppCompatActivity {

    private TextView myswitch;
    private Switch switchStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price_page2);
        myswitch = (TextView) findViewById(R.id.myswitch);
        switchStatus = (Switch) findViewById(R.id.switchStatus);

        //set the switch to ON
        switchStatus.setChecked(true);
        //attach a listener to check for changes in state
        switchStatus.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {

                if (isChecked) {
                    switchStatus.setText("10.00 a.m");
                } else {
                    switchStatus.setText("7.00 p.m");
                }

            }
        });

    }



    public void backPage(View view) {
        Intent intent = new Intent(this,FirstPage.class);
        startActivity(intent);
    }

    public void backPage2(View view) {
        Intent intent = new Intent(this,ListBuses2.class);
        startActivity(intent);
    }



}
