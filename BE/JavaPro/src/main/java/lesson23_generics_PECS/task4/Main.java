package lesson23_generics_PECS.task4;

public class Main {
   public static void main(String[] args) {

      Pair<String, Integer> pair = new Pair<>("Hello!", 7);

      System.out.println(pair.getFirst());
      System.out.println(pair.getSecond());

      Pair<Double, Double> pair1 = new Pair<>(5.2, 9.8);

      System.out.println(pair1.getFirst());
      System.out.println(pair1.getSecond());
   }
}
