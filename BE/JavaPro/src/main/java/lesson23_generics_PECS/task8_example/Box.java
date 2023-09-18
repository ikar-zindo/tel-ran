package lesson23_generics_PECS.task8_example;

public class Box<T> {

   private T value;

   public Box(T value) {
      this.value = value;
   }

   public T getValue() {
      return value;
   }

   public void setValue(T value) {
      this.value = value;
   }
}
