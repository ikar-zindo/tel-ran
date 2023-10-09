package org.example._2023_10_06;

public class MtEx4 {

   public static final Object LOCK = new Object();

   synchronized void mobileCall() {
      synchronized (LOCK) {
         System.out.println("Mobile call start " + this);

         try {
            Thread.sleep(1_500);
         } catch (InterruptedException e) {
            throw new RuntimeException(e);
         }

         System.out.println("Mobile call end");
      }
   }

   synchronized void whatsAppCall() {
      synchronized (LOCK) {
         System.out.println("WhatsApp call start " + this);

         try {
            Thread.sleep(2_500);
         } catch (InterruptedException e) {
            throw new RuntimeException(e);
         }

         System.out.println("WhatsApp call end");
      }
   }

   synchronized void TelegramCall() {
      synchronized (LOCK) {
         System.out.println("Telegram call start " + this);

         try {
            Thread.sleep(900);
         } catch (InterruptedException e) {
            throw new RuntimeException(e);
         }

         System.out.println("Telegram call end");
      }
   }

   public static void main(String[] args) {
      Thread threadMobile = new Thread(new MobileImpl());
      Thread threadWhatsApp = new Thread(new MobileWhatsApp());
      Thread threadTelegram = new Thread(new MobileTelegram());

      threadMobile.start();
      threadWhatsApp.start();
      threadTelegram.start();
   }
}


class MobileImpl implements Runnable {

   @Override
   public void run() {
      try {
         new MtEx4().mobileCall();
      } catch (Exception e) {
      throw new RuntimeException(e);
   }
   }
}

class MobileWhatsApp implements Runnable {

   @Override
   public void run() {
      try {
         new MtEx4().whatsAppCall();
      } catch (Exception e) {
         throw new RuntimeException(e);
      }
   }
}

class MobileTelegram implements Runnable {

   @Override
   public void run() {
      try {
         new MtEx4().TelegramCall();
      } catch (Exception e) {
         throw new RuntimeException(e);
      }
   }
}