package Com.TechilyFly.PracticeSet1CWH;

import java.util.Scanner;

/*
Write a Java program to Detect Whether a number entered by the user is integer or not.
*/

public class DetectIntegerOrNot {

    public static void main(String[] args) {
        
        // Creating an Object of Scanner Class to Take User Input from User
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        boolean number = userInput.hasNextInt();

        userInput.close();

        System.out.println("Number is an Integer: " + number);

    }
    
}
