package lesson1.task4;

public class Main {

   public static void main(String[] args) {
      int[] nums = {1, 2, 3, 0, 5, 8, 5, 6, 0, 7};

      System.out.println(meth(nums));
   }

   static int meth(int[] nums) {
      int sum = 0;
      int start = 0;
      int finish = nums.length - 1;

      while (start < finish) {
         if (nums[start] % 2 == 0 && nums[finish] % 2 == 0) {
            sum += nums[start];
            sum += nums[finish];
         }
         start++;
         finish--;
      }
      return sum;
   }
}
