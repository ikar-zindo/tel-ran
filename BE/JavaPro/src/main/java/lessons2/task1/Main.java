package lessons2.task1;

public class Main {
   public static void main(String[] args) {

      System.out.println("Создаём кошку");
      Cat cat = new Cat(3);
//      cat.weigh = 3;

      System.out.println("Создаём вторую кошку");
      Cat cat1 = new Cat(4);
//      cat1.weigh = 4;

      System.out.println("Создаём собаку");
      Dog dog = new Dog(7);
//      dog.weigh = 7;

      System.out.println("Вес кошки - " + cat.weigh +
              ", а вес собаки - " + dog.weigh +
              ", а вес второй кошки - " + cat1.weigh);

      System.out.println("Создаём корову");
      test();

      cat.printInfo();

      cat.voice();
      dog.voice();

      Bird bird = new Bird(1);
      Airplane airplane = new Airplane();

      bird.fly();
      airplane.fly();

      bird.landing();
      airplane.landing();

      System.out.println(Flyable.INFO);
   }

   public static void test() {
      Cow cow = new Cow(150);
//      cow.weigh = 150;
      System.out.println("Вес коровы (в методе test) - " + cow.weigh);
   }
}
