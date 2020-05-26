package com.example.mylistviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class CustomAdapter extends ArrayAdapter<String> {
    public CustomAdapter(@NonNull Context context, String[] Fruits) {
        super(context, R.layout.custom_row,Fruits);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater myInflater = LayoutInflater.from(getContext());
        View customView = myInflater.inflate(R.layout.custom_row, parent,false);

        String singleFoodItem = getItem(position);
        TextView textView = customView.findViewById(R.id.textView);
        ImageView imageView = customView.findViewById(R.id.imageView);

        textView.setText(singleFoodItem);
        imageView.setImageResource(R.drawable.bird1);
        return customView;
    }
}
