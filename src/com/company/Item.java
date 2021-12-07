package com.company;
public class Item {
    //Create a default constructor for this parent class
    //Contains 3 methods that are passed down to subclasses,

    //Create a BuyItem method that has the parameters cash in the machine, quantity of the item, and price
        /*if the quantity of the item is already < 1 or if the cash is less than price, this method will return
        the original value of cash and an error message will appear since the transaction is invalid*/
        //if the error is because there wasn't enough money, invoke Money.enterMoney
        //if not, the method assigns the value of cash by invoking the first getAmountLeft method and prints a purchase confirmation

    //Create a method getAmountLeft that updates money still in the machine by returning the current amount of money minus price

    //Create a method getAmountLeft that updates the amount of an item still in stock by subtracting 1 from the quantity
        //Only do so if the quantity of that object is greater than 0 and the cash is greater than price If not, return the first quantity.
        /*Also invoke the math.random class to create a small chance of the snack getting stuck in the machine.
        If this happens, return original quantity and print a message to let the user know what happened.
        (this is still charged as a transaction though)
         */
}
//Create Subclasses for each type of snack that include a constructor
    //have each of these assign a static price value from the corresponding value in priceArray in the main method
