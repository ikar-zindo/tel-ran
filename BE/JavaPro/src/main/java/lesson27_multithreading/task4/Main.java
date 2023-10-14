package lesson27_multithreading.task4;

public class Main {

   private static int count = 0;

   public static void main(String[] args) {

      Thread thread1 = new Thread(() -> {
         for (int i = 30_000; i < 60_000; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
               if (i % j == 0) {
                  isPrime = false;
                  break;
               }
            }

            if (isPrime) {
               counter();
            }
         }
      });
      Thread thread2 = new Thread(() -> {
         for (int i = 60_000; i < 100_000; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
               if (i % j == 0) {
                  isPrime = false;
                  break;
               }
            }

            if (isPrime) {
               counter();
            }
         }
      });

      thread1.start();
      thread2.start();

      for (int i = 2; i < 30_000; i++) {
         boolean isPrime = true;

         for (int j = 2; j < i; j++) {
            if (i % j == 0) {
               isPrime = false;
               break;
            }
         }

         if (isPrime) {
            count++;
         }
      }

      try {
         thread1.join();
         thread2.join();
      } catch (InterruptedException e) {
         throw new RuntimeException(e);
      }

      // 9592
      System.out.println("Total number of prime := " + count);
   }

   private static synchronized void counter() {
      count++;
   }
}
