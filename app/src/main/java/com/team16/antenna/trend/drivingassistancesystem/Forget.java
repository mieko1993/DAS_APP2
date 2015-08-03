package com.team16.antenna.trend.drivingassistancesystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class Forget extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget);
    }

    //When the textView SEND is clicked
    public void onClickButtonSend(View view){
        Intent intent=new Intent(Forget.this,Forget2.class);
        startActivity(intent);
    }


}
