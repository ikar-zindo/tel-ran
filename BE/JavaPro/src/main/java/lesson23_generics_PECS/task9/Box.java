package lesson23_generics_PECS.task9;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

   List<T> fruits = new ArrayList<>();

   public void put(T fruit) {
      fruits.add(fruit);
   }

   public float boxWeight() {
      if (fruits.size() == 0) {
         return 0;
      }
      return fruits.size() * fruits.get(0).getWeight();
   }

   public boolean compare(Box<? extends Fruit> box) {
      return boxWeight() == box.boxWeight();
   }

   public void move(Box<T> box) {
      box.fruits.addAll(fruits);
      fruits.clear();
   }

   @Override
   public String toString() {
      return "Box{" +
              "fruits=" + fruits +
              '}';
   }
}
