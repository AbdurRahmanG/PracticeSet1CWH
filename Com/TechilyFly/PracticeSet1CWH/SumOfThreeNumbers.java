package Com.TechilyFly.PracticeSet1CWH;

import java.util.Scanner;

/*
Write a Program to Sum Three Numbers in Java
*/

public class SumOfThreeNumbers {
    public static void main(String[] args) {

    // Creating an Object of Scanner Class to Take User Input from User
    Scanner userInput = new Scanner(System.in);

    System.out.println("Enter First Number: ");
    long firstNumber = userInput.nextLong();

    System.out.println("Enter Seond Number: ");
    long secondNumber = userInput.nextLong();

    System.out.println("Enter Third Number: ");
    long thirdNumber = userInput.nextLong();

    long sumOfThreeNumbers = firstNumber + secondNumber + thirdNumber;

    userInput.close();

    System.out.println("The Sum of Three numbers is: " + sumOfThreeNumbers);
        
    }
    
    
}
