package lessoons.l6_task2_find_duplicate.task1_quick_sort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort1 {

   public static List<Integer> quickSort(List<Integer> arr) {
      if (arr.size() <= 1) {
         return arr;
      }

      int pivot = arr.get(arr.size() - 1);
      int index = 0;

      for (int i = 0; i < arr.size() - 1; i++) {
         if (arr.get(i) < pivot) {
            swap(arr, i, index);
            index++;
         }
      }
      swap(arr, arr.size()-1, index);
      List<Integer> left = quickSort(arr.subList(0, index));
      List<Integer> right = quickSort(arr.subList(index + 1, arr.size()));

      List<Integer> result = new ArrayList<>();
      result.addAll(left);
      result.add(pivot);
      result.addAll(right);

      return result;
   }

   public static void swap(List<Integer> arr, int i, int j) {
      int temp = arr.get(i);
      arr.set(i, arr.get(j));
      arr.set(j, temp);
   }

   public static void main(String[] args) {
      List<Integer> input = new ArrayList<>();
      input.add(5);
      input.add(4);
      input.add(3);
      input.add(2);
      input.add(1);

      List<Integer> sorted = quickSort(input);
      System.out.println(sorted);
   }
}
