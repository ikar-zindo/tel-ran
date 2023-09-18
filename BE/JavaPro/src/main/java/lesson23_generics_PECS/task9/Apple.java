package lesson23_generics_PECS.task9;

public class Apple extends Fruit {

   public Apple() {
      this.weight = 1.0f;
   }

   @Override
   public String toString() {
      return "Apple{" +
              "weight=" + weight +
              '}';
   }
}
