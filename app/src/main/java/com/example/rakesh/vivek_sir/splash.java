package com.example.rakesh.vivek_sir;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

import java.io.File;

public class splash extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        VideoView videoView = (VideoView)findViewById(R.id.videoView);
        Uri video = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.six);
        videoView.setVideoURI(video);

        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                Intent myIntent = new Intent(splash.this, MainActivity.class);
                //myIntent.putExtra("key", "fill_dcr"); //Optional parameters
                splash.this.startActivity(myIntent);
                finish();
            }
        });

        videoView.start();

    }
}
