package lessons2.task1;

public abstract class Animal {

   protected double weigh;

   public Animal(double weigh) {
      this.weigh = weigh;
      System.out.println("Вызван конструктор Animal");
   }
}
