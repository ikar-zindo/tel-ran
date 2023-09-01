package org.example._2023_09_01.task1;

import java.util.List;

public class Main {
   public static void main(String[] args) {

      List<String> list = List.of("aaaaa", "aaaaa", "aaaaaaa", "bbbbb", "vvv", "ccccc", "fff", "fffff");
      System.out.println(filterString(list));

      System.out.println(findAvg(list));
   }

   // todo: Дан список строк. Необходимо отфильтровать строки,
   //  длина которых больше 3 символов,
   //  преобразовать их в верхний регистр,
   //  удалить повторяющиеся и вывести результат в отсортированном порядке.
   public static List<String> filterString(List<String> list) {
      return list.stream()
              .filter(x -> x.length() > 3)
              .map(String::toUpperCase)
              .distinct().sorted()
              .toList();
   }

   // todo: Дан список слов. Необходимо найти среднюю длину слов, начинающихся с буквы "A".
   public static double findAvg(List<String> list) {
      return list.stream()
              .filter(str -> str.startsWith("a"))
              .mapToInt(String::length)
              .average()
              .orElse(0.0);
   }
}
