package com.company;
public class Menu {
    //print a "menu" that displays each snack's name, number to enter to select it, price, and amount in stock.
    //make sure to input the amount left as its array index because it can change
    public static void PrintMenu() {
        System.out.printf("Please select one of the following snacks:\n" +
                "1 for Pringles ($3.99) " + Main.aPringles + " left\n" +
                "2 for Twix ($2.49) " + Main.aTwix + " left\n" +
                "3 for Coke ($1.99) " + Main.aCoke + " left\n" +
                "4 for Sprite ($1.99) " + Main.aSprite + " left\n" +
                "5 for gummies ($3.50) " + Main.aGummies + " left)\n");
    }
}

