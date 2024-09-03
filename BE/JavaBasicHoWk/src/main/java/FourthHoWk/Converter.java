package FourthHoWk;

public class Converter {
   // K° = C° + 273,15
   // F° = C° x 1,8 + 32

   private double kelvin, fahrenheit;
   private final double CELSIUS;

   public Converter(double celsius) { // конструктор
      this.CELSIUS = celsius;
   }

   public void toKelvinVoid() { // to Kelvin метод void
      kelvin = CELSIUS + 273.15;
      System.out.println("Kelvin: " + kelvin + "°");
   }

   public void toFahrenheitVoid() { // to Fahrenheit метод void
      fahrenheit = CELSIUS * 1.8 + 32;
      System.out.println("Fahrenheit: " + fahrenheit + "°");
   }

   private double toKelvin(double celsius) { // to Kelvin метод return
      return celsius + 273.15;
   }

   private double toFahrenheit(double celsius) { // to Fahrenheit метод return
      return celsius * 1.8 + 32;
   }

   public void getPrintKelvin() { // вывод в консоль метода toKelvin
      System.out.println("Kelvin: " + toKelvin(CELSIUS) + "°");
   }

   public void getPrintFahrenheit() { // вывод в консоль метода toFahrenheit
      System.out.println("Fahrenheit: " + toFahrenheit(CELSIUS) + "°");
   }
}