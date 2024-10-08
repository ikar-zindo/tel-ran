package de.telran.g_280323_m_be_shop._3service.interfaces;

import de.telran.g_280323_m_be_shop._1domain.entity.interfaces.Customer;
import de.telran.g_280323_m_be_shop.dto.CustomerDto;

import java.util.List;

public interface CustomerService {

   List<Customer> getAll();

   Customer getById(int id);

   void add(Customer customer);

   void deleteById(int id);

   int getCount();

   double getTotalPriceById(int id);

   double getAveragePriceById(int id);

   void deleteByName(String name);

   void addToCartById(int customerId, int productId);

   void deleteFromCartById(int customerId, int productId);

   void clearCartById(int id);

   //DTO
//   CustomerDto create(CustomerDto customerDto);
}