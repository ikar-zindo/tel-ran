package lesson31_concurrent_description.task4_exchanger;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Exchanger;

public class Courier extends Thread {

   private String start;
   private String destination;
   private List<Package> packages;
   private Courier anotherCourier;
   private boolean inExchangePoint;
   private Exchanger<Package> exchanger;

   public Courier(String start, String destination, List<Package> packages, Exchanger<Package> exchanger) {
      this.start = start;
      this.destination = destination;
      this.packages = packages;
      this.exchanger = exchanger;
      start();
   }

   public void setAnotherCourier(Courier anotherCourier) {
      this.anotherCourier = anotherCourier;
   }

   @Override
   public void run() {
      try {
         Random random = new Random();
         int millis = random.nextInt(6_000) + 2_000;

         Thread.sleep(millis);
         System.out.printf("%s выехал из точки %s.%n", this, start);

         Thread.sleep(millis);
         System.out.printf("%s доехал до пункта обмена.%n", this);

//         inExchangePoint = true;
//
//         if (anotherCourier.inExchangePoint) {
//            packages.add(anotherCourier.getIrrelevantPackage());
//         }

         packages.add(exchanger.exchange(getIrrelevantPackage()));

         Thread.sleep(millis);

//         if (anotherCourier.inExchangePoint) {
//            packages.add(anotherCourier.getIrrelevantPackage());
//         }
//
//         inExchangePoint = false;

         System.out.printf("%s уехал из пункта обмена.%n", this);

         Thread.sleep(millis);
         System.out.printf("%s доехал до точки выгрузки %s.%n", this, destination);

         Thread.sleep(millis);
         unload();
      } catch (Exception e) {
         System.err.println("Ошибка!");
      }
   }

   private Package getIrrelevantPackage() {
      Iterator<Package> iterator = packages.iterator();
      while (iterator.hasNext()) {
         Package pack = iterator.next();
         if (!destination.equals(pack.getTo())) {
            System.out.printf("%s отдал %s другому курьеру.%n", this, pack);
            iterator.remove();
            return pack;
         }
      }
      return null;
   }

   private void unload() {
      Iterator<Package> iterator = packages.iterator();
      while (iterator.hasNext()) {
         Package pack = iterator.next();
         if (destination.equals(pack.getTo())) {
            System.out.printf("%s успешно доставил посылку %s.%n", this, pack);
            iterator.remove();
         }
      }
      if (packages.isEmpty()) {
         System.out.printf("%s успешно доставил все посылки.%n", this);
      } else {
         System.out.printf("%s не смог доставить все посылки.%n", this);
      }
   }

   @Override
   public String toString() {
      return String.format("Курьер {%s -> %s}", start, destination);
   }
}
