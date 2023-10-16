package lesson31_concurrent_description.task1_semaphore;

import java.util.concurrent.Semaphore;

public class Car extends Thread {

   private Semaphore semaphore;

   public Car(String name, Semaphore semaphore) {
      this.semaphore = semaphore;
      setName(name);
      start();
   }

   @Override
   public void run() {
      int timeSleep = 3_000;

      try {
         Thread.sleep(timeSleep);
         System.out.printf("Автомобиль %s на старте.%n", getName());

         Thread.sleep(timeSleep);
         long time = System.currentTimeMillis();
         System.out.printf("Автомобиль %s начал движение.%n", getName());

         Thread.sleep(timeSleep);
         System.out.printf("Автомобиль %s подъехал к тоннелю.%n", getName());

         Thread.sleep(timeSleep);
         semaphore.acquire();
         System.out.printf("Автомобиль %s въехал в тоннель.%n", getName());

         Thread.sleep(timeSleep);
         System.out.printf("Автомобиль %s выехал из тоннеля.%n", getName());
         semaphore.release();

         Thread.sleep(timeSleep);
         System.out.printf("Автомобиль %s финишировал за %d с.%n",
                 getName(), (System.currentTimeMillis() - time) / 1_000);

      } catch (Exception e) {
         System.err.println("Error!");
      }
   }
}
