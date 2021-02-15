package Com.TechilyFly.PracticeSet1CWH;

import java.util.Scanner;

/*
Write a program to calculate CGPA using marks of three Subjects (Out of 100)
*/

public class CalculateCGPA {

    public static void main(String[] args) {
        
        // Creating an Object of Scanner Class to Take User Input from User
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter Out of Marks (Total Marks of 1 Subject): ");
        float outOfMarks = userInput.nextFloat();

        System.out.println("Enter Marks of Physics: ");
        float physicsMarks = userInput.nextFloat();

        System.out.println("Enter Marks of Chemistry: ");
        float chemistryMarks = userInput.nextFloat();

        System.out.println("Enter Marks of Maths: ");
        float mathsMarks = userInput.nextFloat();

        float resultInPercentage = (physicsMarks + chemistryMarks + mathsMarks) / (outOfMarks*3) * 100;

        userInput.close();

        System.out.println("Your Marks in Percentage is : " + resultInPercentage + "%" + 
        " and Your Marks in CGPA is: " + (resultInPercentage/10) + " CGPA");


    }
    
}
