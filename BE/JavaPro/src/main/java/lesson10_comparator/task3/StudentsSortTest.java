package lesson10_comparator.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsSortTest {
   public static void main(String[] args) {

      List<Student> students = new ArrayList<>();

      students.add(new Student("Ivan", 6, 29, 4.92));
      students.add(new Student("Janusz", 6, 25, 3.01));
      students.add(new Student("Bartek", 4, 21, 3.63));
      students.add(new Student("Pawel", 2, 21, 4.33));
      students.add(new Student("Diana", 1, 27, 3.56));

      students.add(new Student("Monika", 4, 21, 4.65));
      students.add(new Student("Magda", 5, 19, 4.31));
      students.add(new Student("Paulina", 2, 22, 4.31));
      students.add(new Student("Daria", 1, 17, 4.31));
      students.add(new Student("Maja", 3, 22, 4.31));

      students.add(new Student("Will", 3, 22, 4.31));
      students.add(new Student("Albert", 3, 22, 4.31));
      students.add(new Student("Weronika", 3, 21, 4.31));
      students.add(new Student("Rihana", 3, 20, 4.31));
      students.add(new Student("Mateusz", 4, 22, 3.15));

      System.out.println("Исходный лист:");

      for (Student student : students) {
         System.out.println(student);
      }
      System.out.println("************************************************************************");

      Collections.sort(students, new StudentComparator());

      System.out.println("Отсортированный лист:");

      for (Student student : students) {
         System.out.println(student);
      }
      System.out.println("************************************************************************");

      Collections.sort(students);

      System.out.println("Отсортированный лист:");

      for (Student student : students) {
         System.out.println(student);
      }
      System.out.println("************************************************************************");

   }
}
