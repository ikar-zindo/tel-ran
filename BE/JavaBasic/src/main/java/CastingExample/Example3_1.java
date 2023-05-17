package CastingExample;

public class Example3 {
   public static void main(String[] args) {
      // S = Pi * r^2

      int q = 10;
      float w = 3.16F;
      long e = 120;
      int r = 120;
      byte t = 12;
      short y = 225;

      long nanoS = System.nanoTime(); // nano seconds

      double a = q * w;
      float s = q * r;
      long d = e * r;
      int f = t * y;
      int g = (int) (t * e);

      System.out.println(a);
      System.out.println(s);
      System.out.println(d);
      System.out.println((short) f);
      System.out.println(g);

      System.out.println(nanoS);
   }
}