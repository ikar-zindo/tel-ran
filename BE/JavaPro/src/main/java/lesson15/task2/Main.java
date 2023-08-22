package lesson15.task2;

public class Main {

   public static void main(String[] args) {

      // !((b != 0) || (c <= 5))
      // (b == 0) && (c > 5)
      // b: 0   c: 10
      // b: 0   c: 5
      // b: 5   c: 10
      // b: 5   c: 5

      System.out.println(first(0, 10));
      System.out.println(second(0, 10));
      // !((b != 0) || (c <= 5)) -> !((false) || (false)) -> !(false) -> true
      // (b == 0) && (c > 5) -> true & true -> true

      System.out.println(first(0, 5));
      System.out.println(second(0, 5));
      // !((b != 0) || (c <= 5)) -> !((false) || (true)) -> !(true) -> false
      // (b == 0) && (c > 5) -> true & false -> false

      System.out.println(first(5, 10));
      System.out.println(second(5, 10));
      // !((b != 0) || (c <= 5)) -> !((true) || (false)) -> !(true) -> false
      // (b == 0) && (c > 5) -> false & true -> false

      System.out.println(first(5, 5));
      System.out.println(second(5, 5));
      // !((b != 0) || (c <= 5)) -> !((true) || (true)) -> !(true) -> false
      // (b == 0) && (c > 5) -> false & false -> false
   }

   public static boolean first(int b, int c) {
      System.out.printf("b: %d, c: %d%n", b, c);
      return !((b != 0) || (c <= 5));
   }

   public static boolean second(int b, int c) {
      return (b == 0) && (c > 5);
   }
}