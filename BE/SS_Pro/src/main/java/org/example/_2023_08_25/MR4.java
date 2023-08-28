package org.example._2023_08_25;

import java.util.Arrays;

public class MR4 {
   int a = 5;
   public static void main(String[] args) {

      int[] array = {32, 16, 54, 98, 7, 4, 5, 61, 2, 3};

      Arrays.stream(array)
              .filter(el -> el % 2 == 0)
              .map(el -> el * 10)
              .filter(el -> el < 500)
              .forEach(System.out::println);
   }
}
