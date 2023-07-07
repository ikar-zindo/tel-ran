package org.example._2023_07_07.task2;

import java.util.HashMap;
import java.util.Map;

public class Main {
   public static void main(String[] args) {

      Map<Integer, Person> personMap = new HashMap<>();
      personMap.put(1, new Person("Walter", 123));
      personMap.put(2, new Person("Jimi", 456));
      personMap.put(3, new Person("Bob", 789));
      personMap.put(4, new Person("Kurt", 123));
      personMap.put(5, new Person("Alice", 417));

      // перебор по паре (ключ-значениям)
      for (Map.Entry<Integer, Person> m : personMap.entrySet()) {
         System.out.println("Key: " + m.getKey() + ", person: " + m.getValue());
      }

      // перебор по значениям
      for (Integer i : personMap.keySet()) {
         System.out.print(i + ", ");
      }

      System.out.println();

      // перебор по ключам
      for (Person person : personMap.values()) {
         System.out.println(person);
      }
   }
}
