package lesson10_comparator.task3;

import java.util.Objects;

public class Student implements Comparable<Student> {

   private String name;
   private int course;
   private int age;
   private double avgRate;

   public Student() {
   }

   public Student(String name, int course, int age, double avgRate) {
      this.name = name;
      this.course = course;
      this.age = age;
      this.avgRate = avgRate;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getCourse() {
      return course;
   }

   public void setCourse(int course) {
      this.course = course;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public double getAvgRate() {
      return avgRate;
   }

   public void setAvgRate(double avgRate) {
      this.avgRate = avgRate;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Student student = (Student) o;
      return course == student.course && age == student.age &&
              Double.compare(student.avgRate, avgRate) == 0 &&
              Objects.equals(name, student.name);
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, course, age, avgRate);
   }

   @Override
   public String toString() {
      return String.format("Студент: имя - %s, курс %d, возраст - %d, средний балл - %.2f",
              name, course, age, avgRate);
   }

   @Override
   public int compareTo(Student student) {
      return student.getName().compareTo(this.getName());
   }
}
