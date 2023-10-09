package lesson29_sync_atomic.task8;

public class ThreadBeta extends Thread {

   private Beta beta;

   public ThreadBeta(Beta alpha) {
      this.beta = alpha;
      setName("Beta");
   }

   @Override
   public void run() {
      beta.methodA();
   }
}
