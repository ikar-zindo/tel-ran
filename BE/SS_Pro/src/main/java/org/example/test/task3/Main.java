package org.example.test.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void main(String[] args) {
      List<String> list = new ArrayList<>();

      list.add("Java");
      list.add("Java");
      list.add("Fortran");
      list.add("Python");
      list.add("Python");

      System.out.println(meth(list));
      System.out.println(meth2(list));

   }

   public static List<String> meth(List<String> list) {

      for (int i = 0; i < list.size(); i++) {
         for (int j = 0; j < list.size(); j++) {
            if (list.get(i).equals(list.get(j)) && i != j) {
               list.remove(i);
            }
         }
      }

      return list;
   }

   public static List<String> meth2(List<String> list) {
      return list.stream().distinct().toList();
   }
}
