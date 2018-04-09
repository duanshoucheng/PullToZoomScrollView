package com.darren.zoomview.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.darren.zoomview.library.PullToZoomScrollView;

public class MainActivity extends AppCompatActivity {
    private PullToZoomScrollView pullToZoomScrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
