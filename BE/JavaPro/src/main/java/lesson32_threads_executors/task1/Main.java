package lesson32_threads_executors.task1;

/**
 * Пять потоков. Каждый поток должен увеличивать значение
 * общей переменной пять раз, при этом увеличение переменной
 * должно происходить на значение идентификатора данного потока.
 * Потоки имеют идентификаторы от 1 до 5.
 */
public class Main {

   public static int counter;

   public static synchronized void increment(int value) {
      counter += value;
      System.out.println("Новое значение := " + counter);
   }

   public static void main(String[] args) {

      MyThread[] threads = new MyThread[5];

      for (int i = 0; i < threads.length; i++) {
         threads[i] = new MyThread(i + 1);
      }


      for (int i = 0; i < threads.length; i++) {
         try {
            threads[i].join();
         } catch (InterruptedException e) {
            throw new RuntimeException(e);
         }
      }

      System.out.println("Окончательное значение := " + counter);
   }
}
