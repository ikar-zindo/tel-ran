package lesson28_runnable_vs_thread_deamon.task4;

public class Timer extends Thread{

   private boolean isStopped;

   public void stopTimer() {
      isStopped = true;
      System.err.println("Таймер остановлен");
   }

   @Override
   public void run() {
      int seconds = 0;

      while (!isStopped) {
         System.out.println("Прошло секунд := " + seconds++);

         try {
            Thread.sleep(1000);

         } catch (InterruptedException e) {
            throw new RuntimeException(e);
         }
      }
   }
}
