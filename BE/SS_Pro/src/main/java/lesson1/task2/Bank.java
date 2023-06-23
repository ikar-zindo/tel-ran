package lesson1.task2;

public class Bank {
   private String name;
   private Customer[] customers;
   private Product[] products;

   public Bank(String name, Customer[] customers, Product[] products) {
      this.name = name;
      this.customers = customers;
      this.products = products;
   }
}
