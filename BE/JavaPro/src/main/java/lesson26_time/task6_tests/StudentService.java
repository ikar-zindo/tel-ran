package lesson26_time.task6_tests;

import java.util.*;

public class StudentService {

   private final Map<Integer, Student> students = new LinkedHashMap<>();
   private Long count = 1L;

   public Student createStudent(String name, int age, Degree degree) {
      Student student = new Student(count, name, age, degree);

      students.put(Math.toIntExact(count++), student);
      return student;
   }

   public List<Student> getStudents() {
      return new ArrayList<>(students.values());
   }

   public int getCountStudents() {
      return students.size();
   }

   public long getCountStudentsByDegree(Degree degree) {
      return getListStudentsByDegree(degree).size();
   }

   public double getAvgStudents() {
      return students.values().stream()
              .mapToInt(Student::getAge)
              .average()
              .orElse(0);
   }

   public List<Student> getListStudentsByDegree(Degree degree) {
      return students.values().stream()
              .filter(x -> x.getDegree().equals(degree))
              .toList();
   }
}
