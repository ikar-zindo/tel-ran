package ArrayExamples;

import java.util.Arrays;

public class Example4 {
   public static void main(String[] args) {
      int[] a = {1,2,3,4,5,6,7};
      int[] b = Arrays.copyOf(a, 5);
      int[] c = Arrays.copyOf(a, 15);

      boolean[] d = {true, true, true};
      boolean[] e = Arrays.copyOf(d, 15);

      System.out.println("A = " + Arrays.toString(a));
      System.out.println("B = " + Arrays.toString(b));
      System.out.println("C = " + Arrays.toString(c));
      System.out.println("E = " + Arrays.toString(e));
   }
}
