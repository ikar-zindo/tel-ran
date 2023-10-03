package org.example._2023_08_11.task2;

import java.util.HashMap;
import java.util.Map;

public class Max {
   public static void main(String[] args) {

      Map<Integer, String> map = new HashMap<>();

      map.put(-1, "AAA");
      map.put(0, "BBB");
      map.put(-8, "CCC");
      map.put(5, "DDD");
      map.put(2, "EEE");
      map.put(10, "FFF");

      System.out.println(new Max().getMaxKey(map));
   }

   public int getMaxKey(Map<Integer, String> map) {
      int max = Integer.MIN_VALUE;

      for (Map.Entry<Integer, String> pair : map.entrySet()) {
         int key = pair.getKey();
         if (max < key) {
            max = key;
         }
      }

      return max;
   }
}
