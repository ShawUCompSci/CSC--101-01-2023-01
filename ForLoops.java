import java.util.Scanner;

public class ForLoops {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter the number of times to loop:");
      int times = Integer.parseInt(input.nextLine());
      
      // Write a while loop that prints hello world 10 times
      int num = 0;
      
      while (num < times) {
         System.out.println("Hello World");
         
         num++;
      }
      
      // Write a for loop that prints hello world 10 times
      for (int i = 0; i < times; i++) {
         System.out.println("Hello World");
      }
   }
}