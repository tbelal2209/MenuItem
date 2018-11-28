package com.company;

public class Salad implements MenuItem {
    private double Price;
    private String Name;
    public Salad (double Price, String Name){
        this.Name = Name;
        this.Price = Price;
    }
    @Override
    public String getName() {
        return Name;
    }

    @Override
    public double getPrice() {
        return Price;
    }
}
