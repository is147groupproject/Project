public class Main {
    /*declare price and quantity arrays with values given in "Menu" class-- menu number corresponds to index number
    ex. priceArray[0] = 1.99*/
    /*Create a variable for money in the machine, and assign a value using the
    InsertMoney method from Money Class*/

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

    //Invoke Receipt.printReceipt
}
