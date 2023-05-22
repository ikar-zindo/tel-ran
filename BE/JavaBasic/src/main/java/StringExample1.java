import java.util.Scanner;

public class StringExample1 {
   public static void main(String[] args) {
      // пример с length()
      String input1 = "Hello, Java, it`s 283023m.";
      String input2 = new String("Hello, Java.");

      System.out.println(input1.length());
      System.out.println(input2.length());

      // пример с length() вокруг Scanner
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter pls line: ");
      System.out.println("Length of input line is " + sc.nextLine().length());
      sc.close();
   }
}