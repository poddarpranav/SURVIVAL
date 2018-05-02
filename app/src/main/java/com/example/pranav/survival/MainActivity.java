package com.example.pranav.survival;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


            public void onClick1(View v) {

                Intent intent = new Intent(this,prepmain.class);
                startActivity(intent);

            }


    public void onClick3(View v) {

        Intent intent = new Intent(this,Forest.class);
        startActivity(intent);

    }

    public void onClick2(View v) {

        Intent intent = new Intent(this,Desert.class);
        startActivity(intent);

    }

    public void onClick4(View v) {

        Intent intent = new Intent(this,Cold.class);
        startActivity(intent);

    }
    public void onClick5(View v) {

        Intent intent = new Intent(this,FORUM.class);
        startActivity(intent);

    }
    public void onClick6(View v) {

        Intent intent = new Intent(this,videolist.class);
        startActivity(intent);

    }
}
