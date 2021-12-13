package com.company;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    //Arrays declared that hold initial snack quantities and quantities that can change
    public static final int[] initialQuantityArray = {0, 2, 3, 1, 3, 2};
    public static int[] quantityArray = {0, 2, 3, 1, 3, 2};

    public static void main(String[] args) {
       //getName method invoked from Receipt Class
        String userName = Receipt.getName();

        //EnterMoney method invoked from Money Class
        //variable machineMoney created for the amount of money the user entered in the machine that can be spent at a given time
        double machineMoney = Money.EnterMoney();

//Main Main loop begins
        for (int i = 0; i < 1;) {
            //Money in machine is displayed to user
            System.out.println("Money in Machine: $" + machineMoney + "\r\n*******************************");
            //Object created from Menu Class
            Menu mainMenu = new Menu();
            //PrintMenu is invoked from the object
            mainMenu.PrintMenu();
            //User's snack selection is scanned and a switch statement is used to record the sale
            /*The selection number for each snack is the same as the index number of its properties
              for example, priceArray[1] is the price of pringles, just like case 1 is used to select pringles*/
            Scanner scanner2 = new Scanner(System.in);
            int selection = scanner2.nextInt();
            switch (selection) {
                case 1:
                    //Object for specific snack is created
                    Pringles pringles1 = new Pringles();
                    //the objects getAmountLeft method is invoked using the item's quantity and 1
                    quantityArray[1] = pringles1.getAmountLeft(quantityArray[1], 1);
                    //buyItem method is invoked with the item's quantity, price, money in the machine, and selection # as parameters
                    //the snack's price is invoked from its Class's data field
                    machineMoney = pringles1.buyItem(quantityArray[1], Pringles.price, machineMoney, selection);
                    //if statement that doesn't dispense an item if the item is out of stock
                    if(quantityArray[1] < 0){
                        quantityArray[1] = 0;
                    }
                    break;
                case 2:
                    Twix twix1 = new Twix();
                    quantityArray[2] = twix1.getAmountLeft(quantityArray[2], 1);
                    machineMoney = twix1.buyItem(quantityArray[2], Twix.price, machineMoney, selection);
                    if(quantityArray[2] < 0){
                        quantityArray[2] = 0;
                    }
                    break;
                case 3:
                    Coke coke1 = new Coke();
                    quantityArray[3] = coke1.getAmountLeft(quantityArray[3], 1);
                    machineMoney = coke1.buyItem(quantityArray[3], Coke.price, machineMoney, selection);
                    if(quantityArray[3] < 0){
                        quantityArray[3] = 0;
                    }
                    break;
                case 4:
                    Sprite sprite1 = new Sprite();
                    quantityArray[4] = sprite1.getAmountLeft(quantityArray[4], 1);
                    machineMoney = sprite1.buyItem(quantityArray[4], Sprite.price, machineMoney, selection);
                    if(quantityArray[4] < 0){
                        quantityArray[4] = 0;
                    }
                    break;
                case 5:
                    Gummies gummies1 = new Gummies();
                    quantityArray[5] = gummies1.getAmountLeft(quantityArray[5], 1);
                    machineMoney = gummies1.buyItem(quantityArray[5], Gummies.price, machineMoney, selection);
                    if(quantityArray[5] < 0){
                        quantityArray[5] = 0;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid input");
            }
            //Total amount of snacks bought is added with a loop
            int quantitySum = 0;
            for (int j = 1; j < 6; j++) {
                quantitySum += quantityArray[j];
            }
            System.out.println("Continue shopping? Press 1 for yes, 2 for no");
            int yesorno = scanner2.nextInt();
            if (yesorno == 2) {
                i++;
            }
            //if the total amount of snacks bought is all the items in the machine, the machine automatically goes to checkout
            else if (quantitySum == 0){
                System.out.println ("Sorry, we are out of snacks!");
                i++;
            }
        }
        //the printReceipt method is invoked from the Receipt Class with money in the machine and the user's name as parameters
        Receipt.PrintReceipt(machineMoney, userName);
    }
}
