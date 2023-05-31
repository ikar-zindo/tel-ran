package IfElseExamples;

import java.util.Scanner;
import java.util.WeakHashMap;

public class Example5 {
   public static void main(String[] args) {
      // если будет плохая погода - останемся дома, будем смотреть фильм.
      // Иначе если погода будет просто отличная - купим билеты и уедем в другой
      // город на ярмарку.
      // Но если погода будет неопределенная, тогда встретимся с друзьями в нашем доме.

      // -1/0/1
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter pls your weather (1 - good, 0 - undefined, -1 - bad): ");
      int weather = sc.nextInt();
      sc.close();

      // самая очевидная и простая форма записи if-else-if ladder`a
//      if (weather == -1) {
//         System.out.println("Останемся дома, будем смотреть фильм.");
//      } else {
//         if (weather == 1) {
//            System.out.println("Купим билеты и уедем в другой.");
//         } else {
//            if (weather == 0) {
//               System.out.println("Тогда встретимся с друзьями в нашем доме.");
//            } else {
//               System.out.println("Ошибка #1073.");
//            }
//         }
//      }

      // более современная и более компактеая версия if-else-if ladder`a
      if (weather == -1)
         System.out.println("Останемся дома, будем смотреть фильм.");
      else if (weather == 1)
         System.out.println("Купим билеты и уедем в другой.");
      else if (weather == 0)
         System.out.println("Тогда встретимся с друзьями в нашем доме.");
      else
         System.out.println("Ошибка #1073.");
   }
}