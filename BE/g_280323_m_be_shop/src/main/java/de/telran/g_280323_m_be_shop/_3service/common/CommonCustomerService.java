package de.telran.g_280323_m_be_shop._3service.common;

import de.telran.g_280323_m_be_shop._1domain.entity.interfaces.Customer;
import de.telran.g_280323_m_be_shop._2repository.common.CommonCustomerRepository;
import de.telran.g_280323_m_be_shop._2repository.interfaces.CustomerRepository;
import de.telran.g_280323_m_be_shop._3service.interfaces.CustomerService;
import de.telran.g_280323_m_be_shop._3service.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CommonCustomerService implements CustomerService {

//   @Autowired
   private CustomerRepository repository = new CommonCustomerRepository();

//   @Autowired
   private ProductService product = new CommonProductService();

   @Override
   public List<Customer> getAll() {
      return repository.getAll();
   }

   @Override
   public Customer getById(int id) {
      return repository.getById(id);
   }

   @Override
   public void add(Customer customer) {
      repository.add(customer.getName());
   }

   @Override
   public void deleteById(int id) {
      repository.delete(id);
   }

   @Override
   public int getCount() {
      return getAll().size();
   }

   @Override
   public double getTotalPriceById(int id) {
      return getById(id).getCart().getTotalPrice();
   }

   @Override
   public double getAveragePriceId(int id) {
      return getById(id).getCart().getAveragePrice();
   }

   @Override
   public void deleteByName(String name) {
      Customer customer = getAll().stream()
              .filter(x -> x.getName().equals(name))
              .findFirst()
              .orElse(null);

      repository.delete(customer.getId());
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
   public void clearCartDyId(int id) {
      repository.clearCart(id);
   }
}
