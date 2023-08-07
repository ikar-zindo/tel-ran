package org.example._2023_08_03;

import java.util.Objects;

public class Student implements Comparable<Student> {

   private String name;
   private String surname;
   private int age;

   public Student(String name, String surname, int age) {
      this.name = name;
      this.surname = surname;
      this.age = age;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getSurname() {
      return surname;
   }

   public void setSurname(String surname) {
      this.surname = surname;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Student student = (Student) o;
      return age == student.age && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
   }

   @Override
   public String toString() {
      return "Student{" +
              "name='" + name + '\'' +
              ", surname='" + surname + '\'' +
              ", age=" + age +
              '}';
   }

   @Override
   public int hashCode() {
//      return Objects.hash(name, surname, age);
      int result = name != null ? name.hashCode() : 0;
      result = 31 * result + (surname != null ? surname.hashCode() : 0);
      result = 31 * result + age;
      return result;
   }

   public static void main(String[] args) {

      Student s1 = new Student("Tom", "Smiths", 15);
      Student s2 = new Student("Tom", "Smiths", 15);

      System.out.println(s1 == s2);
      System.out.println(s1.equals(s2));
      System.out.println(s1.hashCode() == s2.hashCode());

      System.out.println(s1.hashCode());
      System.out.println(s2.hashCode());
   }


   @Override
   public int compareTo(Student o) {
      int result = this.surname.compareTo(o.surname);
      if (result == 0) result = this.name.compareTo(o.name);
      if (result == 0) result = this.age - o.age;
      return result;
   }
}
