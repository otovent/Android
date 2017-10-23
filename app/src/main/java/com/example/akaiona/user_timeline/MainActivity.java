package com.example.akaiona.user_timeline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.empty_timeline);
    }

    public void Profile(View v) {
        Intent i = new Intent();
        i.setClass(this,User_Profile.class);
        startActivity(i);
    }
}
