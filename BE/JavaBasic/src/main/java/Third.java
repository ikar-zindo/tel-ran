import com.auto.germany.Car;

public class Third {
   public static void main(String[] args) {
      // экземпляр 1
      Car car1 = new Car(
              130,
              2021,
              "bmw");
      System.out.println(car1.power);
      System.out.println(car1.year);
      System.out.println(car1.fabric.toUpperCase());

      System.out.println();

      // экземпляр 2
      Car car2 = new Car(
              150,
              2023);
      System.out.println(car2.power);
      System.out.println(car2.year);
      System.out.println(car2.fabric);

      System.out.println();

      // экземпляр 3
      Car car3 = new Car(100);
      System.out.println(car3.power);
      System.out.println(car3.year);
      System.out.println(car3.fabric);

      System.out.println();

      // экземпляр 4
      Car car4 = new Car();
      System.out.println(car4.power);
      System.out.println(car4.year);
      System.out.println(car4.fabric);
   }
}