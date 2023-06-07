import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
0. Напишите программу, которая принимает массив целых чисел и выводит на экран только нечетные числа.
1. Напишите программу, которая находит сумму элементов в массиве целых чисел.
2. Напишите программу, которая проверяет, является ли заданная строка палиндромом (читается одинаково слева направо и справа налево).
3. Напишите программу, которая находит среднее арифметическое значение элементов в массиве чисел типа double.
4. Напишите программу, которая удаляет дубликаты из списка строк.
5. Напишите программу, которая сортирует массив целых чисел в порядке возрастания с использованием сортировки пузырьком.
6. Напишите программу, которая ищет наибольшее и наименьшее значение в массиве целых чисел.
7. Напишите программу, которая переворачивает порядок элементов в массиве целых чисел.
8. Напишите программу, которая находит наиболее часто встречающийся элемент в массиве.
9. Напишите программу, которая сортирует список объектов класса "Студент" по их среднему баллу в порядке убывания.
 */
public class First {
   public static void main(String[] args) {

//      Exercise0();

//      Exercise1();

//      Exercise2();

//      Exercise3();

//      Exercise4();

//      Exercise5();

//      Exercise6();

//      Exercise7();

//      Exercise8();

      Exercise9();
   }

   // Exercise 0
   public static void Exercise0() {
      int[] array1 = {78, 14, 13, 54, 35, 16, 75}; // массив целых чисел для манипуляций

      for (int i = 0; i < array1.length; i++) { // цикл для нахождения чётных чисел
         if (array1[i] % 2 == 1) {
            System.out.println(array1[i]); // вывод в кончоль чёных числел
         }
      }
   }

   // Exercise 1
   public static void Exercise1() {
      int[] array1 = {78, 14, 13, 54, 35, 16, 75}; // массив целых чисел для манипуляций

      int sum = 0; // переменная для подсчёта суммы
      for (int i = 0; i < array1.length; i++) { // цикл для подсчёта суммы эл массива
         sum += array1[i];
      }
      System.out.println(sum); // вывод суммы в консоль
   }

   // Exercise 2
   public static void Exercise2() {
      String isPalindrome = "Level"; // пороверяемое слово

      String isisPalindromeToUpperCase = isPalindrome.toUpperCase(); // переводи в верхний регистр
      String reverse = reverse(isPalindrome).toUpperCase(); // используем метод описаный ниже, для переволрячивания строки в обратном порядке

      if (isisPalindromeToUpperCase.equals(reverse)) { // условие,  является ли слово палиндромом
         System.out.println("Слово " + isPalindrome + " является палиндромом.");
      } else {
         System.out.println("Слово " + isPalindrome + " НЕ является палиндромом.");
      }
   }

   // Метод для Exercise 2
   // Подключаем StringBuilder для переворачивания строки в обратном порядке
   // P.S. Я не знаю, как это работает. Но оно днлает то, что мне нужно
   public static String reverse(String str) {
      return new StringBuilder(str).reverse().toString();
   }

   // Exercise 3
   public static void Exercise3() {
      double[] array = new double[]{1.2, 2.9, 7}; // Массив double

      double average = 0; // переменная среднее арифметическое
      double sumMyArray2 = 0;  // переменная суммы эл массива

      for (int i = 0; i < array.length; i++) { // считаем сумму эл массива
         sumMyArray2 += array[i];
      }
      average = sumMyArray2 / array.length; // вычесляем среднее арифметическое
      System.out.println("Среднее арифметическое массива double: " + average); // Выыод значения в консоль
   }

   // !!! Exercise 4
   public static void Exercise4() {
      List<String> st = new ArrayList<>(); // Список строк
      st.add("Ivan");
      st.add("Ivan");
      st.add("Ivan");
      st.add("Maja");
      st.add("Maja");
      st.add("Maja");
      st.add("Monika");
      st.add("Monika");
      st.add("Bartek");

      for (int i = 0; i < st.size(); i++) {
         System.out.println(st);
         for (int j = i + 1; j < st.size(); j++) {
            if (st.get(i) == st.get(j)) {

               System.out.println(st.get(0));
               System.out.println(st.get(1));
               System.out.println(st.get(2));
               st.remove(i);
            }
            System.out.println(i);
            System.out.println(j);
            System.out.println();
         }
      }
      System.out.println(st);
   }

   // Exercise 5
   public static void Exercise5() {
      int[] array = {78, 14, 13, 54, 35, 16, 75}; // массив целых чисел для сортировки пузырьком

      System.out.println(Arrays.toString(array));

      for (int i = array.length - 1; i >= 1 ; i--) {
         for (int j = 0; j < i; j++) {
            if (array[j] > array[j + 1]) {
               int tmp = array[j];
               array[j] = array[j + 1];
               array[j + 1] = tmp;
            }
         }
      }
      System.out.println(Arrays.toString(array));
   }

   // Exercise 6
   public static void Exercise6() {
      int[] array = {100, 78, 14, 13, 54, 35, 16}; // массив целых чисел для поиска числа

      int max = array[0];
      int min = array[0];

      for (int i = 0; i < array.length - 1; i++) {
         if (max < array[i + 1]) {
            max = array[i + 1];
         }
         if (min > array[i + 1]) {
            min = array[i + 1];
         }
      }


      System.out.println("max = " + max);
      System.out.println("min = " + min);
   }

   public static void Exercise7() {
      int[] array = {100, 78, 14, 13, 54, 35, 16}; // массив целых чисел для реверса

      System.out.println(Arrays.toString(array));

      int start = 0;
      int end = array.length - 1;

      while (start < end) {
         int tmp = array[start];
         array[start] = array[end];
         array[end] = tmp;

         start++;
         end--;
      }

      System.out.println(Arrays.toString(array));
   }

   public static void Exercise8() {
      int[] array = {100, 78, 14, 100, 54, 14, 16, 14}; // массив целых чисел для реверса
      
      int famousNum = 0;
      int maxCount = 0;

      for (int i = 0; i < array.length; i++) {
         int count = 0;
         for (int j = 0; j < array.length; j++) {
            if (array[j] == array[i]){
               count++;
            }

            if (count > maxCount) {
               famousNum = array[i];
               maxCount = count;
            }
         }
      }

      System.out.println(famousNum);
   }

   public static void Exercise9() {
      List<Student> students = new ArrayList<>();
      students.add(new Student("Ivan", 91));
      students.add(new Student("Maria", 20));
      students.add(new Student("Marek", 45));
      students.add(new Student("Monika", 74));
      students.add(new Student("Michael", 86));
      students.add(new Student("Bob", 74));

      for (int i = 0; i < students.size(); i++) {
         System.out.print("Name: " + students.get(i).getName());
         System.out.println(". Score: " + students.get(i).getScore());
      }

      System.out.println();

      for (int i = 0; i < students.size() - 1; i++) {
         for (int j = 0; j < students.size() - 1 - i; j++) {
            if (students.get(j).getScore() < students.get(j + 1).getScore()) {
               students.set(j, students.get(j + 1));
               students.set(j + 1,  students.get(j));
            }
         }
      }

      for (int i = 0; i < students.size(); i++) {
         System.out.print("Name: " + students.get(i).getName());
         System.out.println(". Score: " + students.get(i).getScore());
      }
   }
}
