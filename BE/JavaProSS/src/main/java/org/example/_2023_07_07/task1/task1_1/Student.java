package org.example._2023_07_07.task1.task1_1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

@Getter
@AllArgsConstructor
@ToString
public class Student implements Comparable<Student> {

   private String name;
   private int point;
   private Date startStudy;

   @Override
   public int compareTo(Student o) {
      return this.getName().compareTo(o.getName());
   }

   @Override
   public String toString() {
      return ". Student" + " " +
              "name = " + name  +
              ", point = " + point +
              ", startStudy = " + startStudy;
   }
}
