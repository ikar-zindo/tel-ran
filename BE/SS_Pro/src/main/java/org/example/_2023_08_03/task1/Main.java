package org.example._2023_08_03.task1;

import java.util.*;

/**
 * Создать класс Cat с полями
 * String name
 * int age
 * String colour
 * boolean isHungry
 *
 *
 * - создать исходный список из экземплянов класса Cat
 * - определить естественный порядок кошек как порядок по имени,
 * вывести всех котов в естественном порядке
 * - создать компаратор для вывода котов в порядке голодности,
 * возраста и цвета, продемонстрировать вывод
 */

/**
 * Из исходного списка котов создать Map, у которого в качестве ключа будет возраст,
 * в качестве значения - количество голодных кошек данного возраста
 */
public class Main {
   public static void main(String[] args) {

      Cat cat1 = new Cat("Tom", 3, "WHITE", false);
      Cat cat2 = new Cat("Silvana", 4, "GREY", true);
      Cat cat4 = new Cat("Silvana", 4, "GREY", true);
      Cat cat6 = new Cat("Silvana", 4, "GREY", true);
      Cat cat3 = new Cat("Bob", 5, "BLACK", true);
      Cat cat7 = new Cat("Bob", 5, "BLACK", true);
      Cat cat8 = new Cat("Marta", 6, "RED", false);

      List<Cat> catList = Arrays.asList(cat1, cat2, cat3, cat4, cat6, cat7, cat8);

      // порядок по имени
      Collections.sort(catList, (o1, o2) -> o1.getName().compareTo(o2.getName()));
      catList.forEach(System.out::println);

      System.out.println("********************************");
      System.out.println("Sort by age:");
      Collections.sort(catList, new CatComparator());
      catList.forEach(System.out::println);

      System.out.println(addMap(catList));

      Map<Integer, Integer> map = new TreeMap<>();
   }

   private static Map<Integer, Integer> addMap(List<Cat> catList) {
      Map<Integer, Integer> map = new HashMap<>();

      for (Cat cat : catList) {
         if (cat.isHungry()) {
            if (map.containsKey(cat.getAge())) {
               int count = map.get(cat.getAge());
               map.put(cat.getAge(), count + 1);
            } else {
               map.put(cat.getAge(), 1);
            }
         }
      }
      return map;
   }
}
