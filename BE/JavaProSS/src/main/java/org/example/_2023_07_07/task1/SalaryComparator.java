package org.example._2023_07_07.task1;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
   @Override
   public int compare(Employee o1, Employee o2) {
      return o1.getSalary() - o2.getSalary();
   }
}
