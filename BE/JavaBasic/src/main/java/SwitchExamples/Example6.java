package SwitchExamples;

import java.util.Scanner;

public class Example6 {
   public static void main(String[] args) {
      //1..12 диапазон для месяцев

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter pls number of month: ");
      int month = sc.nextInt();
      sc.close();

      switch (month) {
         case 12, 1, 2:
            System.out.println("Winter");
            break;

         case 3, 4, 5:
            System.out.println("Spring");
            break;

         case 6, 7, 8:
            System.out.println("Summer");
            break;

         case 9, 10, 11:
            System.out.println("Autumn");
            break;

         default:
            System.out.println("Error");
      }
   }
}
