package HoWk4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * 1. Создать лист.
 * 2. В цикле наполнить лист 10 миллионами значений (от 1 до 10000000)
 * 3. Перебрать лист с помощью for-each, в теле цикла каждое значение листа записать в переменную temp.
 * 4. Сделать то же самое с помощью классического for.
 * 5. Сделать то же самое с помощью классического for, но сначала вынести размер листа в отдельную переменную, а потом эту переменную использовать внутри условия цикла.
 * 6. Сделать то же самое, что и в пункте 5, но перебрать лист с конца до начала.
 * 7. Сделать то же самое, но используя Iterator.
 * 8. Сделать то же самое, но используя ListIterator.
 * Для всех случаев 3-8 замерить время, в течение которого отрабатывает цикл:
 *    1. Замеряете текущее время до цикла с помощью метода System.currentTimeMillis();
 *    2. Замеряете текущее время после цикла с помощью метода System.currentTimeMillis();
 *    3. Выводите разницу во времени после и до в консоль.
 * Кроме затраченного времени выводить в консоль больше ничего не нужно, т.к. это существенно замедлит работу, смысл эксперимента будет потерян.
 * Если отрабатывает очень быстро, и разница не особо понятна, попробовать на 100 миллионах значений.
 */

public class Main {
   public static void main(String[] args) {

      List<Integer> list = new ArrayList<>(10_000_000);

      meth2(list);
      meth3(list);
      meth4(list);
      meth5(list);
      meth6(list);
      meth7(list);
      meth8(list);

   }

   // 2. В цикле наполнить лист 10 миллионами значений (от 1 до 10000000)
   public static void meth2(List<Integer> list) {

      for (int i = 0; i < 10_000_000; i++) {
         list.add(i + 1);
      }
   }

   // 3. Перебрать лист с помощью for-each, в теле цикла каждое значение листа записать в переменную temp.
   public static void meth3(List<Integer> list) {

      long temp = list.get(0);
      for (Integer i : list) {
         temp = i;
      }

      System.out.println("Last temp: " + temp);
   }

   // 4. Сделать то же самое с помощью классического for.
   public static void meth4(List<Integer> list) {

      long temp = list.get(0);
      for (int i = 0; i < list.size(); i++) {
         temp = list.get(i);
      }

      System.out.println("Last temp: " + temp);
   }

   // 5. Сделать то же самое с помощью классического for, но сначала вынести размер листа в отдельную переменную, а потом эту переменную использовать внутри условия цикла.
   public static void meth5(List<Integer> list) {

      long temp = list.get(0);
      int listSize = list.size();
      for (int i = 0; i < listSize; i++) {
         temp = list.get(i);
      }

      System.out.println("List size: " + temp);
   }

   // 6. Сделать то же самое, что и в пункте 5, но перебрать лист с конца до начала.
   public static void meth6(List<Integer> list) {

      long temp = list.get(0);
      int listSize = list.size();
      for (int i = listSize - 1; i >= 0; i--) {
         temp = list.get(i);
      }

      System.out.println("Last temp: " + temp);
   }

   // 7. Сделать то же самое, но используя Iterator.
   public static void meth7(List<Integer> list) {

      long temp= list.get(0);
      Iterator<Integer> iterator = list.iterator();

      while (iterator.hasNext()) {
         temp = iterator.next();
      }

      System.out.println("Last temp: " + temp);
   }

   public static void meth8(List<Integer> list) {
      long temp = list.get(0);
      ListIterator<Integer> listIterator = list.listIterator();

      long start = System.currentTimeMillis();
      while (listIterator.hasNext()) {
         temp = listIterator.next();
      }
      long end = System.currentTimeMillis();

      System.out.println("ListIterator runtime: " + (end - start) + "ms");
   }
}
