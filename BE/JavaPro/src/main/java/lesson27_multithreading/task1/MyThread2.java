package lesson27_multithreading.task1;

public class MyThread2 implements Runnable{
   @Override
   public void run() {
      for (int i = 10_000; i < 10_010; i++) {
         System.out.println("Поток 2 := " + i);

         try {
            Thread.sleep(500);
         } catch (Exception e) {
            System.out.println("Ошибка!");
         }
      }
   }
}
