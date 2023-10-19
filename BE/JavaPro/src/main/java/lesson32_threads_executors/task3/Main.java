package lesson32_threads_executors.task3;

import java.util.Random;
import java.util.concurrent.*;

public class Main {

   private static int id = 1;

   private static synchronized int getId() {
      return id++;
   }

   public static void main(String[] args) {

      Callable<Integer> employeeTask = () -> {
         int id = getId();
         int result = 0;

         Random random = new Random();
         int delay = random.nextInt(4_000) + 1_000;

         for (int i = 0; i < 5; i++) {
            Thread.sleep(delay);
            result += id;
            System.out.printf("Сотрудник %s увеличил значение на %d.%n",
                    Thread.currentThread().getName(), id);
         }

         return result;
      };

      ExecutorService service = Executors.newFixedThreadPool(5);

      Future<Integer>[] resultBoxes = new Future[5];

      for (int i = 0; i < resultBoxes.length; i++) {
         resultBoxes[i] = service.submit(employeeTask);
      }

      int result = 0;

      for (int i = 0; i < resultBoxes.length; i++) {
         try {
            result += resultBoxes[i].get();
            System.out.println("Промежуточный результат := " + result);
         } catch (Exception e) {
            throw new RuntimeException(e);
         }
      }

      System.out.println("Полученный результат := " + result);

      service.shutdown();
   }
}
