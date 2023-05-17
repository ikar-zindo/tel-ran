public class CharExample {
   public static void main(String[] args) {
      char q = 't';
      char w = 169;
      char e = '\u00AE';

      System.out.println((int) q);
      System.out.println(w);
      System.out.println(e);

      System.out.println();

      // базовые мат. операции над типом char
      System.out.println((char) (q + q));
      System.out.println((char) (q - q));
      System.out.println((char) (q * q));
      System.out.println((char) (q / q));
      System.out.println((char) (q % q));

      System.out.println();
      // char -> int
      // 1. ASCII
      char r = 'ܮ';
      int rInt = (int) r; // можно не использовать (int)
      System.out.println(rInt);

      // цифра в качестве символа
      // 2. String.valueOf();
      char t = '9';

      // длинная запись
      String preResult = String.valueOf(t);
      int result = Integer.parseInt(preResult);

      // короткая запись
//      int result = Integer.parseInt(String.valueOf(t));


      System.out.println(result + 1);
      System.out.println(preResult + 1);
      System.out.println(t + 1);

      // 3. Character.getNumericValue();
      char y = 'b';

      double result3 = Character.getNumericValue(y);
      System.out.println(result3 + 2);
   }
}