package org.example;

import java.util.Scanner;

import static java.lang.System.in;

public class UseIfElse {


    public static void main(String args[]){
        Scanner myObj = new Scanner(in);  // Create a Scanner object
        System.out.println("Enter number");
        Integer number = Integer.valueOf(myObj.nextLine());  // Read user input
        System.out.println("Username is: " + number);



        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
// other method
        String result = (number > 0) ? "The number is positive." : (number < 0) ? "The number is negative." : "The number is zero.";

        System.out.println(result);
// cases
int period=1;
float amount =10;
float rate=0.05f;
switch(period){
    case 3:
        amount+=amount*rate;
    case 2:
        amount+=amount*rate;
    case 1:
        amount+=amount*rate;
}






    }


}
