package ArrayExamples;

import java.time.format.SignStyle;
import java.util.Scanner;

/*
Определите колличество слов в сроке
 */
public class Task2 {
   public static void main(String[] args) {

//      String message = "Hello, java! It`s 283023-m group";
//      String message = "";

      Scanner sc = new Scanner(System.in);
      String message = sc.nextLine();
      sc.close();

      getWords(message);

   }

   public static void getWords(String m) {
      char[] charArray = m.toCharArray();

      if (!m.equals("")) {
         int count = 0;
         for (char c : charArray) {
            if (c == ' ')
               count++;
         }
         count++;

         System.out.println(count);
      } else
         System.out.println(0);
   }
}
