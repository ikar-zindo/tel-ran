package org.example._2023_07_07.mapEx;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Dog implements Comparable<Dog> {

   private String name;
   private int age;

   @Override
   public int compareTo(Dog o) {
      return this.name.compareTo(o.name);
   }
}
