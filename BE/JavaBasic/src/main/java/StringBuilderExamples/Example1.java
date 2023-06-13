package StringBuilderExamples;

import java.util.Arrays;

public class Example1 {
   public static void main(String[] args) {

      // StringBuilder
      StringBuilder sb = new StringBuilder();
      sb.append("hello").append(" ").append("java").append("hello").append("q").append("w").append("hello").append(" ").append("java").append("hello").append("q").append("w").append("e");

      String finalString = sb.toString();

      System.out.println(sb.capacity());
      System.out.println(sb.reverse());

      sb.delete(0, 34);
      System.out.println(sb);
      System.out.println(sb.capacity());

      sb.trimToSize();
      System.out.println(sb.capacity());


      // StringBuffer
      StringBuffer sBuffer = new StringBuffer();
      sBuffer.append("hello");
      System.out.println(sBuffer);
   }
}
