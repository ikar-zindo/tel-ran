package lesson27_multithreading.task2;

public class TwoThreads {

   public static int number = 5;
   public static int count = 0;

   public static void main(String[] args) {

      // 858993459

//      System.out.println(Integer.MIN_VALUE);
//      System.out.println(Integer.MAX_VALUE);

      MyThread myThread = new MyThread();
      myThread.start();

      for (int i = Integer.MIN_VALUE; i < 0; i++) {
         if (i % number == 0) {
            count++;
         }
      }

//      for (int i = 0; i < Integer.MAX_VALUE; i++) {
//         if (i % number == 0) {
//            count++;
//         }
//      }

      System.out.println("Значение счётчика := " + count);
   }
}
