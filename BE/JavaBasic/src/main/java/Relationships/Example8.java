package Relationships;

import java.util.Objects;

// переопределнгин ме
public class Example8 {
   public static void main(String[] args) {

      Student s1 = new Student("Bob", "IT_Security", 123);
      Student s2 = new Student("Alice", "BackEnd", 456);

      System.out.println(s1);
      System.out.println(s2);

      System.out.println(s1 == s2);
      System.out.println(s1.equals(s2));

      Student s3 = new Student("Bob", "IT_Security", 123);
      System.out.println(s3);

      System.out.println(s1 == s3);
      System.out.println(s1.equals(s3));

      System.out.println("s1 hash = " + Integer.toHexString(s1.hashCode()));
      System.out.println("s3 hash = " + Integer.toHexString(s3.hashCode()));
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
              ", id=" + id  +
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
