package ArrayExamples;

import java.util.Arrays;
import java.util.Random;

/*
Создайте массив из 15 случайных целых чисел из отрезка [0;9]. 
Подсчитайте сколько в массиве чётных элементов 
и выведете это количество на экран на отдельной строке.
 */
public class Task1 {
   public static void main(String[] args) {
      
      int[] a = new int[15];

      Random r = new Random();

      int count = 0;

      System.out.print("[");
      for (int i = 0; i < a.length; i++) {
         int tmp = r.nextInt(0, 10);

         a[i] = tmp;

         if (i == a.length - 1)
            System.out.print(tmp);
         else
            System.out.print(tmp + " ");

         if (a[i] % 2 == 0)
            count++;
      }
      System.out.println("]");

      System.out.println(Arrays.toString(a));

      System.out.println("колличество четных элементов = " + count);
   }
}
