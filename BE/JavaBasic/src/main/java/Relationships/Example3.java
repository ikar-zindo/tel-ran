package Relationships;

// пример локального внутреннего класса метода
public class Example3 {



   // круиз с шоу раз в Х дней
   public void startCruise() {

      class Show {

         public Show() {
            System.out.println("Show was started");
         }

         private int peopleCounts = 50;
         private String nameOfShow = "Carnival";

         public int getPeopleCounts() {
            return peopleCounts;
         }

         public void setPeopleCounts(int peopleCounts) {
            this.peopleCounts = peopleCounts;
         }

         public String getNameOfShow() {
            return nameOfShow;
         }

         public void setNameOfShow(String nameOfShow) {
            this.nameOfShow = nameOfShow;
         }
      }

      Show s = new Show();

      System.out.println(s.getNameOfShow());
      System.out.println(s.getPeopleCounts());
   }


   public static void main(String[] args) {

      Example3 e3 = new Example3();
      e3.startCruise();
   }
}
