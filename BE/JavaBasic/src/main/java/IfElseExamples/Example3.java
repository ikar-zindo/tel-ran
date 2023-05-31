package IfElseExamples;

public class Example3 {
   public static void main(String[] args) {
      // если у нас будет хорошая погода, то мы поедем за город
      // при этом если останется время - покатанемся на лодке

      boolean goodWeather = true;
      boolean freeTime = true;

      // 1. настоящий nested if (наиболее гибкое решение)
      if (goodWeather) {
         System.out.println("Едем за город");

         if (freeTime) {
            System.out.println("Катаемся на лодке");
         }
      }

      // 2. nested if с финальный обозначением результата, который можно передать
//      if (goodWeather) {
//         if (freeTime) {
//            System.out.println("Едем за город, катамся на лодке");
//         }
//      }

      // 3. Самая короткая запись блока 2
//      if (goodWeather) if (freeTime) System.out.println("Едем за город, катамся на лодке");

      // 4. Видоизменённая запись блока 2 через логический оператор
//      if (goodWeather && freeTime) {
//         System.out.println("Едем за город, катамся на лодке");
//      }
   }
}
