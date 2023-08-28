package lesson13_tree.task1;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
   public static void main(String[] args) {

      TreeMap<String, Integer> items = new TreeMap<>();

      items.put("Orange", 198);
      items.put("Tomato", 56);
      items.put("Apple", 22);
      items.put("Banana", 456);
      items.put("Peach", 102);
      items.put("Lemon", 175);
      items.put("Watermelon", 852);

      for (Map.Entry<String, Integer> item : items.entrySet()) {
         String key = item.getKey();
         Integer value = item.getValue();

         System.out.printf("Товар - %s, цена - %d.%n", key, value);
      }

      TreeMap<Cat, Integer> cats = new TreeMap<>();

      cats.put(new Cat(5, "BLACK", 2), 1);
      cats.put(new Cat(4, "WHITE", 2.2), 2);
      cats.put(new Cat(12, "RED", 2.4), 3);
      cats.put(new Cat(10, "GREEN", 5.2), 4);
      cats.put(new Cat(8, "BLUE", 4.4), 5);
      cats.put(new Cat(7, "YELLOW", 3.8), 6);
      cats.put(new Cat(5, "YELLOW", 3.8), 6);
      cats.put(new Cat(12, "PINK", 7.8), 7);

      for (Map.Entry<Cat, Integer> pair : cats.entrySet()) {
         Cat cat = pair.getKey();
         Integer id = pair.getValue();
         System.out.println(cat + " " + id);
      }
   }
}
