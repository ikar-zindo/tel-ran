package lesson5_messivs.task1;

import lesson4_Autoboxing.task1.Cat;

import java.util.Arrays;

public class ArrayTest {
   public static void main(String[] args) {

      //Создаём массив типа int длинной 5
      int [] numbers = new int[5];

      // Выводим в консоль длинну массива через его свойсива
      System.out.println("Длинна массива" + numbers.length);

      // Не можем поменять длинну массива
//      numbers.length = 5;

      // Присваиваем значение в ячейку массива
      numbers[3] = 15;

      // Считываем значение из ячейке
      System.out.println("Значение ячейки 3 - " + numbers[3]);

      // Считываем значения по умолчанию
      System.out.println("Значение ячейки числовоно типа по умолчанию - " + numbers[0]);

      boolean[] booleanArr = new boolean[5];

      System.out.println("Значения ячеек логического типа по-умолчанию - " + Arrays.toString(booleanArr));

      Cat[] cat = new Cat[5];

      System.out.println("Значения ячеек ссылочного типа по-умолчанию - " + Arrays.toString(cat));

      // Создаём массив сразу с определёнными значеничми
      int[] numbers1 = {5, 8, 2, 9, 1};
      System.out.println(Arrays.toString(numbers1));

      boolean[] booleans = {false, true, true, false};
      System.out.println(Arrays.toString(booleans));

      Cat[] cats1 = {new Cat(3, "BLACK"), new Cat(5, "WHITE"), new Cat(2, "GREEN")};
      System.out.println(cats1.length);

      System.out.println("Цвет кота в последней ячейке - " + cats1[cats1.length - 1].getColor());
   }
}
