package org.example._2023_08_03;

import java.util.Comparator;

public class SchoolComparatorByAge implements Comparator<Student> {
   @Override
   public int compare(Student o1, Student o2) {
      return o1.getAge() - o2.getAge();
   }
}
