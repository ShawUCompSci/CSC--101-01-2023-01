public class Methods {
   // Method signature
   // Word #1: Visibility modifier
   // Word #2: (optional) memory designation
   // Word #3 (2): return type
   // Word #4 (3): Method name
   // Parentheses: Formal parameters
   public static void main(String[] args) {
      double num1 = 5.0;
      double num2 = 15.0;
      double num3 = 50.0;
      
      double numAvg = average(6, 5, 4);
      numAvg = average(10, 15, 20);
      numAvg = average(num2, num1, num3);
            
      System.out.println("Average: " + numAvg);
      
      double num4 = 24.0;
      numAvg = (num1 + num2 + num3 + num4) / 4;
      
      System.out.println("Average 2: " + numAvg);
   }
   
   // Compute the average of three numbers
   public static double average(double number1, double number2, double number3) {
      double avg = (number1 + number2 + number3) / 3;
      
      return avg;
   }
}