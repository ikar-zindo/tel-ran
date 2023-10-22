package lesson24_exception.task3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {

   public static void main(String[] args) {
      first();
      System.out.println("Успешное завершение программы!");
   }

   public static void first() {
      second();
   }
   public static void second() {
      try {
         third();
      } catch (FileNotFoundException e) {
         System.out.println("Ошибка было обработана во втором методе");
      }
   }
   public static void third() throws FileNotFoundException {
      fourth();
   }
   public static void fourth() throws FileNotFoundException{
//      try {
         InputStream in = new FileInputStream("test1.txt");
//      } catch (FileNotFoundException e) {
//         System.err.println("Ошибка обработана в 4м методе");
//         e.printStackTrace();
//      }
   }
}
