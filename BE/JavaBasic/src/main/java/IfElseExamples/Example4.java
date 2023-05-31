package IfElseExamples;

import java.util.Scanner;

public class Example4 {
   public static void main(String[] args) {
      // если будет плохая погода - останемся дома, будем смотреть фильм.
      // Иначе если погода будет просто отличная - купим билеты и уедем в другой
      // город на ярмарку.
      // Но если погода будет неопределенная, тогда встретимся с друзьями в нашем доме.

      // -1/0/1 <===> -/0/+
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter pls your weather (+ - good, 0 - undefined, - bad): ");
      int weather = sc.nextInt();
      sc.close();

      // самая очевидная и простая форма записи if-else-if ladder`a
//      if (weather < 0) {
//         System.out.println("Останемся дома, будем смотреть фильм.");
//      } else {
//         if (weather > 0) {
//            System.out.println("Купим билеты и уедем в другой город на ярмарку.");
//         } else {
//            System.out.println("Тогда встретимся с друзьями в нашем доме.");
//         }
//      }

      // более современная и более компактная версия if-else-if ladder`a
      if (weather < 0) {
         System.out.println("Останемся дома, будем смотреть фильм.");
      } else if (weather > 0) {
         System.out.println("Купим билеты и уедем в другой город на ярмарку.");
      } else {
         System.out.println("Тогда встретимся с друзьями в нашем доме.");
      }
   }
}
