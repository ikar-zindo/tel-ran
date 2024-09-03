package SS_16_06_23;

public class Person {
   private String firstName;
   private String lastName;

   public Person(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
   }

   public String toString(int num) {
      return "You are doing great for " + num+ " years";
   }
}

class Doctor extends Person {


   public Doctor(String firstName, String lastName) {
      super(firstName, lastName);
   }

   public String surgery(int days) {
      return "You have a surgery in " + days + " days";
   }

   @Override
   public String toString() {
      return "You are great doctor";
   }
}

class Footballer extends Doctor {

   public Footballer(String firstName, String lastName) {
      super(firstName, lastName);
   }

   public String teamInfo(String team) {
      return "You play for " + team;
   }

   @Override
   public String toString() {
      return "You are playing great";
   }
}
