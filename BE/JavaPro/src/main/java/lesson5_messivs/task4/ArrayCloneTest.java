package lesson5_messivs.task4;

public class ArrayCloneTest {
   public static void main(String[] args) {

      int[][] numbers = {  {1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9}};

      System.out.println("Элемент исходного массива [1][1] - " + numbers[1][1]);

      int[][] copy = numbers.clone();

      copy[0] = numbers[0].clone();
      copy[1] = numbers[1].clone();
      copy[1][1] = 0;

      System.out.println("Элемент исходного массива [1][1] - " + numbers[1][1]);
      System.out.println("Элемент исходного массива [1][1] - " + copy[1][1]);
   }
}
