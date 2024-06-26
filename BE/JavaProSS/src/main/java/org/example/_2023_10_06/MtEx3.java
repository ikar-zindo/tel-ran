package org.example._2023_10_06;

public class MtEx3 {

   volatile static int count = 0;

   public static /*synchronized*/  void increment() {
      synchronized (MtEx3.class) {
         count++;
         System.out.println("Name: " + Thread.currentThread().getName() + " || COUNT: " + Counter.count);
      }
   }

   public static void main(String[] args) {

      Thread t1 = new Thread(new Ri2());
      Thread t2 = new Thread(new Ri2());
      Thread t3 = new Thread(new Ri2());

      t1.setName("T1");
      t2.setName("T2");
      t3.setName("T3");
   }
}

class Ri2 implements Runnable {
   @Override
   public void run() {
      for (int i = 0; i < 5; i++) {
         MtEx3.increment();
      }
   }
}
