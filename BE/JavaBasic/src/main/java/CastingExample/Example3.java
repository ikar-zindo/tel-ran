package CastingExample;

public class Example3 {
   public static void main(String[] args) {
      // S = Pi * r^2

      int r = 10;
      double result = Math.pow(r, 2) * Math.PI;
      System.out.println((float) result);

   }
}
