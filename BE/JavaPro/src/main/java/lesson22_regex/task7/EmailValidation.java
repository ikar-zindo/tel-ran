package lesson22_regex.task7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  Написать регулярное выражение для проверки адресов электронной почты.
 *  1. Должен быть знак @ (только один)
 *  2. До собачки должна быть минимум 1 цифра или буква, верхний или нижний,
 *     не должно быть специальных символов
 *  3. После собачки должен быть набор букв (минимум 1).
 *  4. После данного набора должна быть точка
 *  5. После точки должен быть набор букв от 2 до 4
 */


public class EmailValidation {
   public static void main(String[] args) {

      checkEmail("test@example.com");
      checkEmail("testexample.com");
      checkEmail("test@@example.com");
      checkEmail("test@exam@ple.com");
      checkEmail("@example.com");
      checkEmail("%@example.com");
      checkEmail("teSt@example.com");
      checkEmail("test@examplecom");
      checkEmail("test@exam%ple.com");
      checkEmail("test@.com");
      checkEmail("test@example.c");
      checkEmail("test@example.commm");
      checkEmail("test@example.c*m");
   }

   public static void checkEmail(String email) {

      String regex = "[a-z0-9]+@[a-z]+[.][a-z]{2,4}";

      System.out.println("Проверяемая строка := " + email + ": " +
              Pattern.compile(regex, Pattern.CASE_INSENSITIVE)
                      .matcher(email).matches());
   }
}
