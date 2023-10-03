package lesson21_try_catch.task1;

public class TryCatchTest {
   public static void main(String[] args) {

      System.out.println("Начало работы программы.");

      int x = 10;
      int y = 2;
      System.out.println("Вызываем метод div с параметрами " + x + " и " + y);

      int result;

      try { // tyr с ресурсами - try (открываем какой-то ресурс) {
         // Конструкция try с ресурсами гарантирует, что наш ресурс,
         // будет закрыт автоматически (мы можем не использовать блок finally для этого)
         result = div(x, y);
         // строка кода, которая может вызвать ошибку 1
         // строка кода, которая может вызвать ошибку 2

         // Например, в блоке try откпываем соединение с базой данных
         // Здесь код, который работает с БД и может вызывать ошибку
      } catch (ArithmeticException e) {
         System.out.println("Получено сообщение об ошибке := " + e.getMessage());
         System.out.println("Для результата принято значение по умолчанию := 0");
         result = 0;
      } finally {
         // Закрываем соединение с БД
         // независимо от того, возниела ли ошибка при работе с БД или нет
         System.out.println("Отпаботал блок finally");
      }

      System.out.println("Получим результат := " + result);
      System.out.println("Конец рабаты программы");
   }

   public static int div(int x, int y) {
      System.out.println("Метод div начал работу с параметрами " + x + " и " + y);
      int result = x / y;
      System.out.println("Метод div закончил работу с результатом := " + result);
      return result;
   }
}
