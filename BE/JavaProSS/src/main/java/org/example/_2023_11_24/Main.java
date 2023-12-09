package org.example._2023_11_24;

import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void main(String[] args) {


      List<String> a = List.of("AAA", "AAA", "AAA", "BBB", "BBB", "BBB", "BBB", "CCC");

      List<String> b = List.of("banana", "orange", "mango", "apple", "orange", "orange", "kiwi", "mango", "mango", "mango");

      System.out.println(returnRowsGreaterGivenNumber(a, 3));
      System.out.println(returnRowsGreaterGivenNumber(b, 2));

   }
//   Написать метод, который возвращает список строк,
//   которые встречаются в исходном списке более заданного количества раз.

   public static List<String> returnRowsGreaterGivenNumber(List<String> stringList, int number) {
      List<String> returnList = new ArrayList<>();

      int temp;
      for (int i = 0; i < stringList.size(); i++) {

         if (returnList.contains(stringList.get(i))) {
            continue;
         }

         temp = 0;
         for (int j = i; j < stringList.size(); j++) {
            if (stringList.get(j).equals(stringList.get(i))) {
               temp++;
            }
         }
         if (number < temp) {
            returnList.add(stringList.get(i));
         }
      }
      return returnList;
   }


   public static List<String> returnRowsGreaterGivenNumber1(List<String> stringList, int number) {
      List<String> returnList = new ArrayList<>();
      List<String> processed = new ArrayList<>();

      for (int i = 0; i < stringList.size(); i++) {

         if (processed.contains(stringList.get(i))) {
            continue; // Если строка уже была обработана, пропускаем её
         }

         int count = 0;
//         for (String s : stringList) {
         for (int j = 0; j < stringList.size(); j++) {
            if (stringList.get(j).equals(stringList.get(i))) {
               count++;
            }
         }

         if (count > number) {
            returnList.add(stringList.get(i));
         }

         processed.add(stringList.get(i));
      }

      return returnList;
   }
}
