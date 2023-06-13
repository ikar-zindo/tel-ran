package ArrayExamples;

import java.util.Arrays;

public class Task5 {
   public static void main(String[] args) {

      int count = 0;
      for (int i = 1; i <= 99; i += 2, count++) {}

      int[] a = new int[count];
      for (int i = 0, y = 1; i < a.length; i++, y += 2)
         a[i] = y;

      int[] b = new int[count];
      for (int i = a.length - 1, y = 0; i >= 0; i--, y++) {
         b[y] = a[i];
      }

      System.out.println(Arrays.toString(b));
   }
}
