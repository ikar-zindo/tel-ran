package org.example.test.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {

   public static void main(String[] args) {
      List<String> list = Arrays.asList("Java","Python","Php","JavaScript","Restaurant");
      System.out.println(method(list));
   }

   public static List<String> method(List<String> list) {
      int biggestWord = list.get(0).length();
      List<String> longestWords = new ArrayList<>();
      longestWords.add(list.get(0));
      for (int i = 1; i < list.size(); i++) {
         if( list.get(i).length() == biggestWord ) {
            biggestWord = list.get(i).length();
            longestWords.add(list.get(i));
         } else if(list.get(i).length() > biggestWord) {
            longestWords.clear();
            longestWords.add(list.get(i));
            biggestWord = list.get(i).length();
         }

      }

      return longestWords;
   }
}