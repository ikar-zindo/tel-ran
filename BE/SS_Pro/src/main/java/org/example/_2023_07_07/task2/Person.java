package org.example._2023_07_07.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Person {
   private String name;
   private int salary;


   @Override
   public String toString() {
      return "Name=" + name +
              ", salary=" + salary;
   }
}
