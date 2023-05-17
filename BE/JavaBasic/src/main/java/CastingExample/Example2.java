package CastingExample;

public class Example2 {
   public static void main(String[] args) {
      // примеры сужения
      // double -> float -> long -> int -> short -> byte

      byte q = 10;
      int w = 140;
      double e = 134.56;

      // без потери данных
      float a = (float) e;
      short s = (short) w;

      // потери данных
      int d = (int) e;
      byte f = (byte) w;
      byte g = (byte) e;

      System.out.println(g);
   }
}