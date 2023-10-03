package org.example._2023_08_03;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class School {
   public static void main(String[] args) {

      Student s1 = new Student("Bartek", "Nowak", 21);
      Student s2 = new Student("Ivan", "Hendrix", 19);
      Student s3 = new Student("Maja", "Kowalski", 22);
      Student s7 = new Student("Maja", "Kowalski", 26);
      Student s4 = new Student("Monika", "Urbanska", 20);
      Student s5 = new Student("Janusz", "Duda", 23);
      Student s6 = new Student("Pawel", "Krawczyk", 18);

      List<Student> list = Arrays.asList(s1, s2, s3, s4, s5, s6, s7);
//      list.forEach(System.out::println);

      Collections.sort(list, Comparator.reverseOrder());
      System.out.println("Sor by natural ordering, reverse:");
      list.forEach(System.out::println);

      Collections.sort(list, new SchoolComparatorByAge());
      System.out.println("**********************************************");
      System.out.println("Sort by age:");
      list.forEach(System.out::println);

      System.out.println("*********************************************************");
      System.out.println("Sort by name:");
      Collections.sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));
      list.forEach(System.out::println);
   }
}
