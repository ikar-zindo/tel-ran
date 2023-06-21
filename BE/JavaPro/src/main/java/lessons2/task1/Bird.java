package lessons2.task1;

public class Bird extends Animal implements Flyable {

   public Bird(double weigh) {
      super(weigh);
   }

   @Override
   public void fly() {
      System.out.println("Птица летит");
   }

   public void landing() {
      System.out.println("Птица преземлилась");
   }
}
