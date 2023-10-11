package lesson30_wait_join_blockingQueue.task4;

import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread {

   private BlockingQueue<Message> queue;

   public Consumer(BlockingQueue<Message> queue) {
      this.queue = queue;
   }

   @Override
   public void run() {
      try {
         Thread.sleep(7_000);

         Message msg = queue.take();

         while (!msg.getContent().equals("exit")) {
            Thread.sleep(msg.getId() * 500);

            System.out.println("Grabbed a message from the queue: ID := " + msg.getId()
            + ", text: " + msg.getContent());
            msg = queue.take();
         }

      } catch (InterruptedException e) {
         throw new RuntimeException(e);
      }

      System.out.println("Consumer has completed");

   }
}
