package lesson23_generics_PECS.task8_example;

public class Main {
   public static void main(String[] args) {

      Box<String> box = new Box<>("Hello");

      BoxUtils.print();
   }
}
