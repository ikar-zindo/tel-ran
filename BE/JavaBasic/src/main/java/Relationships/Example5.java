package Relationships;

// примеры анонимных вложенных классов
public class Example5 {

   public static void main(String[] args) {

      TVable tv = new TVable() {
         @Override
         public void show() {
            System.out.println("Show must go on");
         }
      };

      tv.show();
   }
}

interface TVable {
   void show();
}