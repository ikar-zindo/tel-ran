package ArrayExamples;
/*
Дан массив из значений 2 31 4 5 20 45 12 24 50 53, выведите на каждой
новой строке 1 эл (с начала), затем 2 и т. д.
 */
public class Task3 {
   public static void main(String[] args) {
      int[] a = {2, 31, 4, 5, 20, 45, 12, 24, 50, 53};

      // Вариант 1
      for (int i = 0; i < a.length; i++) {
         for (int j = 0; j <= i; j++) {
            System.out.print(a[j] + " ");
         }
         System.out.println();
      }

      // Вариант 2
      for (int i = 0; i < a.length; i++) {
         for (int j = 0; j < a.length; j++) {
            if (j > i)
               continue;
            System.out.print(a[j] + " ");
         }
         System.out.println();
      }
   }
}
