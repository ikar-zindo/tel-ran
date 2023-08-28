package lesson4_Autoboxing.task3;

public class AutoBoxingTest {
   public static void main(String[] args) {

      int intValue = 7;
      Integer integerValue = 5;

      System.out.println("Сумма: " + (intValue + integerValue));

      double doubleValue = integerValue.doubleValue();

      // {5, 8, 2, 6, 7} - список целочисленных значений

      // Раньше надо было вот так:
      Integer integer = new Integer(8);

      // Автоупауовка:
      Integer integer1 = 5;
      // И это тоже автоуваковка (присваеваем в переменную типа Integer типа int)
      Integer integer2 = intValue;

      // Автоупаковка (присваеваем в переменную типа int типа Integer)
      int intValue1 = integer1;

      // Раньше надо было вот так (когда не было автораспаковки)
      int intValue2 = integer1.intValue();


      /*
      int -> Integer
      double -> Double
      byte -> Byte
      short -> Short
      long -> Long
      float -> Float
      boolean -> Boolean
      char -> Character
       */

      boolean b1 = true;
      // Автоуавковка

   }
}
