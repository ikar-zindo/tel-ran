package org.example._2023_09_01.task2;

import java.util.*;
import java.util.stream.Collectors;

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

      List<Integer> numbers = List.of(-1, 2, 0, 4, -3, 11, 2, 3, 4, 5, 6, 7, 9, -2, -8);

      System.out.println(group(list));
      System.out.println(findMin(numbers));
   }
   // todo: Дан список слов. Необходимо сгруппировать их по длине и вывести результат.
   public static Map<Integer, List<String>> group(List<String> list) {
      return list.stream().collect(Collectors.groupingBy(String::length));
   }

   // todo: Дан список чисел. Необходимо найти наименьшее число, больше 0.
   public static int findMin(List<Integer> numbers) {
      return numbers.stream().filter(num -> num > 0).min(Integer::compareTo).get();
   }

   public static int minNumber(int[] numbers) {
      return Arrays.stream(numbers).filter(x -> x > 0).min().orElse(-1);
   }
}
