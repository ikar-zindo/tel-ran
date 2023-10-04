package lesson28_runnable_vs_thread_deamon.task5;

public class BankAccount {

   private int restMoney;

   public int getRestMoney() {
      return restMoney;
   }

   public void setRestMoney(int restMoney) {
      this.restMoney = restMoney;
   }

   public void withdrawMoney(int money) {
      restMoney = getRestMoney() - money;
   }
}
