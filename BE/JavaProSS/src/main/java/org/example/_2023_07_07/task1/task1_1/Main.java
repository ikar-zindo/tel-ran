package org.example._2023_07_07.task1.task1_1;

import org.example._2023_07_07.task2.Person;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {
   public static void main(String[] args) {

      Map<Integer, Student> studentMap = new HashMap<>();

      studentMap.put(1, new Student("Jimi Hendrix", 12, new Date(117, 0 , 25)));
      studentMap.put(2, new Student("Bob Morly", 24, new Date(123, 4, 14)));

      for (Map.Entry<Integer, Student> m : studentMap.entrySet()) {
         System.out.println("Key: " + m.getKey() + ", student: " + m.getValue());
      }
   }
}
