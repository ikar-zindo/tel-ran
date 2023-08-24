package lesson16.task1;

import java.util.List;
import java.util.function.Predicate;

public class StudentUtils {

   public static void printFilteredStudents(List<Student> students, Filter filter) {
      for (Student student : students) {
         if (filter.test(student)) {
            System.out.println(student);
         }
      }
      System.out.println("======================================================================================");
   }

   public static void printFilteredStudents1(List<Student> students, Predicate<Student> predicate) {
      for (Student student : students) {
         if (predicate.test(student)) {
            System.out.println(student);
         }
      }
      System.out.println("======================================================================================");

   }
}
