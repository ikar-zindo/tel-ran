package lessons6.task2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Создайте класс Range, который будет включать диапазон целых чисел
 * От и до (from, to), которые можно задать в конструкторе.
 * Реализуйте интерфейс Iterable<Integer> в этом классе (соответственно Iterator<Integer> для этого класса
 * Объект этого класса должен выдавать последовательность целых чисел в заданном диапазоне с шагом 1
 * Кто хочет сложнее с заданным шагом.
 *
 * Такой код должен работать:
 * Range range = new Range(-10, 20);
 *
 * for (Integer i : range) {
 *   System.out.print(i);
 * }
 */

public class Range<Integer> implements Iterable<Integer> {

   private int from;
   private int to;

   public Range(int from, int to) {
      if (to > from) {
         this.to = from;
         this.from = to;
      } else {
         this.from = from;
         this.to = to;
      }
   }

   @Override
   public Iterator<Integer> iterator() {
      return (Iterator<Integer>) new RangeIterator(this);
   }

   class RangeIterator implements Iterator<java.lang.Integer> {

      private final Range range;
      private int pointer;

      RangeIterator(Range range) {
         this.range = range;
         this.pointer = range.from;
      }

      @Override
      public boolean hasNext() {
         return pointer < range.to;
      }

      @Override
      public java.lang.Integer next() {
         if (!hasNext()) {
            throw new NoSuchElementException();
         }
         return pointer++;
      }
   }
}
