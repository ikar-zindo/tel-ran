package de.telran.g_280323_m_be_shop._1domain.entity.common;

import de.telran.g_280323_m_be_shop._1domain.entity.interfaces.Cart;
import de.telran.g_280323_m_be_shop._1domain.entity.interfaces.Customer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CommonCustomer implements Customer {

   private int id;
   private String name;
   private Cart cart;
   private String email;
   private int age;

   // LOGGER
   public final Logger LOGGER = LogManager.getLogger(CommonCustomer.class);


   public CommonCustomer() {
      // LOGGER
      LOGGER.info("Вызван конструктор для класса " + getClass().getSimpleName());
   }

   public CommonCustomer(int id, String name, Cart cart) {
      this.id = id;
      this.name = name;
      this.cart = cart;
   }

   public CommonCustomer(int id, String name, Cart cart, String email, int age) {
      this.id = id;
      this.name = name;
      this.cart = cart;
      this.email = email;
      this.age = age;
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

   public Cart getCart() {
      return cart;
   }

   @Override
   public String getEmail() {
      return email;
   }

   @Override
   public int getAge() {
      return age;
   }

   public void setCart(Cart cart) {
      this.cart = cart;
   }
}
