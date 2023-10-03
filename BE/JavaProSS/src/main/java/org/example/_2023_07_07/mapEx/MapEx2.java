package org.example._2023_07_07.mapEx;

import java.util.*;

public class MapEx2 {
   public static void main(String[] args) {

      List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 0,67, 8);

      for (Integer i : list) {
         System.out.println(i * 10);
      }

      Map<Integer, String> map = new HashMap<>();
      map.put(1, "A");
      map.put(2, "C");
      map.put(3, "V");
      map.put(4, "F");
      map.put(5, "R");

      // перебор по паре (ключ-значениям)
      for (Map.Entry<Integer, String> m : map.entrySet()) {
         System.out.println(m.getKey() + " : " + m.getValue());
      }

      // перебор по значениям
      for (String s : map.values()){
         System.out.println(s);
      }

      // перебор по ключам
      for (Integer i : map.keySet()) {
         System.out.println(i);
      }
   }
}
