import java.util.Random;

public class SwtichStatements {
   public static void main (String[] args) {
      // Anything you do in a Switch statement, can be done with an If statement
      // Everything you do with an If statement, cannot be done with a Switch statement
      // Switch statements only work with two data types: int and char
      // Keywords for Switch statements: switch and case
      // The case keyword is equivalent to ==
   
      // Write a program that randomly generates a number (1-12) representing a month of the year
      // Print the name of the month based on the number
      
      Random monthGenerator = new Random();
      
      // Randomly generate a number between 1 and 12 (inclusively)
      int month = monthGenerator.nextInt(12) + 1;
      
      // Depending on the number generated, print the name of the month
      if (month == 1) {
         System.out.println("Jan");
      } 
      else if (month == 2) {
         System.out.println("Feb");
      } 
      else if (month == 3) {
         System.out.println("Mar");
      } 
      else if (month == 4) {
         System.out.println("Apr");
      } 
      else if (month == 5) {
         System.out.println("May");
      } 
      else if (month == 6) {
         System.out.println("Jun");
      } 
      else if (month == 7) {
         System.out.println("Jul");
      } 
      else if (month == 8) {
         System.out.println("Aug");
      } 
      else if (month == 9) {
         System.out.println("Sep");
      } 
      else if (month == 10) {
         System.out.println("Oct");
      } 
      else if (month == 11) {
         System.out.println("Nov");
      } 
      else {
         System.out.println("Dec");
      }
   }
}