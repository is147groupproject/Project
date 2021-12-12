package com.company;
public class Item {
    //Create a default constructor for this parent class
    public Item(){}
    //Contains 3 methods that are passed down to subclasses,
    //Create a BuyItem method that has the parameters cash in the machine, quantity of the item, and price
     /*if the quantity of the item is already < 1 or if the cash is less than price, this method will return
        the original value of cash and an error message will appear since the transaction is invalid*/
    //if the error is because there wasn't enough money, invoke Money.enterMoney
    //if not, the method assigns the value of cash by invoking the first getAmountLeft method and prints a purchase confirmation
    public static Menu myMenu = new Menu();
    public static double buyItem(int quantity, double price, double cash, int input){
        if(quantity < 0){
            System.out.println("Sorry, Item Not Available");
            return cash;
        }
        if(price > cash){
            System.out.println("ERROR: Not Enough Money");
            cash = cash + Money.EnterMoney();
            return cash;
        }
        System.out.println("Purchasing... ");
        Menu myMenu = new Menu();
        System.out.println("Enjoy your " + myMenu.getNameArray()[input] + "!");
        cash = Item.getAmountLeft(price, cash);
        return cash;
    }
    //Create a method getAmountLeft that updates money still in the machine by returning the current amount of money minus price
    public static double getAmountLeft(double value2, double amountLeft) {
        amountLeft = amountLeft - value2;
        return amountLeft;
    }
    //Create a method getAmountLeft that updates the amount of an item still in stock by subtracting 1 from the quantity
    public static int getAmountLeft(int amountLeft, int value2) {
        /*STILL TO BE DONE-invoke the math.random class to create a small chance of the snack getting stuck in the machine.
        If this happens, return original quantity and print a message to let the user know what happened.
        (this is still charged as a transaction though)*/
        amountLeft = amountLeft - value2;
        return amountLeft;
    }
}
//Create Subclasses for each type of snack that include a constructor
//have each of these assign a static price value from the corresponding value in priceArray in the main method
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