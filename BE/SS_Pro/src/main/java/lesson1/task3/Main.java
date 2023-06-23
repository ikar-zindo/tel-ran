package lesson1.task3;

public class Main {

   public static void main(String[] args) {
      int[] nums = {1, 2, 3, 0, 5, 8};

      System.out.println(meth(nums));
   }

   static int meth(int[] nums) {
      int min = Integer.MAX_VALUE;
      int minThid = Integer.MAX_VALUE;

      for (int i = 0; i < nums.length; i++) {
         if (min > nums[i]) {
            min = nums[i];
         }
         if (nums[i] >= min && nums[i] < minThid) {
            minThid = nums[i];
         }
      }

      return minThid;
   }
}
