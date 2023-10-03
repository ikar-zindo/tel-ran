package org.example._2023_07_07.mapEx;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
   public static void main(String[] args) {

      Map<Integer, String> map = new HashMap<>();
      map.put(1, "Ivan");
      map.put(2, "Artemii");
      map.put(3, "Wiktor");
      map.put(4, "Olga");
      map.put(null, null);
      map.put(null, "44");
      map.put(0, "Karate");
      map.put(-1, "Samsung");
      map.put(6, "iPhone");

      System.out.println(map.isEmpty());
      System.out.println(map.containsKey(8));
      System.out.println(map);

//      Map<Dog, Integer> integerMap = new TreeMap<>();
//      integerMap.put(new Dog("W", 1), 1);
//      integerMap.putIfAbsent(new Dog("W", 1), 1);
//
//      integerMap.containsKey();
//      System.out.println(integerMap);


   }
}
