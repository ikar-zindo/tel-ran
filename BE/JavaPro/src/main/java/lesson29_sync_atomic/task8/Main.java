package lesson29_sync_atomic.task8;

public class Main {

   public static void main(String[] args) {

      Alpha alpha = new Alpha();
      Beta beta = new Beta();

      alpha.setBeta(beta);
      beta.setAlpha(alpha);

      ThreadAlpha threadAlpha = new ThreadAlpha(alpha);
      ThreadBeta threadBeta = new ThreadBeta(beta);

      threadAlpha.start();
      threadBeta.start();
   }
}
