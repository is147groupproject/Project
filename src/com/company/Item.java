package com.company;
public class Item {
    //Creates a default constructor for this parent class
    public Item(){}
    //Menu object created
    public static Menu myMenu = new Menu();
    //buyItem method created that returns a double value
    public static double buyItem(int quantity, double price, double cash, int input){
        //purchase does not go through if the snack is out of stock
        if(quantity < 0){
            System.out.println("Sorry, Item Not Available");
            return cash;
        //purchase also does not go through if user doesn't have enough money in the machine
        //if there's not enough money, the user is prompted to enter more using the EnterMoney method from the Money Class
        }
        if(price > cash){
            System.out.println("ERROR: Not Enough Money");
            cash = cash + Money.EnterMoney();
            return cash;
        }
        //Snack is purchased and getAmountMethod is used to subtract price from the user's money in the machine
        System.out.println("Purchasing... ");
        System.out.println("Enjoy your " + myMenu.getNameArray()[input] + "!");
        cash = Item.getAmountLeft(price, cash);
        return cash;
    }
//Overloaded methods created that subtracts a number from an initial value to get the new value
    //one method calculates money remaining, and the other calculates quantity remaining
    public static double getAmountLeft(double value2, double amountLeft) {
        amountLeft = amountLeft - value2;
        return amountLeft;
    }
    //Create a method getAmountLeft that updates the amount of an item still in stock by subtracting 1 from the quantity
    public static int getAmountLeft(int amountLeft, int value2) {
        int num1 = (int)(Math.random()*11);
        /*makes a 10% chance of the snack getting stuck in the machine, and notifies the user if so
        this is still charged as a transaction, but the snack's amount left in stock doesn't change*/
        if(num1<1){
            value2 = 0;
            System.out.println("***Your snack got stuck in machine!!!***");
        }
        amountLeft = amountLeft - value2;
        return amountLeft;
    }
}
//Subclasses created for each type of snack that include a constructor
//Each of these assign a price value from priceArray in the main method
class Pringles extends Item{
    public Pringles(){}
    static double price = myMenu.getPriceArray()[1];
}
class Twix extends Item{
    public Twix(){}
    static double price = myMenu.getPriceArray()[2];
}
class Coke extends Item{
    public Coke(){}
    static double price = myMenu.getPriceArray()[3];
}
class Sprite extends Item{
    public Sprite(){}
    static double price = myMenu.getPriceArray()[4];
}
class Gummies extends Item{
    public Gummies(){}
    static double price = myMenu.getPriceArray()[5];
}