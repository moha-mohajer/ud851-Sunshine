package com.example.android.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by MIU on 11/01/2018.
 */

// Within ForecastAdapter.java /////////////////////////////////////////////////////////////////
// X TODO (15) Add a class file called ForecastAdapter
// X TODO (22) Extend RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>
public class ForecastAdapter extends  RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>{

// X TODO (23) Create a private string array called mWeatherData
    private  String[] mWeatherData;

    // X TODO (47) Create the default constructor (we will pass in parameters in a later lesson)
    public ForecastAdapter() {

    }

    // X TODO (16) Create a class within ForecastAdapter called ForecastAdapterViewHolder
    // X TODO (17) Extend RecyclerView.ViewHolder
    public class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {

        // Within ForecastAdapterViewHolder ///////////////////////////////////////////////////////////
        // X TODO (18) Create a public final TextView variable called mWeatherTextView
        public final TextView mWeatherTextView;

        // X TODO (19) Create a constructor for this class that accepts a View as a parameter
        public ForecastAdapterViewHolder(View view) {
            // X TODO (20) Call super(view) within the constructor for ForecastAdapterViewHolder
            super(view);

            // X TODO (21) Using view.findViewById, get a reference to this layout's TextView and save it to mWeatherTextVie
            mWeatherTextView = (TextView) view.findViewById(R.id.tv_weather_data);

        }
        // Within ForecastAdapterViewHolder ///////////////////////////////////////////////////////
    }


// X TODO (24) Override onCreateViewHolder
    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // X TODO (25) Within onCreateViewHolder, inflate the list item xml into a view
        //View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.forecast_list_item, parent, false);
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.forecast_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);

        // X TODO (26) Within onCreateViewHolder, return a new ForecastAdapterViewHolder with the above view passed in as a parameter
        return new ForecastAdapterViewHolder(view);
    }


    // X TODO (27) Override onBindViewHolder
    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder holder, int position) {
        // X TODO (28) Set the text of the TextView to the weather for this list item's position
        // holder.mWeatherTextView.setText(mWeatherData[position]);
        String weatherForThisDay = mWeatherData[position];
        holder.mWeatherTextView.setText(weatherForThisDay);


    }

    // X TODO (29) Override getItemCount
    @Override
    public int getItemCount() {

        // X TODO (30) Return 0 if mWeatherData is null, or the size of mWeatherData if it is not null
        if (mWeatherData==null) return 0;
        return mWeatherData.length;
    }


    // X TODO (31) Create a setWeatherData method that saves the weatherData to mWeatherData
    public void setmWeatherData(String[] wData) {
        mWeatherData = wData;
        // X TODO (32) After you save mWeatherData, call notifyDataSetChanged
        notifyDataSetChanged();
    }
}
