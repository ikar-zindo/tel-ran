package SS_09_06_23;

import java.util.Arrays;

public class MAin1 {
   public static void main(String[] args) {
      String word = "Hello, world!";

      System.out.println(word.replace("H", "X"));
      System.out.println(Arrays.toString(word.getBytes()));

      String word2 = "Hello World! World is round! World";

      System.out.println(word2.indexOf("World"));
      System.out.println(word2.lastIndexOf("World"));
      System.out.println(word2.lastIndexOf("Moon"));

      int index = word2.indexOf("World");
      while (index != -1){
         System.out.println("Our index is: " + index);
         index = word2.indexOf("World",index + 1);
      }
   }
}
