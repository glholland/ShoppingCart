package com.company;

import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {
        int choice = 1, quantity;
        String name;
        double price;


        ShoppingCart cart = new ShoppingCart(5);
        Scanner scan = new Scanner(System.in);


        System.out.println("Welcome to the Virtual Shopping Cart");
        System.out.println("Please choose from one of the following options!");

        while (choice != 2) {
        System.out.println("1. Add item to cart.\r2. Quit.");
        choice = scan.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Name of item to enter: ");
                    name = scan.next();
                    System.out.println("");
                    System.out.print("Quantity of item to purchase: ");
                    quantity = scan.nextInt();
                    System.out.println("");
                    System.out.println("Price of item: ");
                    price = scan.nextDouble();
                    cart.addToCart(name, price, quantity);
                    break;
                case 2:
                    break;
            }
        }
        System.out.println("Please pay $" + cart.getCartTotal() + ".");
    }
}
