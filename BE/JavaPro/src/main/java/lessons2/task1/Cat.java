package lessons2.task1;

public class Cat extends LandAnimal{

   public Cat(double weight) {
      super(weight);
      System.out.println("Вызван конструктор Cat");
   }

   // Перегруженый метод
   @Override
   public void voice() {
      System.out.println("Мяу!");
   }

   // Перегруженый метод
   public void voice(int count) {
      for (int i = 0; i < count; i++) {
         System.out.print("Мяу! ");
      }
      System.out.println();
   }
}
