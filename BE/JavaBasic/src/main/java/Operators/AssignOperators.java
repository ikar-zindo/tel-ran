package Operators;

public class AssignOperators {
   public static void main(String[] args) {
      // примеры операторов присваивания
      int q = 10;

      // комплексный оператор присваивания

      // пример из унарного оператора
//      q++;                     // эквивалент q = q + 1

      // пример из оператора присваивания
      q += 1000;                 // q = q + 1000
      System.out.println(q);     // 1010

      q -= 10;                   // q = q - 10
      System.out.println(q);     // 1000

      q *= 5;                    // q = q * 5
      System.out.println(q);     // 5000

      q /= 20;                   // q = q / 20
      System.out.println(q);     // 250

      q %= 3;                    // q = q % 3
      System.out.println(q);     // 1

      // случай с интервью (будте внимательны, исключения)
      int w = 10;
      w =- 100;
      System.out.println(w);
   }
}