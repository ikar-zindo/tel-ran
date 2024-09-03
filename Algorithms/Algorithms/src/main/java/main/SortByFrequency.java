package main;

import java.util.*;
import java.util.stream.Collectors;

public class SortByFrequency {

   /*
   Сортировка Списка по Частоте Элементов
   Описание: Напишите функцию sort_by_frequency(lst), которая принимает список чисел и возвращает его,
   отсортированным по частоте появления элементов. Если два числа имеют одинаковую частоту,
   они должны быть отсортированы по убыванию.

   Пример:
   Копировать код
   print(sort_by_frequency([4, 5, 6, 5, 4, 3]))
   # [5, 4, 3, 6]
   */
   public static void main(String[] args) {

      long millis = 1718557886335L;
      Date date = new Date(millis);
      System.out.println(date);

      int[] a = {1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 2, 5, 5, 5};
      int[] b = {2, 1, 3, 3, 1, 5, 5, 5, 6, 6, 6, 6, 1, 1};

      System.out.println(Arrays.toString(sortByFrequency(a)));
      System.out.println(Arrays.toString(sortByFrequency(b)));
      System.out.println("=============================================");

      List<Integer> c = Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 2, 5, 5, 5);
      List<Integer> d = Arrays.asList(2, 1, 3, 3, 1, 5, 5, 5, 6, 6, 6, 6, 1, 1);

      System.out.println(sortByFreq(c));
      System.out.println(sortByFreq(d));
   }

   public static int[] sortByFrequency(int[] lst) {
      // Map => key = число, value = популярность
      Map<Integer, Integer> frequencyOfOccurrence = new LinkedHashMap<>();
      for (Integer a : lst) {
         if (frequencyOfOccurrence.containsKey(a)) {
            Integer counter = frequencyOfOccurrence.get(a) + 1;
            frequencyOfOccurrence.put(a, counter);
         } else {
            frequencyOfOccurrence.put(a, 1);
         }
      }

      int[] result = new int[frequencyOfOccurrence.size()];
      while (!frequencyOfOccurrence.isEmpty()) {
         int maxFreq = Integer.MIN_VALUE;

         for (int i = 0; i < result.length; ) {
            for (Map.Entry<Integer, Integer> entry : frequencyOfOccurrence.entrySet()) {
               Integer value = entry.getValue();
               if (maxFreq < value) {
                  maxFreq = value;
               }
            }

            // Map в max value
            List<Integer> sortededList = sortedMax(frequencyOfOccurrence, maxFreq);
            for (int j = 0; j < sortededList.size(); j++, i++) {
               Iterator<Map.Entry<Integer, Integer>> removeIterator = frequencyOfOccurrence.entrySet().iterator();
               while (removeIterator.hasNext()) {
                  Map.Entry<Integer, Integer> entry = removeIterator.next();
                  if (entry.getKey() == sortededList.get(j)) {
                     result[i] = sortededList.get(j);
                     removeIterator.remove();
                     break;
                  }
               }
            }
            maxFreq = Integer.MIN_VALUE;
         }
      }
      return result;
   }

   // сортирка по убыванию по value
   public static List<Integer> sortedMax(Map<Integer, Integer> map, int maxFreq) {
      Map<Integer, Integer> maxMap = new HashMap<>();
      for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
         if (maxFreq == entry.getValue()) {
            maxMap.put(entry.getKey(), entry.getValue());
         }
      }

      List<Integer> result = new ArrayList<>(maxMap.keySet());
      if (maxMap.size() > 1) {
         for (int i = 0; i < result.size() - 1; i++) {
            for (int j = 0; j < result.size() - 1 - i; j++) {
               if (result.get(j) < result.get(j + 1)) {
                  int tmp = result.get(j);
                  result.set(j, result.get(j + 1));
                  result.set(j + 1, tmp);
               }
            }
         }
      }

      return result;
   }

   public static List<Integer> sortByFreq(List<Integer> list) {
      return list
            .stream().collect(Collectors.groupingBy(n -> n, Collectors.counting())).entrySet()
            .stream().sorted((e1, e2) -> {
               int freq = e2.getValue().compareTo(e1.getValue());
               return freq != 0 ? freq : e2.getKey().compareTo(e1.getKey());
            })
            .map(Map.Entry::getKey).collect(Collectors.toList());
   }
}
