package lessoons.l7_StackTest.HoWk;


public class Main {
   public static void main(String[] args) {

      int[] arr = {1, 5, 7, 9, 3, 4, 7, 0};

      findDuplicate(arr);
   }

   public static void findDuplicate(int[] arr) {
      int sum1 = 0;
      int sum2 = 0;
      for (int i = 1; i < arr.length; i++) {
         sum1 += i;
      }
      for (int i = 0; i < arr.length; i++) {
         sum2 += arr[i];
      }
      System.out.println(sum2 - sum1);
   }


}
