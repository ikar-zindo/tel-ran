package RandomExamples;

public class Example2 {
   public static void main(String[] args) {

      // примеры на базе Math.random();
      double q = Math.random(); // [0;1)

      int w = (int) (Math.random() * 100); // [0;99] == [0;100)

      // [3;20]
      int e = (int) Math.random() * 17 + 3;

      System.out.println(e);
   }
}
