package FourthHoWk;

public class Main {
   public static void main(String[] args) {

      double celsius = 2000;

      Converter c = new Converter(celsius); // объявляем экземпляр класса

      c.toKelvinVoid(); // to Kelvin метод void
      c.toFahrenheitVoid(); // to Fahrenheit метод void

      System.out.println();

      c.getPrintKelvin(); // to Kelvin метод return
      c.getPrintFahrenheit(); // to Fahrenheit метод return
   }
}