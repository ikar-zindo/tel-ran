package lesson23_generics_PECS.task1;

import java.util.ArrayList;
import java.util.List;

public class Box {

   List<Object> items = new ArrayList<>();

   public void putItem(Object item) {
      items.add(item);
   }

   public Object getItem() {
      return items.remove(0);
   }
}
