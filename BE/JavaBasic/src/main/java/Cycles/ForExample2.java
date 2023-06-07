package Cycles;

import java.util.Arrays;

public class ForExample2 {
   public static void main(String[] args) {

      // 1. бесконечный цикл из-за диапазона значений byte
//        for (byte i = 0; i < 150; i++) {
//            System.out.println(i);
//        }

      // 2. цикл, который не нужно реализовывать в продакшн
//        for (double i = 0; i < 1; i += 0.1) {
//            System.out.println(i);
//        }

      int[] a = {5,4,3,1,9,6,8,2};
      // idx     0 1 2 3 4 5 6 7

      // 3. задача вывести индекс + текущий элемент + элемент * 10 + элемент^2
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(i + " " + a[i] + " " + a[i]*10 + " " + Math.pow(a[i], 2));
//        }

      // 4. найти максимальный элемент в массиве
//        int max = a[0];
//
//        for (int i = 1; i < a.length; i++) {
//            if (a[i] > max)
//                max = a[i];
//        }
//
//        System.out.println(max);

      // 5. найти среднее значение
//        double sum = 0;
//        for (int i = 0; i < a.length; i++) {
//            sum += a[i];
//        }
//
//        System.out.println(sum / a.length);

      // 6. ternary + for loop (affect for increment)
//        for (int i = 0; i < 10; i += 2) {
//            int s = i % 2 == 0 ? i-- : i++;
//            System.out.print(s + " ");
//        }

      // 7. комплексные инициализации + апдейтеры
      for (int i = 0, j = 10; i <= j; i++, j--) {
         System.out.println(i + " " + j);
      }
   }
}