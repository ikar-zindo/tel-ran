package lesson7_iterator.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
   public static void main(String[] args) {

      List<String> fruits = new ArrayList<>();

      fruits.add("Apple");
      fruits.add("Banana");
      fruits.add("Cherry");
      fruits.add("Pineapple");
      fruits.add("Pear");
      fruits.add("Apricot");

      // Пройти по списку фрукты, если встречается фрукт на букву Р,
      // то удалить фрукты перед ним на букву А

      System.out.println("До удаления");
      System.out.println(fruits);


      ListIterator<String> listIterator = fruits.listIterator();

      while (listIterator.hasNext()) {
         String tmp = listIterator.next();

         if (tmp.startsWith("P")) {
            break;
         }
      }

      while (listIterator.hasPrevious()) {
         String tmp = listIterator.previous();

         if (tmp.startsWith("A")) {
            listIterator.remove();
         }
      }

      System.out.println("Снова прохрдимся по списку");
      while (listIterator.hasNext())
         System.out.println(listIterator.next());

      System.out.println("После удаления");
      System.out.println(fruits);
   }
}
