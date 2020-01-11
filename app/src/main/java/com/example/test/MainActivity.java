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
        mDessertsAdapter = new DessertsAdapter(
                this,
                DessertFactory.getInstance().getDesserts()
        );
    }

    private void setupDesserts(){
        mDessertsRV.setAdapter(mDessertsAdapter);
        mDessertsRV.setLayoutManager(
                new LinearLayoutManager(this)
        );
    }
}
