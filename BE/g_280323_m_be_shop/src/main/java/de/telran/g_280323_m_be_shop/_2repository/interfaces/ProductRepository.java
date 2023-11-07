package de.telran.g_280323_m_be_shop._2repository.interfaces;

import de.telran.g_280323_m_be_shop._1domain.entity.interfaces.Product;

import java.util.List;

public interface ProductRepository {

   List<Product> getAll();

   Product getById(int id);

   void add(String name, double price);

   void delete(int id);
}