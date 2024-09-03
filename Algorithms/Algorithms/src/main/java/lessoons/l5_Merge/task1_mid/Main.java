package lessoons.l5_Merge.task1_mid;

public class Main {
   public static void main(String[] args) {

      int[] arr = {10, 11, 12, 13, 14, 15, 1, 2, 3, 4, 5, 6, 7, 8, 9};

      int mid = arr.length / 2;
      int next = (mid + 1) % arr.length;
      int prev = (mid - 1 + arr.length) % arr.length;

      System.out.println(next);
      System.out.println(prev);


      long start = System.nanoTime();
      findIndex(arr);
      long end = System.nanoTime();
      System.out.println(end - start);

      start = System.nanoTime();
      rotation(arr);
      end = System.nanoTime();
      System.out.println(end - start);

      System.out.println(rotation(arr));
   }

   public static int findIndex(int[] arr) {
      int left = 0;
      int right = arr.length - 1;

      while (left <= right) {
         int mid = left + (right - left) / 2;

         if (mid > 0 && arr[mid] < arr[mid - 1]) {
            return mid;
         }

         if (arr[left] <= arr[mid] && arr[mid] > arr[right]) {
            left = mid + 1;
         } else {
            right = mid - 1;
         }
      }

      return left;
   }

   public static int rotation(int[] arr) {
      int left = 0;
      int right = arr.length - 1;

      while (left <= right) {
         if (arr[left] <= arr[right]) {
            return left;
         }

         int mid = (left + right) / 2;

         int next = (mid + 1) % arr.length;
         int prev = (mid - 1 + arr.length) % arr.length;
         if (arr[mid]<=arr[next] && arr[mid]<=arr[prev]){
            return mid;
         }
         else if (arr[mid]>=arr[left]){
            left = mid+1;
         }
         else if (arr[mid]<=arr[right]){
            right= mid-1;
         }
      }
      return -1;
   }
}
