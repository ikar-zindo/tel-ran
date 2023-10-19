package lesson32_threads_executors.task4_building;

import java.util.Date;
import java.util.Random;

public class Building implements Runnable {

   private String city;
   private String[] stages;
   private boolean printTime;

   public Building(String city, String[] stages, boolean printTime) {
      this.city = city;
      this.stages = stages;
      this.printTime = printTime;
   }

   @Override
   public void run() {
      Random random = new Random();

      for (int i = 0; i < stages.length; i++) {
         // Berlin: отделка, имя потока -> время
         if (printTime) {
            System.out.printf("%s: %s, %s -> %s.%n",
                    city, stages[i], Thread.currentThread().getName(), new Date());
         } else {
            System.out.printf("%s: %s, %s.%n",
                    city, stages[i], Thread.currentThread().getName());
         }

         try {
            Thread.sleep(random.nextInt(4_000) + 1_000);
         } catch (InterruptedException e) {
            throw new RuntimeException(e);
         }
      }
   }
}
