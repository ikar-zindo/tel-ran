package practice_10_07_23.phoneBook;

public class Main {
   public static void main(String[] args) {

      PhoneBook phoneBook = new PhoneBook();

      phoneBook.add("Peter", "123456789");
      phoneBook.add("Ivan", "74125899663");
      phoneBook.add("Wiktor", "987654321");
      phoneBook.add("Maria", "123456789");
      phoneBook.add("Bartek", "654987132");
      phoneBook.add("Ira", "75321459");
      phoneBook.add("Peter", "333111222");
      phoneBook.add("Peter", "44444444");

      System.out.println("Peter = " + phoneBook.get("Peter"));
      System.out.println("Ivan = " + phoneBook.get("Ivan"));
      System.out.println("Wiktor = " + phoneBook.get("Wiktor"));
      System.out.println("Ira = " + phoneBook.get("Ira"));
   }
}
