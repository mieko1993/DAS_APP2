package com.team16.antenna.trend.drivingassistancesystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class Introduction4 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction4);
    }

    //When the Button Next is clicked
    public void onClickButtonStartIntroduction(View view){
        Intent intent=new Intent(Introduction4.this,DAS.class);
        startActivity(intent);
    }

    //when BACK button is clicked
    public void onClickButtonBack4(View view){
        Intent i=new Intent(Introduction4.this,Introduction3.class);
        startActivity(i);
    }
}
