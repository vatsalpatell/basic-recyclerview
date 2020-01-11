package com.example.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class DessertsAdapter extends RecyclerView.Adapter<DessertVH>{

    private Context mContext;
    private List<Dessert> mDesserts;

    public DessertsAdapter(Context context, List<Dessert> desserts){
        mContext = context;
        mDesserts = desserts;
    }

    @NonNull
    @Override
    public DessertVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(
                R.layout.item_dessert,
                parent,
                false
        );
        return new DessertVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DessertVH holder, int position) {
        holder.bindDessert(
                mDesserts.get(position)
        );
    }

    @Override
    public int getItemCount() {
        return mDesserts.size();
    }
}
