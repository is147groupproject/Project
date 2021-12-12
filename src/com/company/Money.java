package com.company;

import java.util.Scanner;

public class Money {
    //create enterMoney method that returns an integer and has no parameters
        //Prompt the user to enter $1 and $5 bills
        // Loop begins and goes until user decides to break it and continue
        // let user input either a $1 bill or a $5 bill
            //add that number to the amount money in the machine
        //back to beginning of loop
        // when the user is done, return money in the machine
    public static byte EnterMoney() {
        byte cash = 0;
        int input = 0;
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
        return cash;
    }
}
