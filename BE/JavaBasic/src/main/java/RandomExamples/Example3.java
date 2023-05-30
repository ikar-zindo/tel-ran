package RandomExamples;

import java.util.Random;

public class Example3 {
   public static void main(String[] args) {
      // Exercise 1
      // выбор случайного студента для вопроса

      int[] arr1 = {4, 3, 2, 8, 5};
      // indexes    0 1 2 3 4

      String[] arr2 = {"Alex", "Ivan", "Maria", "Anna", "Bob"};
      // indexes          0       1       2        3      4

      Student[] students = {                 // indexes
              new Student("Alex"),     // 0
              new Student("Alice"),    // 1
              new Student("Katrin"),   // 2
              new Student("Katrin"),   // 3
              new Student("Maria"),    // 4
              new Student("Bob")       // 5
      };


      Random r = new Random();
      int choice = r.nextInt(0, 5);

      System.out.println("Index was generated like " + choice);
      System.out.println("Result = " + students[choice].getName());
   }
}

class Student {

   private String name;

   public Student(String name) {
      this.name = name;
   }

   public String getName() {
      return "Student is " + name;
   }
}