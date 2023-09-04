package lesson19_flat_map.task3_Students_books;

import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void main(String[] args) {

      // Есть список студентов
      // у каждого студента есть список книг, которые он прочитал
      // Вывести список книг, прочитанных всеми студентами.
      // Список книг не должен содержать подстроку "java"

      List<Student> students = new ArrayList<>();

      Student student1 = new Student(1, "Bob");
      Student student2 = new Student(2, "Bartek");
      Student student3 = new Student(3, "Maja");

      student1.addBook("Java basic");
      student1.addBook("Java pro");
      student1.addBook("Spring");
      student1.addBook("Spring boot");

      student2.addBook("HTML");
      student2.addBook("CSS");
      student2.addBook("JavaScript");
      student2.addBook("Coffee java");

      student3.addBook("Python");
      student3.addBook("C#");
      student3.addBook("C++");
      student3.addBook("Java");

      students.add(student1);
      students.add(student2);
      students.add(student3);

      System.out.println("Список студентов:");
      students.forEach(System.out::println);
      System.out.println();

      System.out.println("Список прочитаных книг:");
      List<String> books = students.stream() // Получаем стрим студентов
              .flatMap(x -> x.getBooks().stream())
              // Получаем стрим книг у каждого студента, преобразуем несколько стримов книг в один стрим
              .filter(x -> !x.contains("Java")) // Фильтруем итоговый стрим книг
              .toList(); // Преобразуем отфильтрованный стрим книг к листу

      System.out.println(books);
      System.out.println();

      System.out.println("Список прочитаных книгс учётом регистра:");
      List<String> books1 = students.stream() // Получаем стрим студентов
              .flatMap(x -> x.getBooks().stream())
              // Получаем стрим книг у каждого студента, преобразуем несколько стримов книг в один стрим
              .filter(x -> !x.toLowerCase().contains("java")) // Фильтруем итоговый стрим книг
              .toList(); // Преобразуем отфильтрованный стрим книг к листу

      System.out.println(books1);
   }
}
