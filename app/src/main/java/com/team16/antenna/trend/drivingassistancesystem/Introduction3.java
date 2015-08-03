package com.team16.antenna.trend.drivingassistancesystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class Introduction3 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction3);
    }

    //When the Button Next is clicked
    public void onClickButtonNext3(View view){
        Intent intent=new Intent(Introduction3.this,Introduction4.class);
        startActivity(intent);
    }

    //when BACK button is clicked
    public void onClickButtonBack3(View view){
        Intent i=new Intent(Introduction3.this,Introduction2.class);
        startActivity(i);
    }
}
