package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {
        int choice = 1, quantity;
        String name;
        double price;

        DecimalFormat df = new DecimalFormat("#.00");
        ShoppingCart cart = new ShoppingCart(5);
        Scanner scan = new Scanner(System.in);


        System.out.println("Welcome to the Virtual Shopping Cart");
        System.out.println("Please choose from one of the following options!");

        while (choice != 2) {

            System.out.println("\nOptions\n---------------------------------\n1. Add item to cart.\n2. Quit.");
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
                System.out.print("");
                //Print the Cart to display
                System.out.println("---------------------------------\nShopping Cart");
                System.out.print("---------------------------------\nItem\t\tUnit Price\t\tQuantity\t\n");
                System.out.println(cart);
                System.out.print("Total is $" + df.format(cart.getCartTotal()) + "\n---------------------------------\n");
                break;
            case 2:
                break;

            }

        }
        System.out.println("Thanks for shopping today!!! Make sure to spend more next time!");
        System.out.println("Please pay $" + df.format(cart.getCartTotal()) + ".");
    }
}
