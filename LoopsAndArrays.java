import java.util.Random;

public class LoopsAndArrays {
   public static void main (String[] args) {
      Random rand = new Random();
      
      // Generate a number between 10-20
      int size = rand.nextInt(11) + 10;
      
      // Create an array of the given size
      double[] numbers = new double[size];
      
      // Iterate through array and generate random numbers
      for (int i = 0; i < numbers.length; i++) {
         numbers[i] = rand.nextDouble() * 1000;
      }
      
           
      System.out.println("The smallest number is: " + findMin(numbers));
   }
   
   public static double findMin(double[] nums) {
       // Find the smallest number in the array
      double min = nums[0];
      for (int i = 1; i < nums.length; i++) {
         min = Math.min(min, nums[i]);
      }
      
      return min;
   }
}