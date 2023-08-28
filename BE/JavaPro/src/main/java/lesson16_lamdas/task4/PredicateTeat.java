package lesson16_lamdas.task4;

import lesson16_lamdas.task1.Degree;
import lesson16_lamdas.task1.Student;
import lesson16_lamdas.task1.StudentUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTeat {
   public static void main(String[] args) {

      List<Student> students = new ArrayList<>();

      students.add(new Student("Ivan", 22, 3, 4.76, Degree.MASTER));
      students.add(new Student("Bartek", 25, 5, 4.42, Degree.BACHELOR));
      students.add(new Student("Maja", 18, 1, 4.12, Degree.MASTER));
      students.add(new Student("Monika", 25, 6, 3.76, Degree.BACHELOR));
      students.add(new Student("Daria", 26, 6, 4.88, Degree.MASTER));
      students.add(new Student("Bob", 20, 2, 4.02, Degree.BACHELOR));
      students.add(new Student("Paul", 21, 3, 3.99, Degree.MASTER));
      students.add(new Student("Magda", 28, 6, 4.39, Degree.BACHELOR));
      students.add(new Student("Anna", 28, 6, 4.39, Degree.BACHELOR));


      Predicate<Student> predicate = x -> x.getName().startsWith("A");
      StudentUtils.printFilteredStudents1(students, predicate);
   }
}
