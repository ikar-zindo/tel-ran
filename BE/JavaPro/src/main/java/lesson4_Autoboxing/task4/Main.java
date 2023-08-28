package lesson4_Autoboxing.task4;

public class Main {
   public static void main(String[] args) {

      // Автоуваковка, кажлое число приводится к Integer
      Integer[] numbers = {3, 4, 5, 6, 7};

      //Написать метод, который суммирует все значения
      // массив и возвращаем результат

      // Автораспаковка, результат работы метода - Integer, и он приводится к int
      int sum = getSomOfArray(numbers);
      System.out.println("Сумма чисел массива: " + sum);


   }

   public static Integer getSomOfArray(Integer[] array) {
      int sum = 0;

      for (Integer current : array) {
         // Автораспаковка, current -> int
         sum += current;
      }
      // Автораспаковка, sum -> Integer
      return sum;
   }

   public static void test(Integer value) {

   }
}
