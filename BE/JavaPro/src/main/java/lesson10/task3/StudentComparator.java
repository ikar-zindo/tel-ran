package lesson10.task3;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

   // Соритировка по убыванию среднего балла (avgRate)
   @Override
   public int compare(Student student1, Student student2) {
      // Если средний балл разный, то возвращаем разницу между средними баллами
      // Если средний балл одиныковый, то спавниваем курс
      // Если курсы тоже равны, то сравниваем возраст

      int compare = Double.compare(student2.getAvgRate(), student1.getAvgRate());
      if (compare != 0) {
         return compare;
      }

      compare = student2.getCourse() - student1.getCourse();
      if (compare != 0) {
         return compare;
      }

      compare = student1.getAge() - student2.getAge();
      if (compare != 0) {
         return compare;
      }

      return student1.getName().compareTo(student2.getName());
   }
}
