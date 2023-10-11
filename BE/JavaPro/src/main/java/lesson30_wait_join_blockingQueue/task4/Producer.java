package lesson30_wait_join_blockingQueue.task4;

import java.util.concurrent.BlockingQueue;

public class Producer extends Thread {

   private BlockingQueue<Message> queue;

   public Producer(BlockingQueue<Message> queue) {
      this.queue = queue;
   }

   @Override
   public void run() {
      for (int i = 0; i < 35; i++) {
         try {
            queue.put(new Message(i + 1, "Message #" + (i + 1)));
            Thread.sleep((i + 1) * 200);
            System.out.println("Message " + (i + 1) + " added to the queue!");
            System.out.println("Queue size := " + queue.size());

         } catch (InterruptedException e) {
            throw new RuntimeException(e);
         }
      }

      try {
         queue.put(new Message(36, "exit"));
      } catch (InterruptedException e) {
         throw new RuntimeException(e);
      }

      System.out.println("Producer has completed");
   }
}
