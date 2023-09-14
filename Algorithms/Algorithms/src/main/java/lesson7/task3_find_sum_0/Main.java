package lesson7.task3_find_sum_0;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
   public static void main(String[] args) {

      int[] arr = {1, 2, 3, 4, 1, -1, 2, 4, 5, 6};

      List<Integer> list = Arrays.asList(1, 2, 3, 4, 1, -1, 2, 4, 5, 6);

      System.out.println(hasZeroSumSubarray(arr));
      System.out.println(finOutIfSubArrayIsNull(list));
      System.out.println(subArray(arr));

   }

   /**
    * ChatGPT method
    */
   public static boolean hasZeroSumSubarray(int[] arr) {
      Map<Integer, Integer> map = new HashMap<>();
      int sum = 0;

      for (int i = 0; i < arr.length; i++) {
         sum += arr[i];

         if (sum == 0) {
            return true;
         }

         if (map.containsKey(sum)) {
            return true;
         }

         map.put(sum, i);
      }

      return false;
   }

   /**
    * Student method
    */
   public static int finOutIfSubArrayIsNull(List<Integer> arr) {
      int sum = arr.get(0);
      if (arr.isEmpty()) return -1;

      else {
         for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
               sum = sum + arr.get(j);
               if (sum == 0) return 0;
            }
         }
      }
      return -1;
   }

   /**
    * David method
    */
   public static boolean subArray(int[] arr) {

      ArrayList<Integer> set = new ArrayList<>();

      set.add(0);
      int sum = 0;

      for (int x : arr) {
         sum += x;

         if (set.contains(sum))
            return true;

         set.add(sum);
      }

      return false;
   }
}
