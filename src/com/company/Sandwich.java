package com.company;

public class Sandwich implements MenuItem {
    private double Price;
    private String Name;
    public Sandwich (double Price, String Name){
        this.Name = Name;
        this.Price = Price;
    }

    public String getName() {
        return Name;
    }


    public double getPrice() {
        return Price;
    }
}
