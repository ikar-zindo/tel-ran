package lesson17_lambdas_practice.task2;

import java.util.function.Function;

public class ConvertTypes {
   public static void main(String[] args) {

      Dog dog = new Dog(3, "BLACK", 7.39);

      System.out.println(dog);

      Function<Dog, Cat> convert = x -> new Cat(x.getAge(), x.getColor(), x.getWeight() / 2);

      Cat cat = convert.apply(dog);

      System.out.println(cat);
   }
}
