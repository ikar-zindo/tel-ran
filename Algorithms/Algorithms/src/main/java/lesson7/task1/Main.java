package lesson7.task1;

public class Main {
   public static void main(String[] args) {

      Person person1 = new Person("John", "Smith", 34);
      Person person2 = new Person("Jessica", "Morgenstern", 23);
      Person person3 = new Person("Paul", "Ryan", 52);

      System.out.println(person1);
      System.out.println(person2);
      System.out.println(person3);

      person3.changeAge(4);
      System.out.println(person3);
   }
}
