package ArrayExamples;

import java.util.Objects;

public class Example2 {
   public static void main(String[] args) {

      Student[] group1 = new Student[3];
      group1[0] = new Student("Bob", "IT_Security", 123);
      group1[1] = new Student("Alice", "Back-End", 456);
      group1[2] = new Student("Bob", "IT_Security", 123);

      // другой вариант создания эквивалентного массива
      Student[] group2 = {
              new Student("Bob", "IT_Security", 123),
              new Student("Alice", "Back-End", 456),
              new Student("Bob", "IT_Security", 123)
      };

      for (int i = 0; i < group2.length; i++) {
         group2[i].setId(879);;
      }

      for (Student e : group2)
         System.out.println(e);
   }
}

class Student {
   private String fullName;
   private String faculty;
   private int id;

   public Student(String fullName, String faculty, int id) {
      this.fullName = fullName;
      this.faculty = faculty;
      this.id = id;
   }

   public String getFullName() {
      return fullName;
   }

   public void setFullName(String fullName) {
      this.fullName = fullName;
   }

   public String getFaculty() {
      return faculty;
   }

   public void setFaculty(String faculty) {
      this.faculty = faculty;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   @Override
   public String toString() {
      return "Student{" +
              "fullName='" + fullName + '\'' +
              ", faculty='" + faculty + '\'' +
              ", id=" + id +
              '}';
   }

   // IntelliJ IDEA default
//   @Override
//   public boolean equals(Object o) {
//      if (this == o) return true;
//      if (o == null || getClass() != o.getClass()) return false;
//
//      Student student = (Student) o;
//
//      if (id != student.id) return false;
//      if (!Objects.equals(fullName, student.fullName)) return false;
//      return Objects.equals(faculty, student.faculty);
//   }
//
//   @Override
//   public int hashCode() {
//      int result = fullName != null ? fullName.hashCode() : 0;
//      result = 31 * result + (faculty != null ? faculty.hashCode() : 0);
//      result = 31 * result + id;
//      return result;
//   }


   // java 7+
   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Student student = (Student) o;
      return id == student.id && Objects.equals(fullName, student.fullName) && Objects.equals(faculty, student.faculty);
   }

   @Override
   public int hashCode() {
      return Objects.hash(fullName, faculty, id);
   }
}