
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
      Scanner sc = new Scanner(System.in);

      System.out.print("Введите общее количество этажей (h): ");
      int h = sc.nextInt();

      System.out.print("Введите количество этажей подъема (n): ");
      int n = sc.nextInt();

      System.out.print("Введите количество этажей спуска (m): ");
      int m = sc.nextInt();

      sc.close();

      int number = h / (n - m) + 1;

      System.out.println("Количество циклов: "+ number);
   }
}
