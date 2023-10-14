package trial_trip.try_catch_test.codeWars.task1;

import java.util.Arrays;

public class Main {
   public static int[] digitize(long n) {
      // Code here

      String s = Long.toString(n);

      char[] ch = s.toCharArray();
      int[] result = new int[ch.length];

      for (int i = ch.length - 1; i >= 0; i--) {
         result[ch.length - 1 - i] = Character.getNumericValue(ch[i]);
      }

      return result;
   }

   public static void main(String[] args) {

      System.out.println(Arrays.toString(digitize(123456789)));
   }
}
