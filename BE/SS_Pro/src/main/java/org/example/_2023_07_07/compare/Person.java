package org.example._2023_07_07.compare;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Person implements Comparable<Person> {

   private String name;
   private double salary;

   @Override
   //       obj1.compareTo(obj2)
   public int compareTo(Person o) {
      return this.name.compareTo(o.name);
   }
}
