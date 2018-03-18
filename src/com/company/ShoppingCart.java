package com.company;

public class ShoppingCart {
    int itemCount, capacity;
    double totalPrice = 0.0;
    Item[] cart;

    public ShoppingCart (int cartInit) {
        //Initialize new cart using this constructor
        cart = new Item[cartInit];
        itemCount = 0;
        capacity = 5;
        totalPrice = 0;
    }
    public void addToCart(String name, double price, int quantity){
        Item item = new Item(name, price, quantity);
        if(itemCount < cart.length) {
            cart[itemCount] = item;
            itemCount++;
        }else{
            increaseSize();
            cart[itemCount] = item;
            itemCount++;
        }
    }

    public void increaseSize(){
        Item[] temp = new Item[cart.length + 3];

        System.out.println("Increased cart size.");
        for (int i = 0; i < cart.length; i++) {
            temp[i] = cart[i];
        }

        cart = temp;
    }

    public double getCartTotal(){
        for(int i =0; i < cart.length; i++){
            totalPrice =+ cart[i].getQuantity() * cart[i].getPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        String s = cart.toString();
        return s;
    }
}
