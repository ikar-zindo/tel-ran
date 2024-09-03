package lessoons.l6_task2_find_duplicate.task2_find_duplicate;

public class Main {
   public static void main(String[] args) {

      int[] arr = {1, 3, 4, 2, 4};

      System.out.println(findDuplicate(arr));
   }

   public static int findDuplicate(int[] arr) {
      boolean[] booleans = new boolean[arr.length];
      for (int value: arr) {
         if (booleans[value - 1]) return value;
         booleans[value - 1] = true;
      }
      return -1;
   }
}
