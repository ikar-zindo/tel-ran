package lesson2;

public class RecursionExample {
   public static void main(String[] args) {

//      f1(10);
      long start = System.nanoTime();
      int sum = sum(1000);
      long end = System.nanoTime();
      System.out.println("sum := " + sum);
      System.out.println("time sum := " + (end - start));


      start = System.nanoTime();
      sum = sumRecursive(1000);
      end = System.nanoTime();
      System.out.println("sumRecursive := " + sum);
      System.out.println("time sumRecursive := " + (end - start));

      System.out.println("factorial := " + factorial(25));
      System.out.println("factorialRecursive := " + factorialRecursive(25));
   }

   public static void f(int n) {
      if (n == 100) { // case condition
         System.out.println("Got to the base condition");
         return;
      }

      System.out.println("n := " + n);
      f(n - 1);
   }

   public static void f1(int n) {
      System.out.println("In f1. n := " + n);
      f2(n);
   }

   public static void f2(int n) {
      if (n == 15) return; // base condition
      System.out.println("In f2. n := " + n);
      f1(n + 1);
   }

   // Сумма чисел
   public static int sum(int n) {
      int result = 0;
      for (int i = 0; i <= n; i++) {
         result += i;
      }
      return result;
   }

   public static int sumRecursive(int n) {
      if (n == 1) return 1;
      return n + sumRecursive(n - 1);
   }

   // Factorial
   public static long factorial(int n) {
      long result = 1;
      for (int i = 1; i <= n; i++) {
         result *= i;
      }
      return result;
   }

   //factorial recursive
   public static long factorialRecursive(int n) {
      if (n == 0) return 1; // base condition
      if (n == 1) return 1;
      return n * factorialRecursive(n - 1);
   }
}
