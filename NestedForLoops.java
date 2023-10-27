import java.util.Scanner;

public class NestedForLoops {
   public static void main (String[] args) {
      Scanner input = new Scanner(System.in);
      
      // Read user's desired box size
      System.out.println("What size would you like the box to be?");
      int size = Integer.parseInt(input.nextLine());
   
      // Create an outer for loop that runs "size" times
      for (int i = 1; i <= size; i++) {
         // Create an inner for loop that runs "size" times
         for (int j = 1; j <= i; j++) {
            // Print "o " to the console each time the inner loop loops
            // Use System.out.print to keep output on the same line
            System.out.print(j);
         }
         // When inner for loop stops, go to a new line
         System.out.println();
      }
   }
}