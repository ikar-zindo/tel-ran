package lesson24_exception.task4;

import java.util.Scanner;

public class UserRegistrationTest {
   public static void main(String[] args) {

      // Регистрация пользователя
      // Пользователь должен ввести свой возраст
      // Регистрация запрещена, если возраст меньше 12
      // Регистрация запрещена, если больше меньше 120

      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите возраст: ");

      try {
         int age = Integer.parseInt(scanner.nextLine());
         System.out.println("Введённый возраст := " + age);
         registration(age);
      } catch (IllegalArgumentException | TooSmallAgeException | TooBigAgeException e) {
         System.out.println("Введены некорректные данные");
         System.err.println("Причина: " + e.getMessage());
      }
   }

   public static void registration(int age) throws TooBigAgeException {

      if (age < 12) {
         throw new TooSmallAgeException("Возраст не может быть меньше 12");
      }

      if (age > 120) {
         throw new TooBigAgeException("Возраст не может быть больше 120");
      }

      System.out.println("Регистрация прошла успешно");
   }
}
