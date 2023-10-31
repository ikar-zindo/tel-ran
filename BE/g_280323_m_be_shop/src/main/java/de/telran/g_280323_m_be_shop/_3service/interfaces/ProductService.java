package de.telran.g_280323_m_be_shop._3service.interfaces;

import de.telran.g_280323_m_be_shop._1domain.entity.interfaces.Product;

import java.util.List;

public interface ProductService {

   List<Product> getAll();

   Product getById(int id);

   void add(Product product);

   void deleteById(int id);

   int getCount();

   double getTotalPrice();

   double getAveragePrice();

   void deleteByName(String name);
}
