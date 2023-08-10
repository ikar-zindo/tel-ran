package lesson2;

public class Fibonacci {
   public static void main(String[] args) {

      System.out.println("FibonacciMemoization := " + fibonacciMemo(100));
      System.out.println("Fibonacci := " + fibonacci(50));

   }


   // Fibonacci
   // 0 1 1 2 3 5 8 13 21 34 55
   // f(0) = 0
   // f(1) = 1
   // f(2) = 1
   // f(3) = 2
   // f(4) = 3
   // f(5) = 5
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
}