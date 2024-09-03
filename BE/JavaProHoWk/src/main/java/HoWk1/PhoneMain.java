package HoWk1;

public class PhoneMain {
   public static void main(String[] args) {

      // Phone 1
      Phone phone1 = new Phone();
      phone1.model = "Nokia 1100";
      phone1.number = 123_456_789;
      phone1.weight = 158;

      // Phone 2
      Phone phone2 = new Phone();
      phone2.model = "BlackBerry Storm";
      phone2.number = 987_654_321;
      phone2.weight = 195;

      // Phone 3
      Phone phone3 = new Phone();
      phone3.model = "SonyEricsson K790i";
      phone3.number = 465_789_321;
      phone3.weight = 175;

      System.out.printf("Model = %s, number = %s, weight = %sg.\n", phone1.model, phone1.number, phone1.weight);
      System.out.printf("Model = %s, number = %s, weight = %sg.\n", phone2.model, phone2.number, phone2.weight);
      System.out.printf("Model = %s, number = %s, weight = %sg.\n", phone3.model, phone3.number, phone3.weight);

      phone1.receiveCall("Ivan");
      System.out.printf("Phone1 number = %s\n", phone1.getNumber());

      phone2.receiveCall("Mark");
      System.out.printf("Phone2 number = %s\n", phone2.getNumber());

      phone3.receiveCall("Steve");
      System.out.printf("Phone3 number = %s\n", phone3.getNumber());
   }
}
