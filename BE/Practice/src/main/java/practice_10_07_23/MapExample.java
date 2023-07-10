package practice_10_07_23;

import java.util.*;
import java.util.function.BiFunction;

public class MapExample {
   public static void main(String[] args) {

      Map<String, String> map = new HashMap<>();
//      var entrySet = map.entrySet();
//      map.values();
//      map.keySet();

      var list = List.of("One", "Two", "Three", "One", "One", "Three");


      // Метод который принимает список строк и возвращает его без дубликатов
      System.out.println(removeDuplicates(list));

      //
      System.out.println(countWords(list));
   }

   public static List<String> removeDuplicates(List<String> source) {
      Iterator<String> iterator = source.iterator();

      var set = new HashSet<>(source);
      return new ArrayList<>(set);
   }

   public static Map<String, Integer> countWords(List<String> list) {
      var resultMap = new HashMap<String, Integer>();

      for (String word : list) {
//         resultMap.put(word, resultMap.getOrDefault(word,  0) + 1); // 1 способ
//         resultMap.merge(word, 1, Integer::sum); // 2 способ
//         resultMap.merge(word, 1, new BiFunction<Integer, Integer, Integer>() { // 3 способ
//            @Override
//            public Integer apply(Integer integer, Integer integer2) {
//               return integer + integer2;
//            }
//         });
      }

      return resultMap;
   }
}
