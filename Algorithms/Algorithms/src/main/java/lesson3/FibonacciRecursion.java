package lesson3;

public class FibonacciRecursion {

   public static void main(String[] args) {

      System.out.println("FibonacciMemoization := " + fibonacciMemo(100));
      System.out.println("Fibonacci := " + fibonacci(50));

      System.out.println(fibonacciTabulation(50));
      System.out.println(fibonacciTabulationOptimized(50));
   }

   public static long fibonacci(int n) {
      if (n == 0) return 0; // base condition
      if (n == 1) return 1;
      return fibonacci(n - 1) + fibonacci(n - 2);
   }

   public static long fibonacciMemo(int n) {
      long[] cache = new long[n + 1];
      cache[0] = 0;
      cache[1] = 1;
      return fibonacciMemo(n, cache);
   }

   public static long fibonacciMemo(int n, long[] cache) {
      if (n == 0) return 0;
      if (n == 1) return 1;
      if (cache[n] != 0) return cache[n];
      long result = fibonacciMemo(n -1, cache) + fibonacciMemo(n - 2, cache);
      cache[n] = result;

      return result;
   }

   public static long fibonacciTabulation(int n) {
      if (n == 0) return 0;
      if (n == 1) return 1;

      long[] cache = new long[n + 1];
      cache[1] = 1;

      for (int i = 2; i < n + 1; i++) {
         cache[i] = cache[i - 1] + cache[i - 2];
      }

      return cache[n];
   }

   public static long fibonacciTabulationOptimized(int n) {
      if (n == 0) return 0;
      if (n == 1) return 1;

      long cache1 = 0;
      long cache2 = 1;
      long result = 1;

      for (int i = 2; i < n + 1; i++) {
         result = cache1 + cache2;
         cache1 = cache2;
         cache2 = result;
      }
      return result;
   }
}
