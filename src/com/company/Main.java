package com.company;
import java.util.Scanner;
public class Main {
    /*Create a variable for money in the machine, and assign a value using the
    InsertMoney method from Money Class*/
    public static double [] priceArray = {0, 3.99, 2.49, 1.99, 1.99, 3.50};
    public static String [] nameArray = {null, "Pringles", "Twix", "Coke", "Sprite", "Gummies"};
    public static int aPringles = 2;
    public static int aTwix = 3;
    public static int aCoke = 1;
    public static int aSprite = 3;
    public static int aGummies = 2;
    public static int total = 11;
    public static void main(String[] args) {
        double machineMoney = Money.EnterMoney();
        Scanner scanner = new Scanner(System.in);

        //Main loop starts
        //In each iteration of the loop it will...
        //Prompt the user to make a selection and display the available snacks with their prices and amount in stock
        //Display how much spendable money the user has in the machine
        //Use a scanner and a switch statement to let the user make a selection (switch statement values shown in "Menu" class

        //Each time a snack is selected, in the body of the switch statement case...
        //Create an object of the specific snack from the Item subclasses
        /*Use this object to invoke getAmountLeft (quantity) and BuyItem with the cash in the machine,
        its price, and its current quantity as parameters*/

        for (int i = 0; i < 1;) {
            Menu.PrintMenu();
            System.out.println("Money in Machine: $" + machineMoney);
            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    Pringles pringles1 = new Pringles();
                    aPringles = pringles1.getAmountLeft(aPringles, Pringles.price, machineMoney);
                    machineMoney = pringles1.buyItem(aPringles, Pringles.price, machineMoney, selection);
                    if(aPringles < 0){
                        aPringles = 0;
                    }
                    break;
                case 2:
                    Twix twix1 = new Twix();
                    aTwix = twix1.getAmountLeft(aTwix, Twix.price, machineMoney);
                    machineMoney = twix1.buyItem(aTwix, Twix.price, machineMoney, selection);
                    if(aTwix < 0){
                        aTwix = 0;
                    }
                    break;
                case 3:
                    Coke coke1 = new Coke();
                    aCoke = coke1.getAmountLeft(aCoke, Coke.price, machineMoney);
                    machineMoney = coke1.buyItem(aCoke, Coke.price, machineMoney, selection);
                    if(aCoke < 0){
                        aCoke = 0;
                    }
                    break;
                case 4:
                    Sprite sprite1 = new Sprite();
                    aSprite = sprite1.getAmountLeft(aSprite, Sprite.price, machineMoney);
                    machineMoney = sprite1.buyItem(aSprite, Sprite.price, machineMoney, selection);
                    if(aSprite < 0){
                        aSprite = 0;
                    }
                    break;
                case 5:
                    Gummies gummies1 = new Gummies();
                    aGummies = gummies1.getAmountLeft(aGummies, Gummies.price, machineMoney);
                    machineMoney = gummies1.buyItem(aGummies, Gummies.price, machineMoney, selection);
                    if(aGummies < 0){
                        aGummies = 0;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid input");
            }
            total--;
            System.out.println("Continue shopping? Press 1 for yes, 2 for no");

            int yesorno = scanner.nextInt();
            if (yesorno == 2) {
                System.out.println("Have a good day!");
                i++;
            }
            else if (total == 0){
                System.out.println ("Sorry, we are out of snacks!");
                i++;
            }
        }
    }
}
    //Invoke Receipt.printReceipt
