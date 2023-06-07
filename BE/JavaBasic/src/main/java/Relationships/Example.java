package Relationships;

public class Example {
   public static void main(String[] args) {

//      Animal a = new Animal();
////      System.out.println(a.paws);
//
//      Dog d = new Dog();
////      System.out.println(d.paws);
//      d.bark();

      Barkable fb = new FrBulldog();
      fb.bark();

//      GerShepherd gs = new GerShepherd();
//      gs.bark();
//
//      Bird b = new Bird();
//
//      Eagle e = new Eagle();
//      e.fly();
//
//      Parrot p = new Parrot();
//      p.fly();

   }
}

class Animal {
   public int paws = 4;
   public int tail = 1;
}

class Dog extends Animal implements Barkable {

   @Override
   public void bark() {
      System.out.println("Bark, bark!!!");
   }
}

class FrBulldog extends Dog {
   public int avgLengthPaws = 15;
   public int avgLengthTail = 4;
   public int avgLengthFur = 1;

   @Override
   public void bark() {
      System.out.println("Bark, french bulldog, bark!!!");
   }
}

class GerShepherd extends Dog {
   public int avgLengthPaws = 40;
   public int avgLengthTail = 25;
   public int avgLengthFur = 4;

   @Override
   public void bark() {
      System.out.println("Bark, german shepherd, bark!!!");
   }
}

// итерфейс для примера
interface A {
   void preparing();
   void cocking();
   void serving();
   void eating();
}

interface Barkable {
   void bark();
}

class Bird extends Animal {
   public int paws = 2;
   public int winds = 2;
   public int beak = 1;
}

class Eagle extends Bird implements Flying{

   @Override
   public void fly() {
      System.out.println("Eagle is flying");
   }
}

class Parrot extends Bird implements Flying {

   @Override
   public void fly() {
      System.out.println("Parrot is flying");
   }
}

interface Flying {
   void fly();
}
