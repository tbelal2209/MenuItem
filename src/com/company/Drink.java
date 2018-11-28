package com.company;

public class Drink implements MenuItem {
    private double Price;
    private String Name;
    public Drink (double Price, String Name){
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
