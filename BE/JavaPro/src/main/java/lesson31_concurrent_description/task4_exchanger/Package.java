package lesson31_concurrent_description.task4_exchanger;

public class Package {

   private String from;
   private String to;

   public Package(String from, String to) {
      this.from = from;
      this.to = to;
   }

   public String getTo() {
      return to;
   }

   @Override
   public String toString() {
      return String.format("Посылка {%s -> %s}", from, to);
   }
}
