package com.example.test;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class DessertVH extends RecyclerView.ViewHolder{

    private TextView mDessertNameTV, mDessertCaloriesTV;

    public DessertVH(@NonNull View itemView) {
        super(itemView);
        mDessertNameTV = itemView.findViewById(R.id.dessertNameTV);
        mDessertCaloriesTV = itemView.findViewById(R.id.dessertCaloriesTV);
    }

    public void bindDessert(Dessert dessert){
        mDessertNameTV.setText(dessert.getName());
        mDessertCaloriesTV.setText(String.valueOf(dessert.getCalories()));
    }
}
