package SS_16_06_23;

public class Main3 {
   public static void main(String[] args) {

      Person person = new Person("Ivan", "Bukrieiev");

      Doctor doctor = new Doctor("Dr.", "Strange");

      System.out.println(doctor.surgery(7));

      Footballer footballer = new Footballer("Diego", "Maradona");

      System.out.println(footballer.teamInfo("Barcelona"));

   }
}
