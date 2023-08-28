package lesson12_map.task1;

import lesson4_Autoboxing.task1.Cat;

import java.util.*;

public class MapTest {
   public static void main(String[] args) {

      Map<String, Integer> map = new HashMap<>();

      System.out.println("Пустая ли коллекция? := " + map.isEmpty());

      map.put("Orange", 200);
      map.put("Banana", 150);
      map.put("Apple", 95);
      map.put("Potato", 45);
      map.put("Carrot", 120);
      map.put("Pineapple", 350);
      map.put("Lemon", 220);
      map.put("Tomato", 111);

      System.out.println("Цена на морковь := " + map.get("Carrot"));
      System.out.println("Цена на морковь := " + map.get("Tomato"));
      System.out.println("Цена на абрикос := "+ map.get("Apricot"));

      map.put("Carrot", 220);

      System.out.println("Цена на морковь := " + map.get("Carrot"));

      System.out.println("Есть ли в списке помидор := " + map.containsKey("Tomato"));
      System.out.println("Есть ли в списке абрикос := " + map.containsKey("Apricot"));

      System.out.println("Есть ли в списке товар по цене 111 := " + map.containsValue(111));
      System.out.println("Есть ли в списке товар по цене 112 := " + map.containsValue(112));

      System.out.println("Пустая ли коллекция? := " + map.isEmpty());

      map.remove("Pineapple");

      System.out.println("Есть ли в списке ананас := " + map.containsKey("Pineapple"));

      System.out.println("Размер коллекции := " + map.size());

      // Вывод в консоль map при помощи println
      System.out.println(map);

      List<Cat> cats = new ArrayList<>();
      for (Cat cat : cats) {

      }

      System.out.println("Вывод всех ключей в консоль:");
      for (String currentKey : map.keySet()) {
         System.out.print(currentKey + " ");
      }
      System.out.println();

      System.out.println("Вывод всех значений в консоль:");
      for (Integer currentValue : map.values()) {
         System.out.print(currentValue + " ");
      }
      System.out.println();

      System.out.println("Вывод всех пар ключ-значение в консоль");
      for (Map.Entry<String, Integer> pair : map.entrySet()) {
         // Продукт - Х, цена - Х.
         String key = pair.getKey();
         Integer value = pair.getValue();
         System.out.printf("Продукт - %s, цена - %d.%n", key, value);
      }

      // Удалить из списка все товары дороже 190 и начинается на букву Т
      // Цикл for не подходит для одновременной итерации и изменения коллекции
      // для этих целей используется итератор
//      for (Map.Entry<String, Integer> pair : map.entrySet()) {
//         String key = pair.getKey();
//         Integer value = pair.getValue();
//
//         if (value > 190 || key.startsWith("T")) {
//            map.remove(key);
//         }
//      }

      Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

      while (iterator.hasNext()) {
         Map.Entry<String, Integer> pair = iterator.next();
         String key = pair.getKey();
         Integer value = pair.getValue();

         if (value > 190 || key.startsWith("T")) {
            iterator.remove();
         }
      }

      System.out.println("Вывод всех пар ключ-значение в консоль");
      for (Map.Entry<String, Integer> pair : map.entrySet()) {
         // Продукт - Х, цена - Х.
         String key = pair.getKey();
         Integer value = pair.getValue();
         System.out.printf("Продукт - %s, цена - %d.%n", key, value);
      }
   }
}
