package SS_09_06_23;

public class BinarySearch {
   public static void main(String[] args) {
      int[] array = {0,1,2,4,6,9,10,14,17};
      int number = 14;

      binarySearch(array, number);
   }
   public static void binarySearch(int[] array, int number) {
      int start = 0;
      int end = array.length-1;
      while (end>=start){
         int mid =(start+end)/2;
         if (number==array[mid]){
            System.out.println("The index that we were looking for is: "+mid);
            break;
         }
         else if (number>array[mid])
            start = mid+1;
         else
            end = mid-1;
      }
   }
}
