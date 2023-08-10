package lesson3.task2;

import java.util.Random;

/**
 * 1. На вершине лесенки, содержащей N ступенек, находится мячик,
 * который начинает прыгать по ним вниз, к основанию.
 * Мячик может прыгнуть на следующую ступеньку, на ступеньку через одну или через 2.
 * (То есть, если мячик лежит на 8-ой ступеньке,
 * то он может переместиться на 5-ую, 6-ую или 7-ую.)
 * Определить число всевозможных «маршрутов» мячика с вершины на землю.
 */
public class Main {
   public static void main(String[] args) {

      Random random = new Random();


   }

   public static int  ballPossibleWays(int n){
      if (n == 1) return 1;
      if (n == 2) return 2;
      if (n == 3) return 4;

      return ballPossibleWays(n - 1) + ballPossibleWays(n - 2) + ballPossibleWays(n - 3);
   }

   public static long ballPossibleWaysMemo(int n) {
      long[] cache = new long[n + 1];
      cache[0] = 0;
      cache[1] = 1;
      return ballPossibleWaysMemo(n, cache);
   }

   public static long ballPossibleWaysMemo(int n, long[] cache) {
      if (n == 0) return 0;
      if (n == 1) return 1;

      long cache1 = 1;
      long cache2 = 2;
      long cache3 = 3;

      long result = 1;

      for (int i = 2; i < n + 1; i++) {
         result = cache1 + cache2 + cache3;
         cache1 = cache2;
         cache2 = cache3;
         cache3 = result;
      }

      return result;
   }

   public static long ballPossibleWaysTabulation(int n) {
      if (n == 1) return 1;
      if (n == 2) return 2;
      if (n == 4) return 4;

      int cache1 = 1;
      int cache2 = 2;
      int cache3 = 4;

      int result = cache1 + cache2 + cache3;
      for (int i = 2; i < n + 1; i++) {
         result = cache1 + cache2 + cache3;
         cache1 = cache2;
         cache2 = cache3;
         cache3 = result;
      }

      return result;
   }
}
