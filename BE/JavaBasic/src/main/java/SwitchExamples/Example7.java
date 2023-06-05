package SwitchExamples;

import java.util.Scanner;

public class Example7 {
   public static void main(String[] args) {
      // switch-case в более современном подходе
      // 1..12 диапазон для месяцев

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter pls number of month ->  ");
      int month = sc.nextInt();
      sc.close();

      switch (month) {
         case 1, 2, 12   -> System.out.println("Winter");
         case 3, 4, 5    -> System.out.println("Spring");
         case 6, 7, 8    -> System.out.println("Summer");
         case 9, 10, 11  -> System.out.println("Autumn");
         default         ->  System.out.println("Error");
      }
   }
}
