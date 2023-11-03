import java.util.Scanner;

public class APT21 {
   public static void main (String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Please enter the first number:");
      double first = Double.parseDouble(input.nextLine());
      System.out.println("Please enter the second number:");
      double second = Double.parseDouble(input.nextLine());
      System.out.println("Please enter the third number:");
      double third = Double.parseDouble(input.nextLine());
      
      double smallest = findSmallest(first, second, third);
      
      System.out.println("The smallest number is: " + smallest);

   }
   
   
   public static double findSmallest (double number1, double number2, double number3) {
      return Math.min(Math.min(number1, number2), number3);
      
   }
}