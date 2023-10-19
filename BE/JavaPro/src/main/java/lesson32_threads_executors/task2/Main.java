package lesson32_threads_executors.task2;

import java.util.concurrent.*;

public class Main {

   public static void main(String[] args) {

      Callable<Integer> employee = () -> {
         int x = 2;
         int y = 3;
         int result = x + y;
         Thread.sleep(3_000);
         return result;
      };

      ExecutorService service = Executors.newSingleThreadExecutor();
      Future<Integer> resultBox = service.submit(employee);

      int result = 0;

      try {
         result = resultBox.get(2, TimeUnit.SECONDS);
      } catch (Exception e) {
         System.out.println("Выполнение задачи не возможно.");
      }

      service.shutdown();

      System.out.println("Полученный результат := " + result);
   }
}
