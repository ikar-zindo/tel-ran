package NumericalSystems;

public class BinaryExample2 {
   public static void main(String[] args) {
      // Byte лежит [-128; 127], либо [0; 255]
      System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
      // 1 byte = 8 bits

      int test1 = 0b000000000;
      int test2 = 0b111111111;
      System.out.println(test1);
      System.out.println(test2);
   }
}
