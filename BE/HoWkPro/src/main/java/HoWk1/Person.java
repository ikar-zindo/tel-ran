package HoWk1;

public class Person {
   private String fullName;
   private int age;

   public Person() {
   }

   public Person(String fullName, int age) {
      this.fullName = fullName;
      this.age = age;
   }

   public String getFullName() {
      return fullName;
   }

   protected void move() {
      System.out.printf("%s идёт\n", fullName);
   }

   protected void talk() {
      System.out.printf("%s говорит\n", fullName);
   }
}
