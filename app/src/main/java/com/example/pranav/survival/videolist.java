package com.example.pranav.survival;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class videolist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videolist);
    }

    public void onClickv1(View v) {

        Intent intent = new Intent(this,Videos.class);
        startActivity(intent);

    }

    public void onClickv2(View v) {

        Intent intent = new Intent(this,video2.class);
        startActivity(intent);

    }

    public void onClickv3(View v) {

        Intent intent = new Intent(this,video3.class);
        startActivity(intent);

    }
}
