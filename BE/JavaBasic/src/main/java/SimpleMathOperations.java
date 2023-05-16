public class SimpleMathOperations {
   public static void main(String[] args) {

      // логичемкие переменные
      boolean freeTime = true;
//      System.out.println(freeTime);

      // целочисленные переменные
      byte b = 10;
      short s = 23_000;
      int i = -2_000_000_000;
      long l = -10_101_001_010_101_010L;
//      System.out.println(l);

      // числа с поавающей запятой
      float f = 3.1234567890F;
      double d = 2.1234567890123456789;
//      System.out.println(f);
//      System.out.println(d);

      // символы
      char ch = 'q';
//      System.out.println(ch);

      // базовые математические операции + - * / %
      System.out.println(b + s);
      System.out.println(b - s);
      System.out.println(b * s);
      System.out.println(b / s);
      System.out.println(s / b);

      System.out.println(9 % 2);

      // диапазоны
      System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
      System.out.println(Short.MIN_VALUE + " " + Short.MAX_VALUE);
      System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
      System.out.println(Integer.MAX_VALUE + 1);
   }
}
