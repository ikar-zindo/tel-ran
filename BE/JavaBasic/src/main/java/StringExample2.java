public class StringExample2 {
   public static void main(String[] args) {
      // практика метода charAt(index)
      //
      String input1 = "Hello, Java, it`s 283023m.";

      System.out.println(input1);
      System.out.println(input1.charAt(0));
      System.out.println(input1.charAt(1));
      System.out.println(input1.charAt(2));
      System.out.println(input1.charAt(3));
      System.out.println(input1.charAt(4));
      System.out.println(input1.charAt(5));
      System.out.println(input1.charAt(25));

      // универсальный подход по выводу последнего элемента строки
      System.out.println(input1.charAt(input1.length() - 1));
   }
}