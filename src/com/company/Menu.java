package com.company;
public class Menu {
    //print a "menu" that displays each snack's name, number to enter to select it, price, and amount in stock.
    //make sure to input the amount left as its array index because it can change
    private double[] priceArray = {0, 3.99, 2.49, 1.99, 1.99, 3.50};
    private String[] nameArray = {null, "Pringles", "Twix", "Coke", "Sprite", "Gummies"};

    public double[] getPriceArray() {
        return this.priceArray;
    }
    public String[] getNameArray() {
        return this.nameArray;
    }
    public void PrintMenu() {
        Pringles menuPringles = new Pringles();
        for (int i = 1; i < 6; i++) {
            System.out.println("\r\n" + i + " for " + nameArray[i] + " ($" + priceArray[i] + "), " + Main.quantityArray[i] + " left");
            for (int j = 0; j < 30; j++) {
                System.out.printf("*");
            }
        }
    }
}