package lesson4.task2;

public class Main {
   public static void main(String[] args) {

      System.out.println(progression(5));
   }

   // Recursion progression
   public static int progression(int num) {
      if (num <= 0) throw new ArithmeticException("The number can't be non-positive");;
      if (num == 1) return 1;
      return progression(num - 1) + num;
   }
}
