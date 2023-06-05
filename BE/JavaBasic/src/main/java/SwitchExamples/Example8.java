package SwitchExamples;

import java.util.Scanner;

public class Example8 {
   public static void main(String[] args) {
      // switch-case в более современном подходе (как выражение)
      // 1..12 диапазон для месяцев

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter pls number of month ->  ");
      int month = sc.nextInt();
      sc.close();

      String result = switch (month) {
         case 1, 2, 12   ->  "Winter";
         case 3, 4, 5    ->  "Spring";
         case 6, 7, 8    ->  "Summer";
         case 9, 10, 11  ->  "Autumn";
         default         ->   "Error";
      };

      System.out.println(result);

      System.out.println("End of file");
   }
}
