package lesson24_exception.task2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CheckExceptionTest {
   public static void main(String[] args) {

      try (InputStream in = new FileInputStream("test.txt");) {


         char symbol = (char) in.read();

         System.out.println("Первый символ в файле := " + symbol);

         int x = 10;
         int y = 0;

         int result = x / y;
         System.out.println("Результат деления := " + result);

      } catch (IOException | ArithmeticException e) {
         System.err.println(e.getMessage());
      }


   }
}
