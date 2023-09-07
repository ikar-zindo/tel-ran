package lesson20_IO_API.task3_err;

public class Main {
   public static void main(String[] args) {

      System.out.println("Начало работы программы");
      System.out.println("Вызов метода");
      div(10, 0);
      System.out.println("Программа завершила работу");
   }

   public static void div(int x, int y) {
      System.out.println("Начало работы метода");

      System.out.println("Осуществряем проверку делителя");
      if (y == 0) {
         System.err.println("Ошибка! Делитель не может быть = 0");
         y = 1;
      }

      int result = x / y;
      System.out.println("Метод завершил работу");
      System.out.println("Результат := " + result);
   }
}
