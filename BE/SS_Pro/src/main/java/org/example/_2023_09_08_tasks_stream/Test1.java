package org.example._2023_09_08_tasks_stream;

import java.util.Arrays;

public class Test1 {
   public static void main(String[] args) {

      int[] arr = {24, 58, 97, 65, 63, 102, 5, 41};

//      Arrays.stream(arr)
//              .filter(el -> el % 2 == 0)
//              .sorted()
//              .forEach(System.out::println);

      int[] s = Arrays.stream(arr)
              .map(el -> {
                 if (el % 2 == 0) {
                    System.out.println(el - 10);
                 }
                 return el * 2;
              })
//              .peek(System.out::println)
              .toArray();

//      System.out.println(Arrays.toString(s));
   }
}
