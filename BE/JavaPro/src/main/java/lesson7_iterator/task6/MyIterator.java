package lesson7_iterator.task6;

import java.util.Iterator;
import java.util.List;

/**
 * Существует список чисел. Получаем из базы данных или Front-End`a
 * Реализовать, который возвращает чётные числа из переданой коллекции
 */

public class MyIterator implements Iterator<Integer> {

   private Iterator<Integer> iterator;
   private Integer next;

   public MyIterator(List<Integer> list) {
      iterator = list.iterator();
      moveToNext();
   }

   /**
    * Метод должен вернуть true, если в переданой коллекции ксть ещё чётные чисда
    */
   @Override
   public boolean hasNext() {
      return next != null;
   }

   /**
    * Вернёт следующее чётное число
    */
   @Override
   public Integer next() {
      moveToNext();
      return next;
   }

   private void moveToNext() {

      while (iterator.hasNext()) {
         Integer current = iterator.next();

         if (current % 2 == 0) {
            next = current;
            return;
         }
      }
      next = null;
   }
}
