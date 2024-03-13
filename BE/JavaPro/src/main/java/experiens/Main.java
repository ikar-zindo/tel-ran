package experiens;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

   public static void main(String[] args) throws IOException {
      countWordsInFile();
      findTxtFilesInDirectory();
      copyLastParagraphUsingRandomAccess();
   }

   // Усложненное Задание 1: Работа с классом File

    /*

   Написать метод, который читает файл "example.txt",
   подсчитывает количество слов в файле и записывает это количество
   в новый файл "word_count.txt". Использовать BufferedReader и BufferedWriter
   для эффективной работы с текстом.
*/
   public static void countWordsInFile() throws IOException {


   }

   // Усложненное Задание 2: Работа с классом Path

    /*

   Написать метод, который ищет все файлы с расширением ".txt"
   в текущей директории и её поддиректориях. Результаты поиска
           (пути к файлам) записать в файл "found_files.txt".*/
   public static void findTxtFilesInDirectory() throws IOException {
   }

   // Усложненное Задание 3: Работа с классом RandomAccessFile

   /**

    Написать метод, который открывает файл "example.txt"
    с использованием RandomAccessFile, переходит к последнему абзацу
    в файле и копирует его содержимое в новый файл "last_paragraph.txt".*/
   public static void copyLastParagraphUsingRandomAccess() throws IOException {

   }
}
