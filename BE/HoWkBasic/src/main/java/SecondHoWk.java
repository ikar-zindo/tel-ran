import java.util.Scanner;
/*
   1 уровень сложности: попробуйте реализовать 2 алгоритма,
которые переводили бы значение типа char (равен '4') в целочисленный тип (например в int).
Первый с помощью String.valueOf, второй - с помощью Character.getNumericValue.
Для проверки используйте арифметическую операцию result + 6, чтоб в итоге получить 10
*/

public class SecondHoWk {
   public static void main(String[] args) {
      char c = '4'; // объявляем char

      int q = Integer.parseInt(String.valueOf(c)); // 1й метод char -> int
      int w = Character.getNumericValue(c); // 2й метод char -> int

      int result1 = q + 6; // 1я проверка
      int result2 = w + 6; // 2я проверка

      System.out.println("First output: " + result1); // Вывод: 10
      System.out.println("Second output: " + result2); // Вывод: 10
   }
}