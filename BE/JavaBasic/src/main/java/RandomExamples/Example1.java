package RandomExamples;

import java.util.Random;

public class Example1 {
   public static void main(String[] args) {

      //примеры на базе Random класса

      // обозначение диапазонов
      // сгенерировать целые значения от 0 до 10:
      // (0;10) -> 1,2,3,4,5,6,7,8,9
      // [0;10) -> 0,1,2,3,4,5,6,7,8,9
      // [0;10] -> 0,1,2,3,4,5,6,7,8,9,10
      // (0;10] -> 1,2,3,4,5,6,7,8,9,10
      Random r = new Random(123);

      //генерация логического значения
      boolean q = r.nextBoolean();

      // целые числа
      int w = r.nextInt(); // диапазон [Integer.MIN_VALUE; Integer.MAX_VALUE]
      int e = r.nextInt(10); // [0;10) == [0;9]
      int t = r.nextInt(20, 25); // [20;25) == [20;24]

      // дробные числа
      double y = r.nextFloat(); //[0;1)

//      System.out.println(q);
//      System.out.println(w);
//      System.out.println(e);
//      System.out.println(t);
//      System.out.println(y);
      System.out.println(r.nextInt(0, 100));
      System.out.println(r.nextInt(0, 100));
      System.out.println(r.nextInt(0, 100));
      System.out.println(r.nextInt(0, 100));
      System.out.println(r.nextInt(0, 100));
   }
}
