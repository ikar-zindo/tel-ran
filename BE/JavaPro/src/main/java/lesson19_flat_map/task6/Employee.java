package lesson19_flat_map.task6;

import java.util.Objects;

public class Employee {

   private String name;
   private String position;
   private double salary;

   public Employee(String name, String position, double salary) {
      this.name = name;
      this.position = position;
      this.salary = salary;
   }

   public String getName() {
      return name;
   }

   public String getPosition() {
      return position;
   }

   public double getSalary() {
      return salary;
   }

   public void setSalary(double salary) {
      this.salary = salary;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Employee employee = (Employee) o;
      return Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(position, employee.position);
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, position, salary);
   }

   @Override
   public String toString() {
      return "Employee{" +
              "name='" + name + '\'' +
              ", position='" + position + '\'' +
              ", salary=" + salary +
              '}';
   }
}
