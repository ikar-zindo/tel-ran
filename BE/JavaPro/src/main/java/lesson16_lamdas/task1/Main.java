package lesson16_lamdas.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
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

      System.out.println("Список всех студентов:");
      for (Student student : students) {
         System.out.println(student);
      }
      System.out.println("**************************************************************************************");

      System.out.println("Фильтр: средний балл > 4, степень - Магистр");
      // Ivan, Maja, Daria
      StudentUtils.printFilteredStudents(students, new FilterByRateAndDegree());

      System.out.println("Фильтр: возраст < 25, степень - Бакалавр");
      // Bob
      StudentUtils.printFilteredStudents(students, new FilterByAgeAndDegree());

      System.out.println("Фильтр: имя начиеается на 'A', средний балл < 4.5");
      System.out.println("Используем анонимеый класс:");

      // Anna
      StudentUtils.printFilteredStudents(students, new Filter() {
         @Override
         public boolean test(Student student) {
            return student.getName().startsWith("A") && student.getAverageRate() < 4.5;
         }
      });

      System.out.println("Фильтр: курс до 2 включитеотно, средний балл > 4");
      System.out.println("Используем анонимеый класс:");

      //Maja, Bob
      StudentUtils.printFilteredStudents(students, new Filter() {
         @Override
         public boolean test(Student student) {
            return student.getCourse() <= 2 && student.getAverageRate() > 4;
         }
      });

      System.out.println("Фильтр: имя содержит 4 буквы и 'i'");
      System.out.println("Используем лямда-выражения:");

      // Ivan, Monika, Daria
      StudentUtils.printFilteredStudents(students,
              x -> x.getName().length() >= 4 && x.getName().toLowerCase().contains("i"));

      System.out.println("Фильтр: курс - нечётный, возраст - чётный");
      System.out.println("Используем лямда-выражения:");

      // Ivan, Maja
      StudentUtils.printFilteredStudents(students,
              x -> x.getCourse() % 2 != 0 && x.getAge() % 2 == 0);

      System.out.println("Фильтр: степень - бакалавр, имя содержит 'a'");
      System.out.println("Используем лямда-выражения:");

      // Bartek, Monika, Magda, Anna
      Filter filter = x -> x.getDegree().equals(Degree.BACHELOR) && x.getName().toLowerCase().contains("a");
      StudentUtils.printFilteredStudents(students, filter);
      StudentUtils.printFilteredStudents(students, filter);
      StudentUtils.printFilteredStudents(students, filter);
   }
}
