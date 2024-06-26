package de.telran.g_280323_m_be_shop._1domain.entity.common;

import de.telran.g_280323_m_be_shop._1domain.entity.interfaces.Cart;
import de.telran.g_280323_m_be_shop._1domain.entity.interfaces.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class CommonCart implements Cart {

   private List<Product> products = new ArrayList<>();

   // LOGGER
   public final Logger LOGGER = LogManager.getLogger(CommonCart.class);

   public CommonCart() {
      // LOGGER
      LOGGER.info("Вызван конструктор для класса " + getClass().getSimpleName());
   }

   @Override
   public List<Product> getProducts() {
      return products;
   }

   @Override
   public void addProduct(Product product) {
      products.add(product);
   }

   @Override
   public double getTotalPrice() {
      return products.stream().mapToDouble(x -> x.getPrice()).sum();
   }

   @Override
   public double getAveragePrice() {
      if (products.isEmpty()) return 0;

      return getTotalPrice() / products.size();
   }

   @Override
   public void deleteProduct(int id) {
      products.removeIf(x -> x.getId() == id);
   }

   @Override
   public void clear() {
      products.clear();
   }

   public void setProducts(List<Product> products) {
      this.products = products;
   }
}
