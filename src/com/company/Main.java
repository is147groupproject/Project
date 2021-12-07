
    /*declare price and quantity arrays with values given in "Menu" class-- menu number corresponds to index number
    ex. priceArray[0] = 1.99*/
    /*Create a variable for money in the machine, and assign a value using the
    InsertMoney method from Money Class*/
package com.company;
import java.util.Scanner;
public class Main {
    public double machineMoney;
    public double [] priceArray = {0, 3.99, 2.49, 1.99, 1.99, 3.50};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int apringles = 2;
        int atwix = 3;
        int acoke = 1;
        int asprite = 3;
        int agummies = 2;
        int total = 11;
//Main loop starts
        //In each iteration of the loop it will...
        //Prompt the user to make a selection and display the available snacks with their prices and amount in stock
        //Display how much spendable money the user has in the machine
        //Use a scanner and a switch statement to let the user make a selection (switch statement values shown in "Menu" class

        //Each time a snack is selected, in the body of the switch statement case...
        //Create an object of the specific snack from the Item subclasses
        /*Use this object to invoke getAmountLeft (quantity) and BuyItem with the cash in the machine,
        its price, and its current quantity as parameters*/
        /*If the user doesn't want to buy anything, they should select the sentinel value of case 6,
        breaking the loop and moving on */

        for (int i = 0; i < 1;) {
            System.out.print("Please select one of the following snacks:\n" +
                    "1 for Pringles ($3.99) " + apringles + " left\n" +
                    "2 for Twix ($2.49) " + atwix + " left\n" +
                    "3 for Coke ($1.99) " + acoke + " left\n" +
                    "4 for Sprite ($1.99) " + asprite + " left\n" +
                    "5 for gummies ($3.50) " + agummies + " left)\n");

                int selection = scanner.nextInt();

                switch (selection) {
                    case 1:
                        if(apringles < 1) {
                            System.out.println("Sorry, item not available");
                            break;
                        }
                        apringles--;
                        System.out.println("Enjoy your Pringles! " + "Remaining pringles: " + apringles);
                        break;
                    case 2:
                        if(atwix < 1) {
                            System.out.println("Sorry, item not available");
                            break;
                        }
                        atwix--;
                        System.out.println("Enjoy your Twix! " + "Remaining Twix: " + atwix);
                        break;
                    case 3:
                        if(acoke < 1) {
                            System.out.println("Sorry, item not available");
                            break;
                        }
                        acoke--;
                        System.out.println("Enjoy your Coke! " + "Remaining Coke: " + acoke);
                        break;
                    case 4:
                        if(asprite < 1){
                            System.out.println ("Sorry, item not available");
                            break;
                        }
                        asprite--;
                        System.out.println("Enjoy your Sprite! " + "Remaining Sprite: " + asprite);
                        break;
                    case 5:
                        if(agummies < 1){
                            System.out.println ("Sorry, item not available");
                            break;
                        }
                        agummies--;
                        System.out.println("Enjoy your Gummies! " + "Remaining Gummies: " + agummies);
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
