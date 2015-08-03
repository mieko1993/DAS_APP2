package com.team16.antenna.trend.drivingassistancesystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class Introduction2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction2);
    }

    //When the Button Next is clicked
    public void onClickButtonNext2(View view){
        Intent intent=new Intent(Introduction2.this,Introduction3.class);
        startActivity(intent);
    }

    //when BACK button is clicked
    public void onClickButtonBack2(View view){
        Intent i=new Intent(Introduction2.this,Introduction.class);
        startActivity(i);
    }
}
