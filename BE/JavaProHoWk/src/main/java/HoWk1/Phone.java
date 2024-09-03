package HoWk1;

public class Phone {
   int number, weight;
   String model;

   public int getNumber() {
      return number;
   }

   protected void receiveCall(String callerName) {
      System.out.printf("Звонит %s\n", callerName);
   }
}
