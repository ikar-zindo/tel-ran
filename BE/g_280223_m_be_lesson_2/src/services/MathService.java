package services;

public class MathService {

   public int calculate(int x, int y) {
      return x + y;
   }

   public void init() {
      System.out.println("MathService bean was created.");
   }

   public void destroy() {
      System.out.println("MathService bean was destroyed.");
   }
}
