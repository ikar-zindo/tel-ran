package de.telran.g_280323_m_be_shop._3service.jpa;

import de.telran.g_280323_m_be_shop._1domain.entity.interfaces.Cart;
import de.telran.g_280323_m_be_shop._1domain.entity.interfaces.Customer;
import de.telran.g_280323_m_be_shop._1domain.entity.interfaces.Product;
import de.telran.g_280323_m_be_shop._1domain.entity.jpa.JpaCart;
import de.telran.g_280323_m_be_shop._1domain.entity.jpa.JpaCustomer;
import de.telran.g_280323_m_be_shop._2repository.jpa.JpaCartRepository;
import de.telran.g_280323_m_be_shop._2repository.jpa.JpaCustomerRepository;
import de.telran.g_280323_m_be_shop._2repository.jpa.JpaProductRepository;
import de.telran.g_280323_m_be_shop._3service.interfaces.CustomerService;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Андрей, пробую запускать код, но таблицу `customer` не видит, хотя для `product` всё отрабатывает.
 * Не могу найти ошибку, возможно я забыл что-то указать...
 * Из-за этого не могу проверить работоспособность кода
 */
@Service
public class JpaCustomerService implements CustomerService {

   private final Logger LOGGER = LoggerFactory.getLogger(JpaCustomerService.class);

   private JpaCustomerRepository repository;
   private JpaCartRepository cartRepository;
   private JpaProductRepository productRepository;

   public JpaCustomerService(JpaCustomerRepository repository, JpaCartRepository cartRepository, JpaProductRepository productRepository) {
      this.repository = repository;
      this.cartRepository = cartRepository;
      this.productRepository = productRepository;
   }

   @Override
   public List<Customer> getAll() {
      return new ArrayList<>(repository.findAll());
   }

   @Override
   public Customer getById(int id) {
      LOGGER.info("Запрошен покупатель с id={}.", id);
      LOGGER.warn("Запрошен покупатель с id={}.", id);
      LOGGER.error("Запрошен покупатель с id={}.", id);

      return repository.findById(id).orElse(null);
   }

   @Override
   public void add(Customer customer) {
      JpaCustomer savedCustomer = repository.save(new JpaCustomer(0, customer.getName(), customer.getEmail(), customer.getAge()));
      cartRepository.save(new JpaCart(savedCustomer));
   }

   @Override
   public void deleteById(int id) {
      repository.deleteById(id);
   }

   @Override
   public void deleteByName(String name) {
      repository.deleteByName(name);
   }

   @Override
   public int getCount() {
      return (int) repository.count();
   }

   @Override
   public double getTotalPriceById(int id) {
      return getById(id).getCart().getTotalPrice();
   }

   @Override
   public double getAveragePriceById(int id) {
      return getById(id).getCart().getAveragePrice();
   }

   @Transactional
   @Override
   public void addToCartById(int customerId, int productId) {
      Customer customer = repository.findById(customerId).orElse(null);
      Product product = productRepository.findById(productId).orElse(null);
      Cart cart = customer.getCart();
      cart.addProduct(product);
   }

   @Transactional
   @Override
   public void deleteFromCartById(int customerId, int productId) {
      getById(customerId).getCart().deleteProduct(productId);
   }

   @Transactional
   @Override
   public void clearCartById(int customerId) {
      getById(customerId).getCart().clear();
   }
}
