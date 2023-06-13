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

      boolean repeat = true;

       while (repeat) {
         System.out.print("Choose a button (1-espresso, 2-americano, 3-cappuccino, 4-tea): ");
         button = sc.nextInt();

//         if (button >= 1 && button <= 4) {
//            break;
//         }

          if (button == 1){
             System.out.println("Your selection espresso");
             System.out.println(getEspresso() + "\n" + drinkIsReady());

             System.out.print("Would you like another drink? (1-yes, 0-no): ");
             repeat = sc.nextInt() == 1;

          } else if (button == 2) {
             System.out.println("Your selection americano");
             System.out.println(getAmericano());

             System.out.print("Would you like another drink? (1-yes, 0-no): ");
             repeat = sc.nextInt() == 1;

          } else if (button == 3) {
             System.out.println("Your selection cappuccino");
             System.out.println(getCappuccino());

             System.out.print("Would you like another drink? (1-yes, 0-no): ");
             repeat = sc.nextInt() == 1;

          } else if (button == 4) {
             System.out.println("Your selection tea");
             System.out.println(getTea());

             System.out.print("Would you like another drink? (1-yes, 0-no): ");
             repeat = sc.nextInt() == 1;

          } else {
             System.out.println("Error");
          }
       }

       sc.close();

      // todo дополнить код с циклом (новый напиток после приготовления напитка)
   }

   public static String getEspresso() {

      StringBuilder sb = new StringBuilder();
      sb.append("\tespresso in process");

      return sb.toString();
   }

   public static String getAmericano() {
      StringBuilder sb = new StringBuilder();
      sb.append(getEspresso()).append("\n");
      sb.append(getWater()).append("\n");
      sb.append(drinkIsReady());

//      String result = getEspresso();
//      result += "\n";
//      result += getWater();
//      result += "\n";
//      result += drinkIsReady();

      return sb.toString();
   }

   public static String getCappuccino() {
      StringBuilder sb = new StringBuilder();

      sb.append(getEspresso()).append("\n");
      sb.append("\tadding some foam milk").append("\n");
      sb.append(drinkIsReady());

//      String result = getEspresso();
//      result += "\n";
//      result += "\tadding some foam milk";
//      result += "\n";
//      result += drinkIsReady();

      return sb.toString();
   }

   public static String getTea() {
      StringBuilder sb = new StringBuilder();

      sb.append("\tadding package").append("\n");
      sb.append(getWater()).append("\n");
      sb.append(drinkIsReady());

//      String result = "\tadding package";
//      result += "\n";
//      result += getWater();
//      result += "\n";
//      result += drinkIsReady();

      return sb.toString();
   }

   public static String getWater() {
      StringBuilder sb = new StringBuilder();

      sb.append("\tadding some water");

      return sb.toString();
   }

   public static String drinkIsReady() {
      StringBuilder sb = new StringBuilder();

      sb.append("Your drink is ready");

      return sb.toString();
   }
}
