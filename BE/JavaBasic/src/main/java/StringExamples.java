public class StringExamples {
   public static void main(String[] args) {

      // создаём объкты как литералы (String pool)
      String a = "hello";
      String b = "hello";

      // срособы сравнения:
      // a == b      => сравниваем ссылки переменных
      // a.equals(b) => сравниваем значения переменных

      System.out.println(a == b);
      System.out.println(a.equals(b));

      System.out.println();

      // создаём объекты не как литералы, т.е. с исрользованием new String()
      String c = new String("Java");
      String d = new String("Java");

      System.out.println(c == d);
      System.out.println(c.equals(d));
   }
}