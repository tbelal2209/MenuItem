package com.company;

public class Trio implements MenuItem {

    private String Name;
    public Trio ( String Name){
        this.Name = Name;

    }

    public Trio(Sandwich reuben, Salad waldorf, Drink icedTea) {
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public double getPrice() {
        return 0;
    }


}
