package Cycles;

public class CyclesCompare {
   public static void main(String[] args) {

      int[] a = {5,4,3,1,9,6,8,2};
      // idx     0 1 2 3 4 5 6 7

      // classic for-loop
      for (int i = 0; i < a.length; i++)
         System.out.print(a[i] + " ");

      System.out.println();

      // for-each
      for (int e : a)
         System.out.print(e + " ");

      System.out.println();

      // while
      int i = 0;
      while (i < a.length) {
         System.out.print(a[i] + " ");
         i++;
      }

      System.out.println();

      // do-while
      int j = 0;
      if (j < a.length) {
         do {
            System.out.print(a[j] + " ");
            j++;
         } while (j < a.length);
      }

      System.out.println();

   }
}
