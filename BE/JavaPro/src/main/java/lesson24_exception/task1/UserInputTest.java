package lesson24_exception.task1;

import java.util.Scanner;

public class UserInputTest {
   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      System.out.println("Введите имя: ");
      String name = scanner.nextLine();

      System.out.println("Введите возраст: ");

      int age;

      try {
         age = Integer.parseInt(scanner.nextLine());
      } catch (NumberFormatException e) {
         System.err.println("Неверный формат возраста! Возраст принят по умолчанию как 0.");
         age = -1;
         System.out.println("Выводим информацию об ошибке := " + e.getMessage());
         System.out.println("Выводим стек-трейс:");
         e.printStackTrace();
         StackTraceElement[] stackElements = e.getStackTrace();
         System.out.println();
      }

      System.out.printf("Введённые данные: имя := %s, возраст := %d", name, age);
   }
}
