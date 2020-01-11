package com.example.test;

import java.util.ArrayList;
import java.util.List;

public class DessertFactory {

    private static DessertFactory sDessertFactory;

    public static DessertFactory getInstance() {

        if(sDessertFactory == null){
            sDessertFactory = new DessertFactory();
        }
        return sDessertFactory;
    }

    private List<Dessert> mDesserts;

    private DessertFactory(){
        mDesserts = new ArrayList<>();
        populateDesserts();
    }

    private void populateDesserts(){
        mDesserts.add(new Dessert("Cupcake", 12));
        mDesserts.add(new Dessert("Doughnut", 10));
        mDesserts.add(new Dessert("Eclairs"));
        mDesserts.add(new Dessert("Froyo", 1));
        mDesserts.add(new Dessert("Gingerbread", 1));
        mDesserts.add(new Dessert("Honeycomb", 1));
        mDesserts.add(new Dessert("Icecream Sandwich", 1));
        mDesserts.add(new Dessert("Jellybean", 1));
        mDesserts.add(new Dessert("Kitkat", 1));
        mDesserts.add(new Dessert("Lollypop", 1));
        mDesserts.add(new Dessert("Marshmallow", 1));
        mDesserts.add(new Dessert("Nougat", 1));
        mDesserts.add(new Dessert("Oreo", 1));
        mDesserts.add(new Dessert("Pie", 1));
    }



    public List<Dessert> getDesserts(){
        return mDesserts;
    }

}
