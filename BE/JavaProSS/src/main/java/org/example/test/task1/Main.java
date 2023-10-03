package org.example.test.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
   public static void main(String[] args) {
      List<Integer> list = new ArrayList<>();

      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      list.add(6);
      // sumEven = 9
      // sumOdd = 12

      System.out.println(meth(list));



   }

   public static int meth(List<Integer> list) {

      int sumEven = 0;
      int sumOdd = 0;

      for (int i = 0; i < list.size(); i++) {
         if (i % 2 == 0)
            sumEven += list.get(i);
         else
            sumOdd += list.get(i);
      }
      return sumOdd * sumEven;
   }
}
