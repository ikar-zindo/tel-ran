package SwitchExamples;

import java.util.Scanner;

public class Example5 {
   public static void main(String[] args) {
      // представьте, что вы разрабатываете алгоритм для кофейного аппарата, в котором есть всего 4 кнопки.
      // Выбор напитков может быть следующий: эспрессо, американо, капучино, чай.
      // При нажатии кнопки, ваш напиток должен приготовиться.
      // Попробуйте отобразить в консоли процесс приготовления напитков, исходя из нажатой кнопки
      // (1-эспрессо, 2-американо, 3-капучино, 4-чай) через условные конструкции.
      //
      // Помимо этого сформируйте и разделите процесс на отдельные методы для их переиспользования,
      // т.к. напитки могут быть разделены на самостоятельные процессы:
      //
      // Эспрессо  - неразделимый процесс
      // Американо - эспрессо + добавление воды
      // Капучино  - эспрессо + добавление вспененного молока

      Scanner sc = new Scanner(System.in);

      int button;

       while (true) {
         System.out.print("Choose a button (1-espresso, 2-americano, 3-cappuccino, 4-tea): ");
         button = sc.nextInt();

         if (button >= 1 && button <= 4) {
            break;
         }
      }

      sc.close();

      // todo дополнить код с циклом (новый напиток после приготовления напитка)
      // todo заменить += в String объектах

      if (button == 1){
         System.out.println("Your selection espresso");
         System.out.println(getEspresso() + "\n" + drinkIsReady());
      } else if (button == 2) {
         System.out.println("Your selection americano");
         System.out.println(getAmericano());
      } else if (button == 3) {
         System.out.println("Your selection cappuccino");
         System.out.println(getCappuccino());
      } else if (button == 4) {
         System.out.println("Your selection tea");
         System.out.println(getTea());
      } else {
         System.out.println("Error");
      }
   }

   public static String getEspresso() {
      return "\tespresso in process";
   }

   public static String getAmericano() {
      String result = getEspresso();
      result += "\n";
      result += getWater();
      result += "\n";
      result += drinkIsReady();

      return result;
   }

   public static String getCappuccino() {
      String result = getEspresso();
      result += "\n";
      result += "\tadding some foam milk";
      result += "\n";
      result += drinkIsReady();

      return result;
   }

   public static String getTea() {
      String result = "\tadding package";
      result += "\n";
      result += getWater();
      result += "\n";
      result += drinkIsReady();

      return result;
   }

   public static String getWater() {
      return "\tadding some water";
   }

   public static String drinkIsReady() {
      return "Your drink is ready";
   }
}
