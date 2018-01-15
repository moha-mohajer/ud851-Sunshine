package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private String mForecast;
    private TextView mWeatherDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // TODO (2) Display the weather forecast that was passed from MainActivity
        mWeatherDisplay = (TextView) findViewById(R.id.tv_display_weather);
        
        Intent intent_that_started_this_Activity = getIntent();

        if (intent_that_started_this_Activity != null) {
            if (intent_that_started_this_Activity.hasExtra(Intent.EXTRA_TEXT)) {
                mForecast = intent_that_started_this_Activity.getStringExtra(Intent.EXTRA_TEXT);
                mWeatherDisplay.setText(mForecast);
            }
        }
    }
}