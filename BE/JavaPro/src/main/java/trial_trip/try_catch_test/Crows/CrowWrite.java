package trial_trip.try_catch_test.Crows;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class CrowWrite {
   public static void main(String[] args) {

      File file = new File("crow.txt");

      Crow crow1 = new Crow("Crow 1", 25, 2.38);
      Crow crow2 = new Crow("Crow 2", 12, 3.15);

      System.out.println(crow1);
      System.out.println(crow2);

      try (OutputStream out = new FileOutputStream(file);
           ObjectOutputStream crowOut = new ObjectOutputStream(out)) {

         file.createNewFile();

         crowOut.writeObject(crow1);
         crowOut.writeObject(crow2);

      } catch (Exception e) {
         System.out.println("Ошибка записи ворона!");
      }
   }
}