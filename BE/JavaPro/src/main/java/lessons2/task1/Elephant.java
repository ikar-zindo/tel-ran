package lessons2.task1;

public class Elephant extends LandAnimal{
   public Elephant(double weigh) {
      super(weigh);
   }

   @Override
   public void voice() {
      System.out.println("Слон трубит");
   }
}
