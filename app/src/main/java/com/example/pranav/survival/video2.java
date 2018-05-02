package com.example.pranav.survival;

import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.VideoView;
import android.widget.MediaController;

public class video2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);

        VideoView mVideoView = (VideoView)findViewById(R.id.video1);
        String uriPath = "android.resource://com.example.pranav.survival/"+R.raw.video2;
        Uri uri = Uri.parse(uriPath);
        mVideoView.setVideoURI(uri);
        mVideoView.requestFocus();
        mVideoView.start();
    }

}