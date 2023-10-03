package org.example._2023_07_07.compare;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Person> {

   @Override
   public int compare(Person o1, Person o2) {
      return (int) (o1.getSalary() - o2.getSalary());
   }
}
