package org.example._2023_09_01.task3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
   public static void main(String[] args) {

      List<Integer> nums1 = List.of(-1, 2, 3);
      List<Integer> nums2 = List.of(1, -2, -3, 2, 0);

      System.out.println(sumSquare(nums1));
      System.out.println(union(nums1, nums2));
   }

   // todo: Дан список чисел. Необходимо найти сумму квадратов всех положительных чисел.
   public static int sumSquare(List<Integer> numbers) {
      return numbers.stream()
              .filter(num -> num > 0)
              .mapToInt(num -> num * num)
              .sum();
   }

   /**
    * Даны два списка чисел. Необходимо объединить их в один список, отсортировать по убыванию и удалить повторяющиеся элементы.
    */
   public static List<Integer> union(List<Integer> list1, List<Integer> list2) {
      return Stream.concat(list1.stream(), list2.stream())
              .distinct().sorted((x, y) -> y - x)
              .collect(Collectors.toList());
   }
}
