package org.example._2023_07_07.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
   public static void main(String[] args) {

      List<Employee> employeeList = new ArrayList<>();

      employeeList.add(new Employee(1, "Ivan",  "Bukrieive",  123));
      employeeList.add(new Employee(2, "Walter",  "Bruch",  456));
      employeeList.add(new Employee(2, "Jimi",  "Hendrix",  1));

      Collections.sort(employeeList, new LastNameComparator());
      System.out.println(employeeList);
   }
}
