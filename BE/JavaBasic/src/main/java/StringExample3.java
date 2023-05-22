public class StringExample3 {
   public static void main(String[] args) {
      // пример со substring()

      String input1 = "Hello, Java, it`s 283023m.";

      System.out.println(input1);

      String result1 = input1.substring(13);
      System.out.println(result1);

      String result2 = input1.substring(7, 11);
      System.out.println(result2);
   }
}