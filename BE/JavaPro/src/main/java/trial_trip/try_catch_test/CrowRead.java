package trial_trip.try_catch_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class CrowRead {
   public static void main(String[] args) {

      File file = new File("crow.txt");

      try (InputStream in = new FileInputStream(file);
           ObjectInputStream crowIn = new ObjectInputStream(in)) {

         Crow crow1 = (Crow) crowIn.readObject();
         Crow crow2 = (Crow) crowIn.readObject();

         System.out.println(crow1);
         System.out.println(crow2);

      } catch (Exception e) {
         System.out.println("Ошибка чтения ворона!");
      }
   }
}
