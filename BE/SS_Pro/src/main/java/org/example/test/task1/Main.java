package org.example.test;

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
      // sumOdd = 

      System.out.println(meth(list));



   }

   public static int meth(List<Integer> list) {

      int sumEven = 0;
      int sumOdd = 0;
//      for (int i = 0; i < list.size(); i += 2) {
//
//         sumEven += list.get(i);
//      }
//
//      for (int i = 1; i < list.size(); i += 2) {
//         sumOdd += list.get(i);
//      }

      for (int i = 0; i < list.size(); i++) {

         sumEven ;
         if (i + 1 == list.size())
            break;
         sumOdd += list.get(i + 1);
      }



      return sumEven;
   }
}
