package Com.TechilyFly.PracticeSet1CWH;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Write a Java Program to convert Kilometers to Miles.
*/

public class KilometersToMiles {
    public static void main(String[] args) {

        // Creating an Object of Scanner Class to Take User Input from User
        Scanner userInput = new Scanner(System.in);

        // Creating an Object for  Decimal Format ( I am formating Decimal Value with 2 Places Decimal)
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        System.out.println("Enter Kilometers: ");
        double kilometers = userInput.nextDouble();

        double miles = 0.621371;

        double kilometersToMiles = kilometers * miles;

        userInput.close();

        System.out.println("Kilometers " + kilometers + " Kilometers into " + 
        decimalFormat.format(kilometersToMiles) + " Miles");
        
    }
     
}
