package Operators;

public class LogicOperators {
   public static void main(String[] args) {
      int q = 10;
      int w = 20;
      int e = 30;
      int r = 40;

      boolean tmp1 = q < w;
      boolean tmp2 = e < r;

      System.out.println("Logic AND example: ");
      // Логический оператор "И" (&&)
      System.out.println(tmp1 && tmp2);

      //                        true
      //                  true   |   true
      //                   |     |    |
      System.out.println((q <w) && (e < r));

      //                        false
      //                   true   |  false
      //                    |     |    |
      System.out.println((q < w) && (e > r));

      //                        false
      //                  false   |  false
      //                    |     |    |
      System.out.println((q > w) && (e > r));

      System.out.println();
      // Логический оператор "ИЛИ" (||)
      System.out.println("Logic OR example: ");


      //                        true
      //                  true   |  true
      //                   |     |    |
      System.out.println((q <w) || (e < r));

      //                         true
      //                   true   |  false
      //                    |     |    |
      System.out.println((q < w) || (e > r));

      //                        false
      //                  false   |  false
      //                    |     |    |
      System.out.println((q > w) || (e > r));

      System.out.println();
      // Логический оператор "НЕ" (!)
      System.out.println("Logic NOT example: ");

      //               false
      //                 |       true
      //                 |  true  |  true
      //                 |   |    |    |
      System.out.println(!((q <w) || (e < r)));

      //               true
      //                 |        false
      //                 | false   |  false
      //                 |   |     |    |
      System.out.println(!((q > w) || (e > r)));

      //                        false
      //                  false   | true
      //                    |     |  | false
      //                    |     |  |   |
      System.out.println(((q > w) || !(e > r)));

      // Exercise
      // int q = 10;
      // int w = 20;
      // int e = 30;
      // int r = 40;

      boolean result10 = (!(((q < r) && (r > w)) || (q < w)) && (e <r)) || !(e > q);
      System.out.println(result10);
   }
}