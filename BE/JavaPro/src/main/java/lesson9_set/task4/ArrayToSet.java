package lesson9_set.task4;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayToSet {
   public static void main(String[] args) {

      Integer[] array = {5, 9, 12, 7, 2};
      System.out.println("Исходный массив - " + Arrays.toString(array));
      System.out.println("Результат 1 - " + getSetFromArray1(array));
      System.out.println("Результат 2 - " + getSetFromArray2(array));
      System.out.println("Результат 3 - " + getSetFromArray3(array));
      System.out.println("Результат 4 - " + getSetFromArray4(array));
      System.out.println("Результат 5 - " + getSetFromArray5(array));
   }

   public static Set<Integer> getSetFromArray1(Integer[] array) {
      Set<Integer> result = new HashSet<>();
      for (int number : array) {
         result.add(number);
      }
      return result;
   }

   public static Set<Integer> getSetFromArray2(Integer[] array) {
      Set<Integer> result = new HashSet<>(Arrays.asList(array));
      return result;
   }

   public static Set<Integer> getSetFromArray3(Integer[] array) {
      Set<Integer> result = new HashSet<>();
      Collections.addAll(result, array);
      return result;
   }

   public static Set<Integer> getSetFromArray4(Integer[] array) {
      Set<Integer> result = Arrays.stream(array).collect(Collectors.toSet());
      return result;
   }

   public static Set<Integer> getSetFromArray5(Integer[] array) {
      Set<Integer> result = Set.of(array);
      return result;
   }
}