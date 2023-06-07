package Relationships;

public class Example {
   public static void main(String[] args) {

   }
}

class Animal {
   int legs = 4;
   int tail = 1;
}

class Dog extends Animal {
   public void bark() {
      System.out.println("Bark, bark!!!");
   }
}

class FrBuldog extends Dog {
   int avgLengthPaws = 15;
   int avgLengthTail = 4;
   int avgLengthFur = 1;
}

class GerSheppard extends Dog {
   int avgLengthPaws = 40;
   int avgLengthTail = 25;
   int avgLengthFur = 4;
}




