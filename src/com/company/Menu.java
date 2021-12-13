package com.company;
public class Menu {
    //Private arrays created for snack prices and names
    private double[] priceArray = {0, 3.99, 2.49, 1.99, 1.99, 3.50};
    private String[] nameArray = {null, "Pringles", "Twix", "Coke", "Sprite", "Gummies"};

    //getter methods created to let other classes access the data
    public double[] getPriceArray() {
        return this.priceArray;
    }
    public String[] getNameArray() {
        return this.nameArray;
    }
    //The menu is printed with a loop, prints selection number, name, price, and quantity left for each snack
    public void PrintMenu() {
        for (int i = 1; i < 6; i++) {
            System.out.println("\r\n" + i + " for " + nameArray[i] + " ($" + priceArray[i] + "), " + Main.quantityArray[i] + " left");
            for (int j = 0; j < 30; j++) {
                System.out.printf("*");
            }
        }
    }
}