package lesson7_iterator.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
   public static void main(String[] args) {

      List<String> fruits = new ArrayList<>();
      fruits.add("Orange");
      fruits.add("Banana");
      fruits.add("Kiwi");
      fruits.add("Apple");
      fruits.add("Pineapple");
      fruits.add("Apricot");

      // Получаем объкт итератора для нашей коллекции
      Iterator<String> iterator = fruits.iterator();

      // Спрашиваем, а есть ли ещё объекты в нашей коллекции
      System.out.println("Есть ли ещё объекты в коллекции - " + iterator.hasNext());

      // Получаем следующий элемент из коллекции
      System.out.println("Следующий элемент - " + iterator.next());

      // Получаем осташиеся элементы коллекции при помощи цикла
      while (iterator.hasNext()) {
         System.out.print(iterator.next() + " ");
      }

      System.out.println();

      for (int i = 0; i < fruits.size(); i++) {
         String currentElement = fruits.get(i);
         System.out.print(currentElement + " ");
      }

      System.out.println();

      iterator = fruits.iterator();

      while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
   }
}
