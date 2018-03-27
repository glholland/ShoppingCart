package com.company;

import java.text.DecimalFormat;

public class Item {
    String name;
    double price;
    int quantity;

    DecimalFormat df = new DecimalFormat("#.00");

    public Item(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    @Override
    public String toString(){
        String s = name + "\t\t$" + df.format(price) + "\t\t\t" + quantity;
        return s;
    }

}
