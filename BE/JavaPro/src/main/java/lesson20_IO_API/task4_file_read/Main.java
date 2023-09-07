package lesson20_IO_API.task4_file_read;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
   public static void main(String[] args) throws IOException {

      InputStream in = new FileInputStream("test.txt");
//      int result = in.read();
//      char letter = (char) result;
//      System.out.println(result);
//      System.out.println(letter);

      int read = in.read();

      while (read != -1) {
         System.out.print((char) read);
         read = in.read();
         if (read == -1) {
            System.out.println();
            System.out.println("Файл закончился");
         }
      }
   }
}
