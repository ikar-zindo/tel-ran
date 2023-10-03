package org.example._2023_07_07.task1;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Employee implements Comparable<Employee> {

   private int id;
   private String firstName;
   private String lastName;
   private int salary;



   @Override
   public int compareTo(Employee o) {
      return this.id - o.id;
   }

   @Override
   public String toString() {
      return  "id = " + id +
              ", firstName = " + firstName +
              ", lastName = " + lastName +
              ", salary = " + salary;
   }
}
