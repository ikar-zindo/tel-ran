package lesson28_runnable_vs_thread_deamon.task1;

public class Main {
   public static void main(String[] args) {

      // Явно наследуемся от класса new Thread()
      Thread anonymousThread = new Thread() {
         @Override
         public void run() {
            setName("Анонимный поток");
            for (int i = 100; i < 110; i++) {
               // Имя потока: значение := 5.
               System.out.printf("%s: значение := %d.%n", getName(), i);
               try {
                  Thread.sleep(300);
               } catch (InterruptedException e) {
                  throw new RuntimeException(e);
               }
            }
         }
      };

      // Объявояем поток Runnable
      Runnable runnable = () -> {
         Thread currentThread = Thread.currentThread();
         currentThread.setName("Поток Runnable");
         for (int i = 200; i < 210; i++) {
            System.out.printf("%s: значение := %d.%n", currentThread.getName(), i);
            try {
               Thread.sleep(200);
            } catch (InterruptedException e) {
               throw new RuntimeException(e);
            }
         }
      };

      // Объявояем Daemon поток
      Thread daemonThread = new Thread() {
         @Override
         public void run() {
            setName("Демон поток");
            for (int i = 300; i < 310; i++) {
               // Имя потока: значение := 5.
               System.out.printf("%s: значение := %d.%n", getName(), i);
               try {
                  Thread.sleep(500);
               } catch (InterruptedException e) {
                  throw new RuntimeException(e);
               }
            }
         }
      };

      // Запуск потока anonymousThread
      anonymousThread.start();

      // Запуск потока runnable
      new Thread(runnable).start();

      // Запуск потока daemonThread
      daemonThread.setDaemon(true);
      daemonThread.start();
   }
}
