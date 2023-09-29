import java.util.Random;
import java.util.Scanner;

public class AccessingString {
   public static void main (String[] args) {
      Scanner input = new Scanner(System.in);
      Random rand = new Random();
   
   
      System.out.println("What is the min");
      int min = Integer.parseInt(input.nextLine());
      
      System.out.println("What is the max");
      int max = Integer.parseInt(input.nextLine());
      
      // Includes the max number in the range
      int range = max - min;
      
      double number = rand.nextDouble() * range + min;
            
      System.out.println(number);
      
   }
}