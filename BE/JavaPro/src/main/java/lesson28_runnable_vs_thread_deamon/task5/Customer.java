package lesson28_runnable_vs_thread_deamon.task5;

public class Customer extends Thread {

   private String name;
   private BankAccount account;

   public Customer(String name, BankAccount bankAccount) {
      this.name = name;
      this.account = bankAccount;
   }

   @Override
   public void run() {
      int wantedMoney = 1000;
      System.out.printf("Client %s comes to the ATM%n", name);
      int restMoney = account.getRestMoney();
      try {
         Thread.sleep(3000);
      } catch (InterruptedException ignored) {
      }
      if(restMoney>=wantedMoney){
         System.out.printf("Client %s can withdraw the wanted money%n", name);
         account.withdrawMoney(wantedMoney);
      }else{
         System.out.printf("There is not enough money for the Client %s%n", name);
      }
   }
}