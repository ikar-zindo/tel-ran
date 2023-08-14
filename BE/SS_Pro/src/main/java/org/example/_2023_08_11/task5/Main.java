package org.example._2023_08_11.task5;

import java.util.*;

public class Main {
   public static void main(String[] args) {

      List<String> list = new ArrayList<>();

      list.add("AAA");
      list.add("AAA");
      list.add("CCC");
      list.add("CCC");
      list.add("CCC");
      list.add("CCC");
      list.add("CCC");
      list.add("DDD");
      list.add("DDD");
      list.add("AAA");
      list.add("BBB");
      list.add("AAA");
      list.add("AAA");

      System.out.println(new Main().findFamousString(list));
   }

   /**
    * 1. Создадим массив int[] для записи ко-во повторений элементов в
    * исходном листе
    * 2. Создадим переменную max
    * 3. Проинициализируем массив "счётчиков"
    * 4. Созлаём переменную maxIndex
    * 5. Найдём max и macIndex
    */
   public String findFamousString(List<String> list) {
      String s = "";
      int[] count = new int[list.size()];
      int max = Integer.MIN_VALUE;
      int maxIndex = -1;

      for (int i = 0; i < list.size() - 1; i++) {
         for (int j = 1; j < list.size(); j++) {
            if (Objects.equals(list.get(i), list.get(j))) {
               count[i]++;
            }
            if (max < count[i]) {
               max = count[i];
               maxIndex = i;
            }
         }
      }

      return list.get(maxIndex);
   }

   private String findFamousString1(List<Integer> list) {
      String result = "";
      Map<String, Integer> map = new HashMap<>();





      return result;
   }
}
