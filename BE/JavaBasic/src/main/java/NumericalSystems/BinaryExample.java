package NumericalSystems;

public class BinaryExample {
   public static void main(String[] args) {
      int q = 542;

      // более длинный способ 10 -> 2
      System.out.println(q / 2); // 271
      System.out.println(q % 2);       // 0

      System.out.println(271 / 2); // 135
      System.out.println(271 % 2);     // 1

      System.out.println(135 / 2); //67
      System.out.println(135 % 2);      // 1

      System.out.println(67 / 2); // 33
      System.out.println(67 % 2);       // 1

      System.out.println(33 / 2); // 16
      System.out.println(33 % 2);       // 1

      System.out.println(16 / 2); // 8
      System.out.println(16 % 2);       // 0

      System.out.println(8 / 2); // 4
      System.out.println(8 % 2);     // 0

      System.out.println(4 / 2); // 2
      System.out.println(4 % 2);       // 0

      System.out.println(2 / 2); // 1
      System.out.println(2 % 2);       // 0

      System.out.println(1 / 2); // 0
      System.out.println(1 % 2);       // 1

      // result = 10 0001 1110
      int q2 = 0b1000011110;
      //         9876543210

      // более короткий путь 10 -> 2
      System.out.println(Integer.toBinaryString(q));

      // более долгий путь 2 -> 10
      double result = 1*Math.pow(2, 9) + 1*Math.pow(2, 4) + 1*Math.pow(2, 3) + 1*Math.pow(2, 2) + 1*Math.pow(2, 1);

      // более короткий путь 2 -> 10
      System.out.println(q2);
   }
}