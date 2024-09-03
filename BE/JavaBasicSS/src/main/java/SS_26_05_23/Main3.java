package SS_26_05_23;

public class Main3 {
   public static void main(String[] args) {
//      int a = 1;
//      while (a < 10) {
//         if (a % 2 == 0) {
//            System.out.println(a);
//            break;
//         }
//         a++;
//      }

      int b = 1;
      while (b < 10) {
         if (b % 2 == 0) {
            b++;
            continue;
         }
         System.out.println(b);
         b++;
      }
   }
}