package lessoons.l4_hanoiTower.hanoiTower;

public class hanoiTower {
   public static void main(String[] args) {

      System.out.println(H(10,"A","C","B"));
      System.out.println(xor(true, false));
   }

   public static String H(int n,String A,String C,String B) {
      if (n==1) return A + C + " ";
      return H(n-1, A, B, C) + A + C + " "
              + H(n-1, B, C, A);
   }


   public static boolean xor(boolean a, boolean b) {
      return a ^ b;
   }
}
