package org.example._2023_09_08_tasks_stream.task3;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
   public static void main(String[] args) {

      List<String> cities = List.of("Moscow, 15000", "New York, 12000", "Riga, 800", "Berlin, 3600", "Shanghai, 25000");

      int top = 3;

      System.out.println(getTopNCities(cities, top));
   }

   /**
    * Дан список строк, каждая строка содержит название города и его
    * население в тысячах человек, разделенных запятой. Необходимо найти топ N городов с
    * наибольшим населением. Напишите метод, который принимает список строк и число N и
    * возвращает список топ N городов.
    */

   public static List<String> getTopNCities(List<String> cities, int n) {

      return cities.stream()
              .map(city-> city.split(","))//[New York,15000] [Berlin,3600]
              .sorted((c1, c2) -> Integer.compare(Integer.parseInt(c2[1].trim()), Integer.parseInt(c1[1].trim())))
              .limit(n)
              .map(city -> city[0] + ": " + city[1])
              .collect(Collectors.toList());
   }
}
