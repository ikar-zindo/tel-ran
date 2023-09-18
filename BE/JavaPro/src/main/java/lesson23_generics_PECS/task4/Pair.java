package lesson23_generics_PECS.task4;

public class Pair<T, R> {

   private T firstValue;
   private R secondValue;

   public Pair(T first, R second) {
      firstValue = first;
      secondValue = second;
   }

   public void setFirst(T first) {
      firstValue = first;
   }

   public void setSecond(R second) {
      secondValue = second;
   }

   public T getFirst() {
      return firstValue;
   }

   public R getSecond() {
      return secondValue;
   }
}
