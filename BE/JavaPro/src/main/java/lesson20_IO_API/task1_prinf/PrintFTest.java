package lesson20_IO_API.task1_prinf;

import lesson17_lambdas_practice.task2.Cat;

import java.util.Date;

public class PrintFTest {
   public static void main(String[] args) {

      System.out.print("One! ");
      System.out.print("Two! ");
      System.out.print("Three!");

      System.out.println();

      System.out.println("One!");
      System.out.println("Two! ");
      System.out.println("Three!");

      // \n - позволяет перенести курсор на следующую строку
      // \\n - первый \ экранирует сочетание \n и переноса строки не происходит,
      // вместо этого метод просто выводит \n в консоль
      System.out.println("Сужебные символы %n и \\n переносят информацию на новую строку.");
      System.out.printf("One!%nTwo!\nThree!%n\n");

      System.out.println("Подстовряем в строки целочисленные переменные.");
      int a = 23;
      int b = 100;
      System.out.printf("Сумма чисел %d и %d := %d.%n", a, b, a + b);
      System.out.printf("Суммв чисел " + a + " и "+ b + " := " + (a + b) + ".");

      System.out.println("Подставляем в строки строки.");
      String hello = "Всем привет!";
      System.out.printf("Значение переданой строки - %s%n", hello);
      System.out.printf("Значение переданой строки - %.5s%n", hello);
      System.out.printf("Значение переданой строки - %.5S%n", hello);

      System.out.println("Подставляем в строки дробные значения");
      double pi = Math.PI;
      System.out.printf("Число ПИ := %f.%n", pi);
      System.out.printf("Число ПИ := %d.%n", (int) pi);
      System.out.printf("Число ПИ := %.4f.%n", pi);
      System.out.printf("Число ПИ := %.2f.%n", pi);

      System.out.println("Подставляем в строки boolean значения");
      boolean bool = true;
      System.out.printf("Значение boolean переменной : = %b.%n", bool);
      System.out.printf("Значение boolean переменной : = %B.%n", bool);
      System.out.printf("Равны ли a и b? := %B.%n", a == b);
      System.out.printf("Boolean значения := %b.%n", 15);
      System.out.printf("Boolean значения := %b.%n", 0);

      Cat cat = new Cat(3, "BLACK", 5);
      cat = null;
      System.out.printf("Есть ли кот? := %b.%n", cat);

      System.out.println("Подставляем в строки символы");
      char ch = 'r';
      System.out.printf("Значение символа := %c.%n", ch);
      System.out.printf("Значение символа := %C.%n", ch);

      System.out.println("Ещё олна возможность для дробных чисел");
      double d1 = 123.456;
      double d2 = 123.456789123;

      System.out.printf("%50.3f%n", d1);
      System.out.printf("%50.9f%n", d2);
      System.out.println("12345678901234567890123456789012345678901234567890");

      Date date = new Date();
      System.out.println("Форматировние дат");
      System.out.println(date);
      System.out.printf("Значение даты := %tT.%n", date);
      // Часы := 10, минуты := 51, секунды := 51
      System.out.printf("Часы := %tH, минуты := %tM, секунды := %tS.%n", date, date, date);

      System.out.printf("%1$tA %1$td %1$tB %1$tY.%n", date);
   }
}
