package RandomExamples;

public class Example2 {
   public static void main(String[] args) {

      //примеры на базе Math.random()

      // примеры на базе Math.random();
      double q = Math.random(); // [0;1)

      int w = (int) (Math.random() * 100); // [0;99] == [0;100)
      byte r = (byte) (Math.random() * 100); // [0;99] = [0;100]

      // [3;20]

      // 1й подход (не совсем верный) -> не будет включаться 20
      // [0;1) * 17 = ([0;17) - int) == [0;16] - целые значения
      // [0;17) + 3 = [3;20) = эквивалент [3;19]
      // [0;16] + 3 = [3;19] = эквивалент [3;20)

      // 2й подход (верный -> будет вклюсатся 20
      // [0;1) * (17 + 1) = ([0;18) - int) == [0;17] целые числа
      // [0;17] + 3 = [3;20]

      // фомула трансформации из [0;1) -> [min;max]
      // (Math.random() * ((max - min) + 1) + min

      int e = (int) (Math.random() * (17 + 1)) + 3;

      System.out.println(e);
      System.out.println(r);
   }
}
