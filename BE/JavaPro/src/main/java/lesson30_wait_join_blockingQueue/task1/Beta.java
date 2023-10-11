package lesson30_wait_join_blockingQueue.task1;

public class Beta extends Thread {

   private CommonUtils utils;

   public Beta(CommonUtils utils) {
      this.utils = utils;
      setName("Beta");
      start();
   }

   @Override
   public void run() {
      utils.methodB();
   }
}
