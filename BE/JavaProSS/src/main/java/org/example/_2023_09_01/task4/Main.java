package org.example._2023_09_01.task4;

import java.util.*;

public class Main {
   public static void main(String[] args) {

      List<String> list = new ArrayList<>();
      list.add("apple");
      list.add("banana");
      list.add("cherry");
      list.add("date");
      list.add("elderberry");
      list.add("fig");
      list.add("grape");
      list.add("honeydew");
      list.add("kiwi");
      list.add("lemon");
      list.add("mango");
      list.add("nectarine");
      list.add("orange");
      list.add("papaya");
      list.add("quince");
      list.add("raspberry");
      list.add("strawberry");
      list.add("tangerine");
      list.add("uva");
      list.add("watermelon");
      list.add("xigua");
      list.add("yellow");
      list.add("zucchini");

      List<Integer> numbers = List.of(2, 22, 45, 3, 48, 99, 41, 20, 63);

      System.out.println(returnWithoutDuplicate(list));
      System.out.println(secondMax(numbers));
   }

   /**
    * Дан список строк. Необходимо оставить только уникальные символы из всех строк и вывести их в алфавитном порядке.
    */
   public static String returnWithoutDuplicate(List<String> list) {
      return list.stream()
              .flatMapToInt(CharSequence::chars)
              .distinct()
              .sorted()
              .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
              .toString();
   }

   // todo: разобратся в этом
//   public static String returnWithoutDuplicate1(List<String> list) {
//      return list.stream()
//              .flatMapToInt(CharSequence::chars)
//              .distinct()
//              .sorted()
//              .collect(Collectors.toList().supplier());
//   }

   // todo: Дан список чисел. Необходимо найти второе максимальное число.
   public static Optional<Integer> secondMax(List<Integer> numbers) {
      return numbers.stream()
              .sorted(Comparator.reverseOrder())
              .distinct()
              .skip(1)
              .findFirst();
   }
}
