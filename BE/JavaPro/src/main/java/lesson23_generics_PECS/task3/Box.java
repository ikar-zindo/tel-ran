package lesson23_generics_PECS.task3;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

   private List<T> items = new ArrayList<>();

   public void putItem(T item) {
      items.add(item);
   }

   public T getItem() {
      return items.remove(0);
   }
}
