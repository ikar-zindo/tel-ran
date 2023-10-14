package org.example._2023_10_13.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void main(String[] args) {

      String s = "ab#ba#";

   }

   public static void ivan(String s) {

      char[] arrChar = s.toCharArray();
      List<Character> result = new ArrayList<>();

      for (int i = 0; i < arrChar.length; i++) {
         if (arrChar[i] != '#') {
            result.add(arrChar[i]);
         } else if (arrChar[i] == '#') {
            result.remove(result.size() - 1);
         }
      }
   }
}
