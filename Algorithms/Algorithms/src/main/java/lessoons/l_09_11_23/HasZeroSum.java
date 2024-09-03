package lessoons.l_09_11_23;

import java.util.*;

public class HasZeroSum {
   public static void main(String[] args) {
      int[] array = {3, 4, -7, 3, 4, -7, 3, 1, 3, 1, -4, -2, -2};

      for (int[] el : isZero(array)) {
         System.out.println(Arrays.toString(el));
      }


      System.out.println("===================");
      System.out.println(isZeroMap(array));
      System.out.println("===================");

      for (int i = 0; i < allMatches(array).size(); i++) {
         System.out.println(Arrays.toString(allMatches(array).get(i)));
      }
   }

   public static ArrayList<int []> isZero(int[] array) {
      ArrayList<int []> lists = new ArrayList<>();

      for (int i = 0; i < array.length; i++) {
         int sum = 0;
         for (int j = i; j < array.length; j++) {
            sum += array[j];
            if (sum == 0) {
               int[] indices = {i, j};
               lists.add(indices);
            }
         }
      }

      return lists;
   }

   public static HashMap<Integer, ArrayList<Integer>> isZeroMap(int[] array) {
      HashMap<Integer, ArrayList<Integer> > map = new HashMap<>();

      int sum = 0;
      for (int i = 0; i < array.length; i++) {
         sum += array[i];
         if (!map.containsKey(sum)) {
            map.put(sum, new ArrayList<>());
            map.get(sum).add(i);
         } else {
            map.get(sum).add(i);
         }
      }

      return map;
   }

   public static ArrayList<int[]> allMatches(int[] array) {
      HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

      int sum = 0;

      ArrayList<int[]> list = new ArrayList<>();

      for (int i = 0; i < array.length; i++) {
         sum += array[i];
         if (!map.containsKey(sum)) {
            map.put(sum, new ArrayList<>());
            map.get(sum).add(i);
         } else {
            map.get(sum).add(i);
         }
      }

      for (int x : map.keySet()) {
         for (int i = 0; i < map.get(x).size() - 1; i++) {
            for (int j = i + 1; j < map.get(x).size(); j++) {
               int[] tmp = {map.get(x).get(i) + 1, map.get(x).get(j)};
               list.add(tmp);
            }
         }
      }

      if (map.containsKey(0)) {
         for (int x : map.get(0)) {
            int[] tmp = {0, x};
            list.add(tmp);
         }
      }

      return list;
   }
}
