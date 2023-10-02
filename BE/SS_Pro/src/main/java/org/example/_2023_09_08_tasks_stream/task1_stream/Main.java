package org.example._2023_09_08_tasks_stream.task1_stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
   public static void main(String[] args) {
      /**
       * Дан список строк. Необходимо подсчитать кол-во слов для каждой длинны и вывести результат.
       */

      List<String> strings = List.of("ffff", "aa", "preHOTpost","bbbbb", "ffff", "   ", "prestopost", "ccc", "bbbbb", "d", "aaaa", "aaaaa");

      Map<Integer, Integer> map = new HashMap<>();

      for (int i = 0; i < strings.size(); i++) {
         int strLength = strings.get(i).length();

//         Integer integer = map.containsKey(strLength) ? map.put(strLength, map.get(strLength) + 1) : map.put(strLength, 1);

         if (map.containsKey(strLength)) {
            map.put(strLength, map.get(strLength) + 1);
         }
         map.put(strLength, 1);
      }

      strings.stream()
              .collect(Collectors.groupingBy(String::length, Collectors.counting()));

      Map<Boolean, List<String>> map1 = strings.stream()
              .collect(Collectors.partitioningBy(str -> str.length() > 4));
//              .forEach((key, value) -> System.out.println("Колличество слов больше > 4 :=  " + value));

      for (Map.Entry<Boolean, List<String>> element : map1.entrySet()) {
         System.out.println(element.getKey() + " := " + element.getValue().size());
      }
   }
}
