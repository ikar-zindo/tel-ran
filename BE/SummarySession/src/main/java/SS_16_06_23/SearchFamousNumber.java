package SS_16_06_23;

public class SearchFamousNumber {
   public static void main(String[] args) {
      int[] array = {2, 1, 5, 5, 6, 8, 7 ,6, 1};

      for (int i = 0; i < array.length; i++) {
         int count = 0;
         for (int j = i + 1; j < array.length; j++) {
            if (array[j] == array[i] && i != j){
               System.out.println(array[i] + " is repeated");
            }
         }
      }
   }
}
