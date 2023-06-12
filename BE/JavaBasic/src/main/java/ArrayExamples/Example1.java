package ArrayExamples;

import java.util.Arrays;

public class Example1 {
   public static void main(String[] args) {

      // 1. декларация + аллокация = инициализация
      int[] a;          // декларация
      a = new int[10];  // аллокация

      // 2.
      int[] b = new int[10];

      // 3. массив как литерал, длинна массива будет рассчитана на лету
      int[] c = {5,4,2,1,8};

      // 4.
      int[] d = new int[]{5,4,2,1,8};

      // C vs Java way
      // java way
      int[] e = {1,2,3};

      // C way
      int f[] = {1,2,3};

      // indexes
      for (int i = 0; i < a.length; i++) {
         System.out.print(a[i] + " ");
      }
      System.out.println();

      System.out.println(c[0]);
   }
}
