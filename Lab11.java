public class Lab11 {
   public static void main(String[] args) {
      
      String sample = "Hello World";
      
      
      // Check for empty string
      if (sample.length() == 0) {
         System.out.println("0 words in string " + sample);
      } else {
         // The string is not empty
         // Count the words
         int wordCount = 1;
         for (int i = 0; i < sample.length(); i++) {
            char letter = sample.charAt(i);
            
            if (letter == ' ' ) {
               wordCount++;
            }
         }
         
         System.out.println(wordCount + " words in the string " + sample);
      }
   }
   
   public static int wordCounter(String text) {
      
      
      
      
      return count;
   }
}