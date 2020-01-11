package com.example.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mDessertsRV;
    private List<Dessert> mDesserts;
    private DessertsAdapter mDessertsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setupDesserts();
    }

    private void init(){
        mDessertsRV = findViewById(R.id.dessertsRV);
        mDessertsAdapter = new DessertsAdapter();
        mDesserts = DessertFactory.getInstance().getDesserts();
    }

    private void setupDesserts(){
        mDessertsRV.setAdapter(mDessertsAdapter);
        mDessertsRV.setLayoutManager(
                new LinearLayoutManager(this)
        );
    }

    class DessertsAdapter extends RecyclerView.Adapter<DessertVH>{

        @NonNull
        @Override
        public DessertVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(MainActivity.this).inflate(
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
}
