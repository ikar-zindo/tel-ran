package org.example._2023_08_11.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void main(String[] args) {

      List<Integer> list = List.of(1, 2, 3, 4, 5);

      System.out.println(new Main().getOdd(list));

   }

   public List<Integer> getOdd(List<Integer> list) {
      List<Integer> getOdd = new ArrayList<>();

      for (int i = 0; i < list.size(); i++) {
         if (list.get(i) % 2 == 0) {
            getOdd.add(i);
         }
      }

      return getOdd;
   }
}
