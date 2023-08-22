package HoWk2;

import java.util.HashMap;
import java.util.Map;

public class MemoizedSequence {
   static Map<Integer, Integer> memo = new HashMap<>();

   public static void main(String[] args) {
      int n = 5;
      int result = memoizedSequence(n);
      System.out.println("a(" + n + ") = " + result);
   }

   static int memoizedSequence(int n) {
      if (n <= 1) {
         return 1;
      }
      if (memo.containsKey(n)) {
         return memo.get(n);
      }
      int value;
      if (n % 2 == 0) {
         value = memoizedSequence(n / 2) + memoizedSequence(n / 2 - 1);
      } else {
         value = memoizedSequence(n / 2) - memoizedSequence(n / 2 - 1);
      }
      memo.put(n, value);
      return value;
   }
}
