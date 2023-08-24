package lesson16.task1;

import java.util.Objects;

public class Student {

   private String name;
   private int age;
   private int course;
   private double averageRate;
   private Degree degree;

   public Student(String name, int age, int course, double averageRate, Degree degree) {
      this.name = name;
      this.age = age;
      this.course = course;
      this.averageRate = averageRate;
      this.degree = degree;
   }

   public String getName() {
      return name;
   }

   public int getAge() {
      return age;
   }

   public int getCourse() {
      return course;
   }

   public double getAverageRate() {
      return averageRate;
   }

   public Degree getDegree() {
      return degree;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Student student = (Student) o;
      return age == student.age && course == student.course && Double.compare(student.averageRate, averageRate) == 0 && Objects.equals(name, student.name) && degree == student.degree;
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, age, course, averageRate, degree);
   }

   @Override
   public String toString() {
      return String.format("Студент: имя - %s, возраст - %d, " +
                      "курс - %d, степень - %s, средний бал - %.2f",
              name, age, course, degree.getDescription(), averageRate);
   }
}
