package lesson27_multithreading.task2;

public class SingleThread {
   public static void main(String[] args) {

      int number = 5;
      int count = 0;

      for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
         if (i % number == 0) {
            count++;
         }
      }

      // Мы пролучаем неверный результат из-за того, что потоки
      // получают одновременный доступ к переменной, а изменения
      // значения переменной происходит в 3 этапа

      System.out.println("Значение счётчика := " + count);
   }
}
