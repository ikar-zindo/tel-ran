package org.example._2023_08_03;

import java.util.*;

public class SetExamples {
   public static void main(String[] args) {

//      Set<String> set = new LinkedHashSet<>();
//
//      set.add("CCC");
//      set.add("BBB");
//      set.add("AAA");
//      set.add("DDD");
//      set.add("EEE");
//
//      System.out.println(set);
//
//      Set<Student> treeSet = new TreeSet<>();
//      treeSet.add(new Student("Tom", "Smiths", 15));
//      treeSet.add(new Student("Tom", "Smiths", 15));
//      treeSet.add(new Student("Maja", "Smiths", 11));
//      System.out.println(treeSet);

      String s1 = "My string";
      String s2 = "My string";
      String s3 = new String("My string");

      System.out.println(s1 == s2);
      System.out.println(s1 == s3);

      System.out.println(s1.equals(s2));
      System.out.println(s1.equals(s3));
   }
}
