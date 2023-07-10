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

      // 1. Создать лист.
      List<Integer> list1 = new ArrayList<>(100_000_000);
      meth2(list1);
      meth3(list1);
      meth4(list1);
      meth5(list1);
      meth6(list1);
      meth7(list1);
      meth8(list1);

      System.out.println();

      List<Integer> list2 = new ArrayList<>();
      meth2(list2);
      meth3(list2);
      meth4(list2);
      meth5(list2);
      meth6(list2);
      meth7(list2);
      meth8(list2);
   }

   // 2. В цикле наполнить лист 10 миллионами значений (от 1 до 10000000)
   public static void meth2(List<Integer> list) {

      long start = System.currentTimeMillis();
      for (int i = 0; i < 100_000_000; i++) {
         list.add(i + 1);
      }
      long end = System.currentTimeMillis();

      System.out.println("Initial List runtime: " + (end - start) + "ms");


   }

   // 3. Перебрать лист с помощью for-each, в теле цикла каждое значение листа записать в переменную temp.
   public static void meth3(List<Integer> list) {

      int temp = list.get(0);

      long start = System.currentTimeMillis();
      for (Integer i : list) {
         temp = i;
      }
      long end = System.currentTimeMillis();

      System.out.println("ForEach runtime: " + (end - start) + "ms");
   }

   // 4. Сделать то же самое с помощью классического for.
   public static void meth4(List<Integer> list) {

      int temp = list.get(0);

      long start = System.currentTimeMillis();
      for (int i = 0; i < list.size(); i++) {
         temp = list.get(i);
      }
      long end = System.currentTimeMillis();

      System.out.println("For loop runtime: " + (end - start) + "ms");
   }

   // 5. Сделать то же самое с помощью классического for, но сначала вынести размер листа в отдельную переменную, а потом эту переменную использовать внутри условия цикла.
   public static void meth5(List<Integer> list) {

      int temp = list.get(0);
      int listSize = list.size();

      long start = System.currentTimeMillis();
      for (int i = 0; i < listSize; i++) {
         temp = list.get(i);
      }
      long end = System.currentTimeMillis();

      System.out.println("For loop with listSize runtime: " + (end - start) + "ms");
   }

   // 6. Сделать то же самое, что и в пункте 5, но перебрать лист с конца до начала.
   public static void meth6(List<Integer> list) {

      int temp = list.get(0);
      int listSize = list.size();

      long start = System.currentTimeMillis();
      for (int i = listSize - 1; i >= 0; i--) {
         temp = list.get(i);
      }
      long end = System.currentTimeMillis();

      System.out.println("For loop reverse with listSize runtime: " + (end - start) + "ms");
   }

   // 7. Сделать то же самое, но используя Iterator.
   public static void meth7(List<Integer> list) {

      int temp= list.get(0);
      Iterator<Integer> iterator = list.iterator();

      long start = System.currentTimeMillis();
      while (iterator.hasNext()) {
         temp = iterator.next();
      }
      long end = System.currentTimeMillis();

      System.out.println("Iterator runtime: " + (end - start) + "ms");
   }

   public static void meth8(List<Integer> list) {
      int temp = list.get(0);
      ListIterator<Integer> listIterator = list.listIterator();

      long start = System.currentTimeMillis();
      while (listIterator.hasNext()) {
         temp = listIterator.next();
      }
      long end = System.currentTimeMillis();

      System.out.println("ListIterator runtime: " + (end - start) + "ms");
   }
}
