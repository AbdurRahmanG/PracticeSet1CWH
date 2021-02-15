package Com.TechilyFly.PracticeSet1CWH;

import java.util.Scanner;

/*
Write a Java program Which asks the User to enter his/her name and greets him/her with 
"Hello <name>, have a day" text.
*/

public class GreetUser {
    public static void main(String[] args) {
        
        // Creating an Object of Scanner Class to Take User Input from User
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter Your FullName: ");
        String fullName = userInput.nextLine();
        userInput.close();
        
        System.out.println("Hey " + fullName + ", have a good day!");

    }
    
}
