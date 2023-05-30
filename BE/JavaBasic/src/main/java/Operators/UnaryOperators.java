package Operators;

public class UnaryOperators {
   public static void main(String[] args) {
      int q = 123;
//      System.out.println(Integer.toBinaryString(q));

      // 00000000 00000000 00000000 01111011
      int q2 = 0b00000000000000000000000001111011;
      int q3 = 0b11111111111111111111111110000100;

      System.out.println(q2);
      System.out.println(q3);

      System.out.println(~q);
   }
   public static void getExample5() {
      // step 4
      int q = 10;
      System.out.println(q);  // 10
      System.out.println(q++);// 10
      System.out.println(q--);// 11
      System.out.println(q);  // 10
   }

   public static void getExample4() {
      // step 3
      int q = 10;
      System.out.println(q);  // 10
      System.out.println(++q);// 11
      System.out.println(--q);// 10

   }
   public static void getExample3() {
      // step 2 (постфиксная форма)
      int q = 10;
      System.out.println(q);  // 10
      q++;                    // q = q + 1 // инкремент (increment), унарный оператор (постфиксная форма)
      System.out.println(q);  // 11
      q--;                    // q = q - 1 // декремент (decrement), унарный оператор (постфиксная форма)
      System.out.println(q);  // 10
   }

   public static void getExample2() {
      // step 1 (префиксная форма)
      int q = 10;
      System.out.println(q);  // 10
      ++q;                    // q = q + 1 // инкремент (increment), унарный оператор (префиксная форма)
      System.out.println(q);  // 10
      --q;                    // q = q - 1 // декремент (decrement), унарный оператор (префиксная форма)
      System.out.println(q);  // 11
   }

   public static void getExample1() {
      // classic way
      int q = 10;
      System.out.println(q); // 10
      q = q + 1;
      System.out.println(q); // 11
      q = q - 1;
      System.out.println(q); // 10
   }
}