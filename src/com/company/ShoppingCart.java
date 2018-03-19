package com.company;

public class ShoppingCart {
    //Initialize variables to be used.
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
        //Passes args to another constructor, creates the Item.
        Item item = new Item(name, price, quantity);
        //Checks to see if the itemCount is at the correct spot for the size of the array.
        if(itemCount < cart.length) {
            //Adds the newly created item to the array
            cart[itemCount] = item;
            //Increment the itemCount
            itemCount++;
        }else{
            //If the index of the array is larger or equal to the length
            increaseSize();
            //Then add the item to the new bigger array.
            cart[itemCount] = item;
            //Increment
            itemCount++;
        }
    }

    public void increaseSize(){
        //Creates a new Item array to the length of the current size + 3
        Item[] temp = new Item[cart.length + 3];
        System.out.println("Increased cart size.");
        //Copies old array to new temp array.
        for (int i = 0; i < cart.length; i++) {
            temp[i] = cart[i];
        }
        //Points the name of the old array to the new temp array so we can access it using the same name.
        cart = temp;
    }

    public double getCartTotal(){
        totalPrice = 0.0;
        for(Item i : cart){
            if(i == null){
                break;
            }
            totalPrice += i.getPrice() * i.getQuantity();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        String s = "";
        for(int i = 0; i < cart.length; i++){
            if(cart[i] == null){
                break;
            }
            System.out.print(cart[i]);
            System.out.print("\n");
        }return s;
    }
}
