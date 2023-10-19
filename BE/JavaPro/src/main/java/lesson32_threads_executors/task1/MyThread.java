package lesson32_threads_executors.task1;

import java.util.Random;

public class MyThread extends Thread {

   private int id;

   public MyThread(int id) {
      this.id = id;
      start();
   }

   @Override
   public void run() {
      Random random = new Random();
      int delay = random.nextInt(4_000) + 1_000;

      for (int i = 0; i < 5; i++) {
         try {
            Thread.sleep(delay);
            Main.increment(id);

            System.out.printf("%s увеличил значение на %d.%n", getName(), id);

         } catch (InterruptedException e) {
            throw new RuntimeException(e);
         }
      }
   }
}
