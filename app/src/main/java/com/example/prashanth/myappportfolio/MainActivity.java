package com.example.prashanth.myappportfolio;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }





    public void onSpotify(View v) {
        Toast.makeText(getApplicationContext(), "This button will launch my Spotify Streamer app!", Toast.LENGTH_SHORT).show();
    }

    public void onScores(View v){
        Toast.makeText(getApplicationContext(),"This button will launch my Scores app!",Toast.LENGTH_SHORT).show();

    }

    public void onLibrary(View v){
        Toast.makeText(getApplicationContext(),"This button will launch my Library app!",Toast.LENGTH_SHORT).show();
    }

    public void onBuild(View v){
        Toast.makeText(getApplicationContext(),"This button will launch my Build it Bigger app!",Toast.LENGTH_SHORT).show();
    }

    public void onXYZ(View v){
        Toast.makeText(getApplicationContext(),"This button will launch my XYZ Reader app!",Toast.LENGTH_SHORT).show();
    }

    public void onCapstone(View v){
        Toast.makeText(getApplicationContext(),"This button will launch my Capstone app!",Toast.LENGTH_SHORT).show();
    }

}
