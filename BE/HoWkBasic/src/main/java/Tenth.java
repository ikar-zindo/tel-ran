
/*
Лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж.
Лифт сломан. Каждый раз он поднимается на N этажей и спускается на M этажей.
Если на последнем подъёме лифт превысил количество этажей,
то считается что лифт поднялся на самый верх. Найдите количество подъёмов,
которые понадобятся лифту.

H, N, M можно оформить через сканнер. Для теста можно использовать значения, например H = 200, N = 50, M = 1
 */

import java.util.Scanner;

public class Tenth {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Введите общее количество этажей (h): ");
      int h = scanner.nextInt();

      System.out.print("Введите количество этажей подъема (n): ");
      int n = scanner.nextInt();

      System.out.print("Введите количество этажей спуска (m): ");
      int m = scanner.nextInt();

      int difference = h - n;
      if (difference >= 0) {
         System.out.println(1);
      } else {
         double fullJourneys = Math.ceil((double) h / (n - m));
         int totalJourneys = (int) fullJourneys + 1;
         System.out.println(totalJourneys);
      }
   }
}
