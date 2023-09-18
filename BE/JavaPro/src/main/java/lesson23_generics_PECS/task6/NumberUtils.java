package lesson23_generics_PECS.task6;

public class NumberUtils<T extends Number> {

   private T value;

   public NumberUtils(T value) {
      this.value = value;
   }

   // Задача метода - вернуть int-значения переданого числа (например Double или Long)
   public void printIntegerValue() {
      System.out.println(value.intValue());
   }
}
