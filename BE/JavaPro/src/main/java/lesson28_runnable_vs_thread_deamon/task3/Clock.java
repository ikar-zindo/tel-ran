package lesson28_runnable_vs_thread_deamon.task3;

public class Clock extends Thread {

   @Override
   public void run() {

      while (true) {
         try {
            Thread.sleep(1000);
            System.out.println("Tik");
            Thread.sleep(1000);
            System.out.println("Tak");

         } catch (InterruptedException ignored) {
            try {
               sleep(5000);
            } catch (InterruptedException e) {
               throw new RuntimeException(e);
            }
         }
      }
   }
}
