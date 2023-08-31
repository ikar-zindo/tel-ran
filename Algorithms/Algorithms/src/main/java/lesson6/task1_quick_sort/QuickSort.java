package lesson6.task1_quick_sort;

import java.util.ArrayList;

public class QuickSort {
   public static void main(String[] args) {

      ArrayList<Integer> array = new ArrayList<>();
      array.add(5);
      array.add(4);
      array.add(11);
      array.add(2);
      array.add(9);
      array.add(8);
      array.add(3);
      array.add(1);
      array.add(0);

      System.out.println(quickSort(array));
   }

   public static ArrayList<Integer> quickSort(ArrayList<Integer> arr) {

      if (arr.size() <= 1) return arr;

      int pivot = arr.get(arr.size() - 1);
      ArrayList<Integer> left = new ArrayList<>();
      ArrayList<Integer> right = new ArrayList<>();

      for (int i = 0; i < arr.size() - 1; i++) {
         if (arr.get(i) < pivot) left.add(arr.get(i));
         else right.add(arr.get(i));
      }

      ArrayList<Integer> sortedLeft = quickSort(left);
      ArrayList<Integer> sortedRight = quickSort(right);
      ArrayList<Integer> result = new ArrayList<>();

      result.addAll(sortedLeft);
      result.add(pivot);
      result.addAll(sortedRight);

      return result;
   }
}
