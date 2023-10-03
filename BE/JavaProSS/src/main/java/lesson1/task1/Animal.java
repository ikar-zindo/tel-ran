package lesson1.task1;

public class Animal implements CommandAnimal{
   String name;
   int age;
   String poroda;
   Animal animal;

   @Override
   public void doCommand() {

   }
}

interface CommandAnimal {
   void doCommand();
}
