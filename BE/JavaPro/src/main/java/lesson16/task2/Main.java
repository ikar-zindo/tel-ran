package lesson16.task2;

public class Main {
   public static void main(String[] args) {

      Operation operation = (x, y) -> {
         int result = x + y;
         System.out.println("Операция выполнена:");
         return result;
      };

      System.out.println("результат := " + operation.operate(1, 2));
      System.out.println("результат := " + operation.operate(10, 20));
      System.out.println("результат := " + operation.operate(12, 72));
   }
}
