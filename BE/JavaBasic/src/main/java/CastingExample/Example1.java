package CastingExample;

public class Example1 {
   public static void main(String[] args) {
      // примеры расширения
      // byte -> short-> int -> long -> float -> double

      byte q = 10;
      int w = 140;
      double e = 134.56;

      short a = q;
      int s = q;
      long d = w;
      float f = w;
      double g = e;

      System.out.println(f);

      // primitive      class
      // boolean        Boolean
      // short          Short
      // int            Integer (!)
      // long           Long
      // float          Float
      // double         Double
      // char           Character (!)
   }
}