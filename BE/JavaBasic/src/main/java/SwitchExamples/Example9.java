package SwitchExamples;

import java.util.Scanner;

public class Example9 {
   public static void main(String[] args) {
      // необходимо создать
      // будем определять выходной или нет

      // switch-case (более удобный подход, как выражение, наиболее часто встречающ
      // приминение

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter pls number of day [1..7]: ");
      int day = sc.nextInt();
      sc.close();

      System.out.print(getNameofDayInWeek(day));
   }

   public static String getNameofDayInWeek(int dayOfWeek) {

      return switch (dayOfWeek) {
         case 1, 2, 3, 4, 5   -> "Working day";
         case 6, 7            -> "Weekend";
         default              -> "Error";
      };
   }
}
