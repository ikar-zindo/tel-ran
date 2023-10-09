package lesson29_sync_atomic.task7_deadlock;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTypeTest {
   public static void main(String[] args) {

      AtomicInteger atomic = new AtomicInteger();

      // Установка значениея
      atomic.set(5);
      System.out.println(atomic);

      // Получения значения
      int result = atomic.get();
      System.out.println("Полученное значение := " + result);

      // Установка знаяения при определённом условии
      boolean result1 = atomic.compareAndSet(9, 15);
      System.out.println("Выполнена ли операция := " + result1);
      System.out.println("Значения атомика := " + atomic);

      System.out.println("==================================");

      result1 = atomic.compareAndSet(5, 15);
      System.out.println("Выполнена ли операция := " + result1);
      System.out.println("Значения атомика := " + atomic);

      System.out.println("==================================");

      // Добавляем какое-то значение к текущему
      result = atomic.addAndGet(7);
      System.out.println("Выведем полученный результат := " + result);
      System.out.println("Значения атомика := " + atomic);

      System.out.println("----------------------------------");

      result = atomic.getAndAdd(7);
      System.out.println("Выведем полученный результат := " + result);
      System.out.println("Значения атомика := " + atomic);

      System.out.println("==================================");

      // Увеличение атомика на еденицу
      result = atomic.incrementAndGet();
      System.out.println("Выведем полученный результат := " + result);
      System.out.println("Значения атомика := " + atomic);

      System.out.println("----------------------------------");

      result = atomic.getAndIncrement();
      System.out.println("Выведем полученный результат := " + result);
      System.out.println("Значения атомика := " + atomic);

      System.out.println("==================================");

      // Уменишение атомика на еденицу
      result = atomic.decrementAndGet();
      System.out.println("Выведем полученный результат := " + result);
      System.out.println("Значения атомика := " + atomic);

      System.out.println("----------------------------------");

      result = atomic.getAndDecrement();
      System.out.println("Выведем полученный результат := " + result);
      System.out.println("Значения атомика := " + atomic);

      System.out.println("==================================");

      // Установка нового знаяения в атомик
      result = atomic.getAndSet(50);
      System.out.println("Выведем полученный результат := " + result);
      System.out.println("Значения атомика := " + atomic);
   }
}
