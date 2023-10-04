package lesson28_runnable_vs_thread_deamon.task3;

public class Main {

   public static void main(String[] args) {

      Clock clock = new Clock();
      clock.start();

      System.out.println("Прирывался ли поток := " + clock.isInterrupted());

      try {
         Thread.sleep(5000);
      } catch (InterruptedException e) {
         throw new RuntimeException(e);
      }

      System.out.println("Прошло 5 сек");
      clock.interrupt();

      if (clock.isInterrupted()) {
         // Сделать что-то, если был вызван метод interrupt()
      }
   }
}
