package lesson4.hanoiTower;

public class hanoiTower {
   public static void main(String[] args) {

      System.out.println(H(10,"A","C","B"));
   }

   public static String H(int n,String A,String C,String B) {
      if (n==1) return A + C + " ";
      return H(n-1, A, B, C) + A + C + " "
              + H(n-1, B, C, A);
   }
}
