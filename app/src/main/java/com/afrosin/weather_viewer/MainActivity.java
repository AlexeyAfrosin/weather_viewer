package com.afrosin.weather_viewer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<WeatherItem> weatherItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvTemperatureByHour = findViewById(R.id.rvTemperatureByHour);
        Context context = this.getApplicationContext();
        LinearLayoutManager rvTemperatureByHourLLM = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        rvTemperatureByHour.setLayoutManager(rvTemperatureByHourLLM);

        initializeData();

        WeatherItemAdapter weatherItemAdapter = new WeatherItemAdapter(weatherItems);
        rvTemperatureByHour.setAdapter(weatherItemAdapter);
    }

    private void initializeData(){
        weatherItems = new ArrayList<>();
        weatherItems.add(new WeatherItem("-5", "5", this.getString(R.string.cloudy), "5:00"));
        weatherItems.add(new WeatherItem("-6", "6", this.getString(R.string.cloudy), "6:00"));
        weatherItems.add(new WeatherItem("-10", "3", this.getString(R.string.cloudy), "7:00"));
        weatherItems.add(new WeatherItem("-11", "2", this.getString(R.string.cloudy), "8:00"));
        weatherItems.add(new WeatherItem("-12", "0", this.getString(R.string.cloudy), "9:00"));
        weatherItems.add(new WeatherItem("-15", "1", this.getString(R.string.cloudy), "10:00"));
        weatherItems.add(new WeatherItem("-16", "4", this.getString(R.string.cloudy), "11:00"));
    }

}