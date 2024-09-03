package SS_16_06_23;

public class Main4 {
   public static void main(String[] args) {
      Person person = new Person("Ivan", "Bukrieiev");

      Doctor doctor = new Doctor("Dr.", "Strange");

      Footballer footballer = new Footballer("Diego", "Maradona");

      System.out.println(doctor.hashCode());

      String message = "Hello, World!";
      System.out.println(message.lastIndexOf("o"));
      System.out.println(message.indexOf("o"));

      System.out.println(person.toString(10));
      System.out.println(footballer.toString(1));
      System.out.println(footballer.toString());
      System.out.println(doctor.toString(2));
   }
}
