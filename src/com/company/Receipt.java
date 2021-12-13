package com.company;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

public class Receipt {
    //Create a method PrintReceipt
    //Use a scanner to scan the user's name and print it at the top of the receipt
    //Print the date using the java library class
    //Print the items the user purchased, their total money spent, and their change(current money in machine)
    public static void PrintReceipt(double cash, String name){
        Menu receiptMenu = new Menu();
        double totalCost = 0;
        System.out.println("\r\n" + "Purchase Information: ");
        java.util.Date date = new Date();
        System.out.println(date.toString());
        System.out.println("*******************************");
        System.out.println("Name: " + name);
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
    public static String getName() {
        System.out.println("Hello, please enter your name: ");
        Scanner nameScanner = new Scanner(System.in);
        String nameInput = nameScanner.next();
        String userName = new String(nameInput);
        return userName.toUpperCase(Locale.ROOT);
    }

}
