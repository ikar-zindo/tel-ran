package lesson28_runnable_vs_thread_deamon.task1;

public class ServiceTest {
   public static void main(String[] args) {

      Service.test(() -> System.out.println("X"));
   }
}
