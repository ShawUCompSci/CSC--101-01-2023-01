import java.util.Scanner;

public class SwtichStatements {
   public static void main (String[] args) {
      // Anything you do in a Switch statement, can be done with an If statement
      // Everything you do with an If statement, cannot be done with a Switch statement
      // Switch statements only work with two data types: int and char
      // Keywords for Switch statements: switch and case
      // The case keyword is equivalent to ==
   
      // Write a program that randomly generates a number (1-12) representing a month of the year
      // Print the name of the month based on the number
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Do you like ice cream? (y/n)");
      char answer = input.nextLine().charAt(0);
            
      // Depending on the number generated, print the name of the month
      switch (answer) {
         case 'y':
            System.out.println("Great!");
            break;
         case 'n':
            System.out.println("You're missing out");
            break;
         default:
            System.out.println("Invalid input");
      }
   }
}