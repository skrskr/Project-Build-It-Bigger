package com.mohamed.androidjokelib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);
        textView = (TextView) findViewById(R.id.tv_display_joke);
        Intent intent= getIntent();
        if(intent!=null){
            if(intent.hasExtra("joke")){
                textView.setText(intent.getStringExtra("joke"));
            }else
                textView.setText("No Joke Found");
        }
    }
}
