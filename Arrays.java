import java.util.Scanner;

public class Arrays {
   public static void main (String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      // Create an array of length 3 for integers
      int[] numbers = new int[3];
      
      // Prompt the user to enter the numbers
      System.out.println("Please enter three numbers"); 
      
      // Read three integers from console
      // Store them in an array
      numbers[0] = Integer.parseInt(input.nextLine());
      numbers[1] = Integer.parseInt(input.nextLine());
      numbers[2] = Integer.parseInt(input.nextLine());
      
      int largest = numbers[0];
      
      if (numbers[1] > largest) {
         largest = numbers[1];
      }
      
      if (numbers[2] > largest) {
         largest = numbers[2];
      }
      
      System.out.println("The largest number is " + largest);
   }
}