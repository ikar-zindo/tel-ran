package NumericalSystems;

public class OctalExample {
   public static void main(String[] args) {
      int i = 542;
      System.out.println(i / 8); // 67
      System.out.println(i % 8);       // 6

      System.out.println(67 / 8); // 8
      System.out.println(67 % 8);      // 3

      System.out.println(8 / 8); // 1
      System.out.println(8 % 8);       // 0

      System.out.println(1 / 8); // 0
      System.out.println(0 % 8);       // 1

      System.out.println(Integer.toOctalString(542));

      // конвертация 10 -> 8
      int q8 = 01036;
      //        3210 - степень
      System.out.println(q8);

      // более длинный способ перевода
      double resuslt1 = 1 * Math.pow(8, 3) + 0 * Math.pow(8, 2) + 3 * Math.pow(8, 1) + 6 * Math.pow(8, 0);
      System.out.println(resuslt1);

   }
}
