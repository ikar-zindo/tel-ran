import com.auto.finland.Car;

public class Second {
   public static void main(String[] args) {

      System.out.println(Car.histYear); // static
      System.out.println();

      // экземпляр №1
      Car finlandCar = new Car();
      System.out.println(finlandCar.year);
      System.out.println(finlandCar.power);
      System.out.println(finlandCar.fabric);
      System.out.println(Car.histYear); // static
      finlandCar.printParameters(); //

      Car.histYear = 2003;

      System.out.println();

      // экземпляр №2
      Car finlandCar2 = new Car();
      finlandCar2.printParameters();

      finlandCar2.year = 2022;
      finlandCar2.power = 156;
      finlandCar2.fabric = "BMW";

      System.out.println(finlandCar2.year);
      System.out.println(finlandCar2.power);
      System.out.println(finlandCar2.fabric);
      System.out.println(Car.histYear); // static
      finlandCar2.printParameters();

   }
}
