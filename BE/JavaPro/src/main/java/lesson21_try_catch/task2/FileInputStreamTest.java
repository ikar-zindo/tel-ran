package lesson21_try_catch.task2;

import java.io.*;

public class FileInputStreamTest {
   public static void main(String[] args) {

      InputStream in = null;

      try {
         // 1 способ создания FileInputStream
         in = new FileInputStream("test.txt");

         // Здесь какой-то код, который работает с потоком ввода in
         System.out.println("Мы что-то прочитали из файла");
      } catch (FileNotFoundException e) {
         System.out.println("Ошибка! Файл не существует.");
      } finally {
         if (in != null) {
            try {
               in.close();
               System.out.println("Файл был закрыт");
            } catch (IOException e) {
               System.out.println("Ошибка при закрытии файла");
            }
         }
      }

      // 2 способ создания FileInputStream
      File file = new File("test.txt");

      // Использование try с ресурсами позволяет нам избежать использования блока finally
      // InputStream in1 автоматически будут закрыт после того, как отработает try
      try (InputStream in1 = new FileInputStream(file)) {

//         System.out.println("Байт осталось := " + in1.available());
//         in1.skip(10);
//         System.out.println("Байт осталось := " + in1.available());

         int data = in1.read();

         while (data != -1) {
            System.out.print((char) data);
            if ((char) data == '!') {
               in1.skip(8);
            }
            data = in1.read();
         }

      } catch (Exception e) {
         System.out.println("Ошибка при работе с файлами");
      }

   }
}
