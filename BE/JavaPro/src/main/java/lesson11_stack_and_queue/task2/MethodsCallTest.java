package lesson11_stack_and_queue.task2;

public class MethodsCallTest {
   public static void main(String[] args) {
      System.out.println("Метод main");
      first();
      System.out.println("метод Main закончил работу");
   }

   public static void first() {
      System.out.println("1й метод");
      second();
      System.out.println("1й метод закончил работу");
   }

   public static void second() {
      System.out.println("2й метод");
      third();
      System.out.println("2й метод закончил работу");
   }

   public static void third() {
      System.out.println("3й метод");
      fourth();
      System.out.println(10 / 0);
      System.out.println("3й метод закончил работу");
   }

   public static void fourth() {
      System.out.println("4й метод");
      System.out.println("4й метод закончил работу");
   }
}
