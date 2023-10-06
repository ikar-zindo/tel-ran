package lesson27_multithreading.task1;

public class MyThread1 extends Thread {

   @Override
   public void run() {
      for (int i = 100; i < 110; i++) {
         System.out.println("Поток 1 := " + i);

         try {
            Thread.sleep(200);
         } catch (Exception e) {
            System.out.println("Ошибка!");
         }
      }
   }
}
