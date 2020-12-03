package com.afrosin.weather_viewer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WeatherItemAdapter extends RecyclerView.Adapter<WeatherItemAdapter.WeatherItemViewHolder> {

    public static class WeatherItemViewHolder extends RecyclerView.ViewHolder {
        CardView cvTemperatureCard;
        TextView tvWindSpeed;
        TextView tvTemperature;
        TextView tvTime;

        WeatherItemViewHolder(View itemView) {
            super(itemView);
            cvTemperatureCard = itemView.findViewById(R.id.cvTemperatureCard);
            tvWindSpeed = itemView.findViewById(R.id.tvWindSpeed);
            tvTemperature = itemView.findViewById(R.id.tvCurrentTemperature);
            tvTime = itemView.findViewById(R.id.tvTime);
        }
    }

    List<WeatherItem> weatherItem;

    WeatherItemAdapter(List<WeatherItem> weatherItem) {
        this.weatherItem = weatherItem;
    }

    @NonNull
    @Override
    public WeatherItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.temperature_by_hour_item, viewGroup, false);
        return new WeatherItemViewHolder(v);
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherItemViewHolder weatherItemViewHolder, int position) {
        weatherItemViewHolder.tvWindSpeed.setText(weatherItem.get(position).getWindSpeed());
        weatherItemViewHolder.tvTemperature.setText(weatherItem.get(position).getTemperature());
        weatherItemViewHolder.tvTime.setText(weatherItem.get(position).getTime());
    }

    @Override
    public int getItemCount() {
        return weatherItem.size();
    }
}
