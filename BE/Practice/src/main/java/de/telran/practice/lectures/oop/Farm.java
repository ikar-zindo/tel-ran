package de.telran.practice.lectures.oop;

public class Farm {
   public static void main(String[] args) {

      Cat cat = new Cat("Barsik", "BLACK");
      cat.voice();

      Cat someCat = new Cat("Some", "Some");
//      Animal someanimal = new Animal("Some", "Some");
//      Object someObject = new Object("Some", "Some");

      Animal[] animals = {
              new Cat("Barsik", "BLACK"),
              new Dog("Bobik", "RED"),
              new Bird("Chizhik", "GREY"),
              new Cat("Murzik", "WHITE"),
              new Snake("Kaa", "GREEN"),
              new Bird("Tuco", "YELLOW"),
              new Parrot("Kesha", "BLUE"),
              new Animal("Anon", "BLACK", "Unknown") {
                 @Override
                 public void voice() {
                    System.out.println("Unknown");
                 }
              },
              new Animal("Anon", "BLACK", "Unknown") {
                 @Override
                 public void voice() {
                    System.out.println("Unknown 2");
                 }
              }
      };

      for (int i = 0; i < animals.length; i++) {
         animals[i].move();
         animals[i].voice();
//         if (animals[i] instanceof Bird) {
//            ((Bird) animals[i]).fly();
//         }
         if (animals[i] instanceof Bird bird) {
            bird.fly();
         }
         if (animals[i] instanceof Parrot parrot) {
            parrot.speak();
         }
      }
   }
}
