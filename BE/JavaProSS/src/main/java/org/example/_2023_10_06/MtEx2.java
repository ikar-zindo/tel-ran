package org.example._2023_10_06;

public class MtEx2 {
   public static void main(String[] args) {

      Ri ri = new Ri();
      Thread t1 = new Thread(ri);
      Thread t2 = new Thread(ri);
      Thread t3 = new Thread(ri);

      t1.setName("T1");
      t2.setName("T2");
      t3.setName("T3");

      t3.setPriority(Thread.MAX_PRIORITY);

      t1.start();
      t2.start();
      t3.start();
   }
}

class Counter {
   volatile static int count = 0;
}

class Ri implements Runnable {
   public /*synchronized*/ void increment() {
      synchronized (this) {
         Counter.count++;
         System.out.println("Name: " + Thread.currentThread().getName() + " || COUNT: " + Counter.count);
      }
   }

   @Override
   public void run() {
      for (int i = 0; i < 5; i++) {
         increment();
      }
   }
}
