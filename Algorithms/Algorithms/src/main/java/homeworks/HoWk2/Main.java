package homeworks.HoWk2;

/**
 * 1. Написать функцию, вычисляющую сумму тех чисел
 * в диапазоне от 1 до n, которые делятся на m.
 * Решить задачу:
 * а) через цикл
 * б) через рекурсию

 * 2. Вычислить n-й член последовательности, заданной формулами:
 * a(2n) = a(n) + a(n-1),
 * a(2n+1) = a(n) — a(n-1),
 * a(0) = a(1) = 1.

 * Т.е.:
 * a(2) = a(1) + a(0) = 2
 * a(3) = a(1) - a(0) = 0
 * a(4) = a(2) + a(1) = 3
 * a(5) = a(2) - a(1) = 1
 * Решить задачу через рекурсию, и далее оптимизировать алгоритм
 * методом мемоизации.
 */
public class Main {
   public static void main(String[] args) {

      System.out.println(sum(8, 3));
      System.out.println(sumRecursive(8, 3));
//      System.out.println(sumRecursive1(8, 3));
   }

   public static int sum(int n, int m) { // вычесляем сумму чисел 1..n % m == 0
      int result = 0;
      for (int i = 1; i <= n; i++) {
         if (i % m == 0) {
            result += i;
         }
      }

      return result;
   }

   public static int sumRecursive(int n, int m) { // рекурсия
      if (n <= 0) {
         return 0;
      } else {
         int result = n % m == 0 ? n : 0;
         return result + sumRecursive(n - 1, m);
      }
   }

//   public static int sumRecursive1(int n, int m) {
//      if (n - m <= 0) return 0;
//      return n + sumRecursive1(n - m, m);
//   }


}
