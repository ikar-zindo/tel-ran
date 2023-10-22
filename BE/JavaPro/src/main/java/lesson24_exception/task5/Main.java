package lesson24_exception.task5;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

      // Запросить значение n у пользователя.
      // Вызвать метод и передать туда значение, полученное от пользователя.
      // Посмотреть, какие ошибки возможны в данном коде и для каждой
      // ошибки создать пользовательское исключение.
      // Выбросить эти исключения в нужное время и обработать их в main.

      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter a numeric value");
      int n = Integer.parseInt(sc.nextLine());

      try {
         testingException(n);
      } catch (DivisionByZeroException | InvalidArrayLengthValueException | ArrayOutOfBoundsException e) {
         System.err.println(e.getMessage());
      }
   }

   public static void testingException(int n) throws DivisionByZeroException, InvalidArrayLengthValueException, ArrayOutOfBoundsException {

      if (n == 0) throw new DivisionByZeroException("Caught a pesky division by zero exception");
      int x = 10 / n;

      System.out.println(x);
      if (n < 1) throw new InvalidArrayLengthValueException("Caught a pesky invalid array length value exception");
      int[] array = new int[n];


      System.out.println(array.length);
       try {
         System.out.println(array[n]);
      } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println(e.getMessage());
          throw new ArrayOutOfBoundsException("Caught a pesky array out of bounds exception");
       }
   }
}
