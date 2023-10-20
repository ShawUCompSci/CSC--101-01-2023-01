import java.util.Scanner;

public class AvgLoop {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter numbers, type 0 to stop");
   
      // Read a number from consloe      
      int num = Integer.parseInt(input.nextLine());
      
      int count = 0;
      double sum = 0.0;
      
      // Loop while that number doesn't equal 0
      while (num != 0) {
         count++;
         sum += num;
                
         // Read a new number        
         num = Integer.parseInt(input.nextLine());
         
      }
      
      double average = sum / count;
      System.out.println("Count: " + count);
      System.out.println("Sum: " + sum);
      System.out.println("Average: " + average);
   }
}