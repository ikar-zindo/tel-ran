package lesson21_try_catch.task4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class CatWriteTest {
   public static void main(String[] args) {

      File file = new File("cat.txt");

      Cat cat1 = new Cat(4, "BLACK", 5.23);
      Cat cat2 = new Cat(7, "GRAY", 7.4);

      System.out.println(cat1);
      System.out.println(cat2);

      try (OutputStream out = new FileOutputStream(file);
           ObjectOutputStream catOut = new ObjectOutputStream(out)) {

         file.createNewFile();

         catOut.writeObject(cat1);
         catOut.writeObject(cat2);

      } catch (Exception e) {
         System.out.println("Ошибка записи котов!");
      }
   }
}
