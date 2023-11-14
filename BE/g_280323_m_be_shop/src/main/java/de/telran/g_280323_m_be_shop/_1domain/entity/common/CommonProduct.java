package de.telran.g_280323_m_be_shop._1domain.entity.common;

import de.telran.g_280323_m_be_shop._1domain.entity.interfaces.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class CommonProduct implements Product {

   private int id;
   private String name;
   private double price;

   // LOGGER
   public static Logger LOGGER = LogManager.getLogger(CommonProduct.class);

   public CommonProduct() {
      // LOGGER
      LOGGER.info("Вызван конструктор для класса " + getClass().getSimpleName());
   }

   public CommonProduct(int id, String name, double price) {
      this.id = id;
      this.name = name;
      this.price = price;
   }

   @Override
   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   @Override
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }


   @Override
   public String toString() {
      return "CommonProduct{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", price=" + price +
              '}';
   }
}
