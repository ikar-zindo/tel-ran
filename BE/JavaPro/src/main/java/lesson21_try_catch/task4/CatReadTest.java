package lesson21_try_catch.task4;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class CatReadTest {
   public static void main(String[] args) {

      File file = new File("cat.txt");

      try (InputStream in = new FileInputStream(file);
           ObjectInputStream catIn = new ObjectInputStream(in)) {

//         Object cat1 = catIn.readObject();
//         Object cat2 = catIn.readObject();

         Cat cat1 = (Cat) catIn.readObject();
         Cat cat2 = (Cat) catIn.readObject();

         System.out.println(cat1);
         System.out.println(cat2);

      } catch (Exception e) {
         System.out.println("Ошибка чтения котов!");
      }
   }
}
