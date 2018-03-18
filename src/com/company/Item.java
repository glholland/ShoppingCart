package com.company;

public class Item {
    String name;
    double price;
    int quantity;

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

    public String toString(){
        String s = "Item: " + name + "\rQuantity: " + quantity + "\rPrice: " + price;
        return s;
    }

}
