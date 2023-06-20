package lesson1.task3;

public class Cat {

   private int age;
   String color;

   public Cat() {

   }

   public Cat(int age, String color) {
      this.age = age;
      this.color = color;
   }

   public void setAge(int age) {
      if (age < 0) {
         System.out.println("Возраст не может быть отрицательным");
         age = 0;
      }
      this.age = age;
   }

   public int getAge() {
      return age;
   }
}
