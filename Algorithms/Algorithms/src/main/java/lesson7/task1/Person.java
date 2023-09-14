package lesson7.task1;

public class Person {

   String firstName;
   String lastName;
   int age;
   String profession;

   public Person(String firstName, String lastName, int age) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.profession = "Programmer";
   }

   public void changeAge(int age) {
      this.age = age;
   }

   @Override
   public String toString() {
      return "Person := " +
              "firstName = " + firstName +
              ", lastName = " + lastName +
              ", age = " + age +
              ", profession = " + profession;
   }
}
