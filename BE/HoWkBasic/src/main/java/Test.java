/*
Напишите решение и вставьте код. Заменить каждый элемент массива с нечетным индексом на ноль.

Задание:
1.) Создайте массив из 8 случайных целых чисел из интервала [1;10]

2.) Отобразить массив на экране в виде строки

3.) Замените каждый элемент с нечетным индексом нулем

4.) Снова отобразите массив в отдельной строке
 */

import java.util.Arrays;
import java.util.Random;

public class Test {

   public static void main(String[] args) {

     int idx = 0;
     idx++;
     idx--;
     idx = idx + 1;
     idx =- 1;
     idx = idx % idx;

     if (idx >= 0) {
        --idx;
     } else {
        idx++;
     }
      System.out.println(idx);
   }
}
