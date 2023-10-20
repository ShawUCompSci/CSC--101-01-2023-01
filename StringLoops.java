import java.util.Scanner;

public class StringLoops {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);   
      // Create a while loop that loops 5 times
      
      // To ensure the proper number of loops, 
      // create a variable to increment each time
      String word = input.nextLine();
     
      while (!word.equalsIgnoreCase("Stop")) {
                  
         System.out.println("Hello world " + word);
         
         // Increment num by 1 each time we loop
         word = input.nextLine();
      }
   }
}