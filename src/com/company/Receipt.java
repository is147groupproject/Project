package com.company;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

public class Receipt {
    //Method created that prints the user's transaction information
    //prints User's name, the date, snacks purchased, total cost, and change
    public static void PrintReceipt(double cash, String name){
        //Menu object created to access prices
        Menu receiptMenu = new Menu();
        System.out.println("\r\n" + "Purchase Information: ");
        java.util.Date date = new Date();
        System.out.println(date.toString());
        System.out.println("*******************************");
        System.out.println("Name: " + name);

        //Loop used to record and print the total purchases of the user
        double totalCost = 0;
        for(int i = 1; i < 6; i++){
            int quantityBought = Main.initialQuantityArray[i] - Main.quantityArray[i];
            double itemCost = (receiptMenu.getPriceArray()[i]*quantityBought);
            totalCost += itemCost;
            if(quantityBought > 0) {
                System.out.println(receiptMenu.getNameArray()[i]+" Purchased: "+quantityBought+"x, "+"($"+itemCost+") Total");
            }
        }
        System.out.println("Total Cost: $" + totalCost);
        System.out.println("Change: $" + cash);
        System.out.println("Have a good day!");
    }
    //method is created that prompts the user to enter their name
    public static String getName() {
        System.out.println("Hello, please enter your name: ");
        Scanner nameScanner = new Scanner(System.in);
        String nameInput = nameScanner.next();
        //String object created
        String userName = new String(nameInput);
        //returns the name in all caps
        return userName.toUpperCase(Locale.ROOT);
    }

}
