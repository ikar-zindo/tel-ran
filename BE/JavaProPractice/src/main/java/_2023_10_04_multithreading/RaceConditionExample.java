package _2023_10_04_multithreading;

public class RaceConditionExample extends Thread {

   private int a;
   private int b;
   private int c;

   private final Object mom = new Object();
   private final Object mom1 = new Object();
   public static void main(String[] args) {
      RaceConditionExample example = new RaceConditionExample();

      var t1 = new Thread(() -> example.increment());
      var t2 = new Thread(() -> example.increment());
      var t3 = new Thread(() -> example.increment());

      t1.start();
      t2.start();
      t3.start();

//      t1.join();
//      t2.join();
//      t3.join();

      example.print();
   }

   public /*synchronized*/ void increment() {
      synchronized (mom) {
         a++;
         b++;
         c++;
      }
   }

   public /*synchronized*/ void decrement() {
      synchronized (mom1) {
         a--;
         b--;
         c--;
      }
   }

   private static void print() {
      System.out.printf("a = %d, b = %d, c = %d", a, b, c);
   }

}
