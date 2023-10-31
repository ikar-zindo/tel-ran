package de.telran.g_280323_m_be_shop._1domain.entity.common;

import de.telran.g_280323_m_be_shop._1domain.entity.interfaces.Cart;
import de.telran.g_280323_m_be_shop._1domain.entity.interfaces.Customer;

public class CommonCustomer implements Customer {

   private int id;
   private String name;
   private Cart cart;

   public CommonCustomer() {
   }

   public CommonCustomer(int id, String name, Cart cart) {
      this.id = id;
      this.name = name;
      this.cart = cart;
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

   @Override
   public Cart getCart() {
      return null;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Cart getCart() {
      return cart;
   }

   public void setCart(Cart cart) {
      this.cart = cart;
   }
}
