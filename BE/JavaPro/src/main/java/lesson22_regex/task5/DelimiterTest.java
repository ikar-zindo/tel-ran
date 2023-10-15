package lesson22_regex.task5;

import java.util.Arrays;

public class DelimiterTest {
   public static void main(String[] args) {

      String text = "Hello World I study Java";
      String[] words = text.split(" ");

      System.out.println(Arrays.toString(words));

      for (String word : words) {
         System.out.println("Слово := " + word);
      }
   }
}
