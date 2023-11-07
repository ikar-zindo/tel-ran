package de.telran.g_280323_m_be_shop._3service.jpa;

import de.telran.g_280323_m_be_shop._1domain.entity.interfaces.Customer;
import de.telran.g_280323_m_be_shop._1domain.entity.jpa.JpaCustomer;
import de.telran.g_280323_m_be_shop._2repository.jpa.JpaCustomerRepository;
import de.telran.g_280323_m_be_shop._3service.interfaces.CustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JpaCustomerService implements CustomerService {

   private JpaCustomerRepository repository;

   public JpaCustomerService(JpaCustomerRepository repository) {
      this.repository = repository;
   }


   @Override
   public List<Customer> getAll() {
      return new ArrayList<>(repository.findAll());
   }

   @Override
   public Customer getById(int id) {
      return repository.findById(id).orElse(null);
   }

   @Override
   public void add(Customer customer) {
      repository.save(new JpaCustomer(customer.getId(), customer.getName()));
   }

   @Override
   public void deleteById(int id) {
      repository.deleteById(id);
   }

   @Override
   public int getCount() {
      return (int) repository.count();
   }

   @Override
   public double getTotalPriceById(int customerId) {
      return repository.getTotalPriceById(customerId);
   }

   @Override
   public double getAveragePriceById(int customerId) {
      return repository.getAveragePriceById(customerId);
   }

   @Override
   public void deleteByName(String name) {
      repository.deleteByName(name);
   }

   @Override
   public void addToCartById(int customerId, int productId) {
      repository.addToCartById(customerId, productId);
   }

   @Override
   public void deleteFromCartById(int customerId, int productId) {
      repository.deleteFromCartById(customerId, productId);
   }

   @Override
   public void clearCartById(int customerId) {
      repository.clearCartById(customerId);
   }
}
