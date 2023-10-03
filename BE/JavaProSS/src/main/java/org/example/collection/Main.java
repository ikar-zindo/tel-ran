package org.example.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
   public static void main(String[] args) {
      Integer[] arr = new Integer[10];
      List<Integer> list = new ArrayList<>(15_000);

      list.add(15);
      list.add(25);
      list.add(23);
      list.add(3);


      System.out.println(list);
      list.add(0, 9999);
      System.out.println(list);

      System.out.println(list.indexOf(23));

      for (int i = 0; i < list.size(); i++) {
         list.set(i, i * 2);
      }

      System.out.println(list);
   }
}
