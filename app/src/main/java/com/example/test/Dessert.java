package com.example.test;

public class Dessert {

    private String mName;
    private int mCalories;

    public Dessert(String name, int calories) {
        mName = name;
        mCalories = calories;
    }

    public Dessert(String name) {
        this(name, 0);
    }

    public String getName() {
        return mName;
    }

    public int getCalories() {
        return mCalories;
    }
}
