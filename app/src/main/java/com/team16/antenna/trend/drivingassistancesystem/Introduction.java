package com.team16.antenna.trend.drivingassistancesystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class Introduction extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
    }

    //When the Button Next is clicked
    public void onClickButtonNext1(View view){
        Intent intent=new Intent(Introduction.this,Introduction2.class);
        startActivity(intent);
    }
}
