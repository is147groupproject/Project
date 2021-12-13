package com.company;
import java.util.Scanner;
public class Money {
    public static byte EnterMoney() {
        byte cash = 0;
        int input = 0;
        //Loop begins
        //If the user inputs 1 or 5, $1 or $5 is added, respectively-- scanner used for this
        //This is done because vending machines usually only accept $1 and $5 bills
        //Loop ends when the user inputs any other value besides 1 or 5
        System.out.println("Select 1 to enter a $1 bill, and select 5 to enter a $5 bill. Enter any other number to continue: ");
        while (input == 1 || input == 5 || input == 0) {
            Scanner scanner0 = new Scanner(System.in);
            input = scanner0.nextByte();
            if (input == 1) {
                cash++;
            } else if (input == 5) {
                cash = (byte) (cash + 5);
            } else {
                break;
            }
            System.out.println("Total Cash Entered: " + cash);
        }
        //returns the total money entered by the user
        return cash;
    }
}
