package lessons2.task2;

import lessons2.task1.*;

public class Main {
   public static void main(String[] args) {

      int[] numbers = new int[5];
      String[] words = new String[5];
      
      words[2] = "Hello";
      numbers[2] = 7;
      
      Cat[] cats = new Cat[5];
      Dog[] dogs = new Dog[5];
      
      cats[2] = new Cat(3);

      LandAnimal[] animals = new LandAnimal[5];
      animals[0] = new Cat(2);
      animals[1] = new Dog(7);
      animals[2] = new Cow(200);
      animals[3] = new Elephant(3_000);
      animals[4] = new Cat(5);

      for (LandAnimal currentAnimal : animals) {
         // Полиморфизм времени выполнения
         // Для кажлого объекта вызывается своя собственная
         // реализация метода voice()
         // В момент написания кода мы не знаем,
         // у какого именни объекта будет вызван метод
         currentAnimal.voice();
      }

      System.out.println("-----------------------");

      // Полиморфизм времени компиляции
      // В момент написания кода,
      // мы знаем какой метод будет вызван
      Cat cat = new Cat(5);
      cat.voice();
      cat.voice(3);
      cat.voice(5);
   }
}
