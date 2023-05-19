package SS_19_05_23;

public class Example1 {
   public static void main(String[] args) {
      int x = 10;
      byte y = (byte) (x + 2);

      System.out.println(y);
      System.out.println(Integer.toBinaryString(y));
   }
}