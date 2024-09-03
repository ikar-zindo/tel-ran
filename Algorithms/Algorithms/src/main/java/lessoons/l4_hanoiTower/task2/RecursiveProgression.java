package lessoons.l4_hanoiTower.task2;

public class RecursiveProgression {
   public static void main(String[] args) {

      System.out.println(recursiveProgression(5, 2));
   }

   // RecursionProgression
   public static int recursiveProgression(int num, int k) {
      if (num <= 0 || k <= 0) throw new ArithmeticException("The numbers can't be non-positive");;
      if (num == 1) return 1;
      return recursiveProgression(num - 1, k) + 1 + (num - 1) * k;
   }
}
