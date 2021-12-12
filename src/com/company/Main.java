package com.company;
import java.util.Scanner;
public class Main {
    /*Create a variable for money in the machine, and assign a value using the
    InsertMoney method from Money Class*/
    public static int[] quantityArray = {0, 2, 3, 1, 3, 2};
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
            System.out.println("Money in Machine: $" + machineMoney + "\r\n*******************************");
            Menu mainMenu = new Menu();
            mainMenu.PrintMenu();
            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    Pringles pringles1 = new Pringles();
                    quantityArray[1] = pringles1.getAmountLeft(quantityArray[1], 1);
                    machineMoney = pringles1.buyItem(quantityArray[1], Pringles.price, machineMoney, selection);
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
