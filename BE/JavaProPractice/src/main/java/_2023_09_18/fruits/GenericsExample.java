package _2023_09_18.fruits;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericsExample {
   public static void main(String[] args) {

      List<Apple> apples = List.of(new Apple(1d), new Apple(1d), new Apple(3d));
      List<Orange> oranges = List.of(new Orange(1d), new Orange(1d), new Orange(3d));

      printFruit(apples);
      printFruit(oranges);

//      List<? extends Fruit> produceFruit = oranges;
//      produceFruit.forEach(Fruit::print);
//      produceFruit.add(new Orange(1.0));

//      List<? super Orange> consumerFruit = new ArrayList<>();
//      consumerFruit.add(new Orange(0.1));
//      consumerFruit.add(new Orange(0.5));
//
//      consumerFruit.forEach(fruit -> fruit.print());

      List<Fruit> fruits = new ArrayList<>(List.of(new Apple(1d), new Apple(1d), new Apple(3d), new Orange(0.2)));

      fruits.addAll(apples);
      Collections.copy(fruits, apples);
//      Collections.copy(apples, fruits);

      doSomething(apples);
      doSomething(fruits);
      List<Object> objects = List.of("Hello", 7, new Apple(5));
      doSomething(objects);

      List list = new ArrayList();
      list.add("Hello");
      list.add(7);
      list.add(new Apple(0.2));
      list.add(new Object());

      FruitBox box = new FruitBox();
      box.add(new Orange(1.0));
//      box.add("new Apple(3.2)");
   }

   static void printFruit(List<? extends Fruit> fruits) {
      fruits.forEach(Fruit::print);
   }

   static void doSomething(List<? super Apple> list) {
      list.forEach(System.out::println);
//      list.forEach(fruit -> fruit.print());
      //..................
   }
}
