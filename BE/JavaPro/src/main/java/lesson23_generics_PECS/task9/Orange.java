package lesson23_generics_PECS.task9;

public class Orange extends Fruit{

   public Orange() {
      this.weight = 1.5f;
   }

   @Override
   public String toString() {
      return "Orange{" +
              "weight=" + weight +
              '}';
   }
}
