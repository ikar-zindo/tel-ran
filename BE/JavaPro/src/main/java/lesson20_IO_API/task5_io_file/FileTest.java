package lesson20_IO_API.task5_io_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileTest {
   public static void main(String[] args) throws IOException {

      File file = new File("testFile.txt");
      System.out.println("Существует ли файл? := " + file.exists());

      file.createNewFile();
      System.out.println("Существует ли файл? := " + file.isFile());

      File file1 = new File("first/second/third/fourth/test.txt");
      System.out.println("Существует ли файл? := " + file1.exists());
      file1.createNewFile();
      System.out.println("Существует ли файл? := " + file1.exists());

      File dir = new File("first");
      dir.mkdir();

      File dir1 = new File("first/second/third/fourth");
      dir1.mkdirs();

      System.out.println("Является ли file файлом? := " + file.isFile());
      System.out.println("Является ли file папкой? := " + file.isDirectory());
      System.out.println("Является ли dir папкой? := " + dir.isDirectory());
      System.out.println("Является ли dir папкой? := " + dir.isDirectory());

      System.out.println(file1.getAbsolutePath());

      File file2 = new File("C:/Java/test.txt");
      file2.createNewFile();
      System.out.println(file2.exists());

      InputStream in = new FileInputStream(file2);

      int read = in.read();

      while (read != -1) {
         System.out.print((char) read);
         read = in.read();
      }
   }
}
