package lesson30_wait_join_blockingQueue.task1;

public class CommonUtils {

   public synchronized void methodA() {
      String name = Thread.currentThread().getName();
      System.out.printf("Поток %s выполнил метод А.%n", name);

      try {
         Thread.sleep(3_000);

         System.out.printf("Поток %s вошёл в режим ожидания.%n", name);
//         wait(7_000);
         wait();
      } catch (InterruptedException e) {
         throw new RuntimeException(e);
      }

      System.out.printf("Поток %s закончил выполнение метода А.%n", name);
   }

   public synchronized void methodB() {
      String name = Thread.currentThread().getName();
      System.out.printf("Поток %s выполнил метод B.%n", name);

      try {
         Thread.sleep(3_000);

      } catch (InterruptedException e) {
         throw new RuntimeException(e);
      }

      System.out.printf("Поток %s закончил выполнение метода B.%n", name);

      System.out.printf("Поток %s разбудил другой роток.%n", name);
      notify();
   }
}
