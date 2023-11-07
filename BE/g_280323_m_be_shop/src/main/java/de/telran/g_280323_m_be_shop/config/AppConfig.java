package de.telran.g_280323_m_be_shop.config;

import de.telran.g_280323_m_be_shop._1domain.database_imitation.common.CommonDatabase;
import de.telran.g_280323_m_be_shop._1domain.database_imitation.interfaces.Database;
import de.telran.g_280323_m_be_shop._2repository.interfaces.CustomerRepository;
import de.telran.g_280323_m_be_shop._2repository.interfaces.ProductRepository;
import de.telran.g_280323_m_be_shop._2repository.mysql.MySqlCustomerRepository;
import de.telran.g_280323_m_be_shop._2repository.mysql.MySqlProductRepository;
import de.telran.g_280323_m_be_shop._3service.common.CommonCustomerService;
import de.telran.g_280323_m_be_shop._3service.common.CommonProductService;
import de.telran.g_280323_m_be_shop._3service.interfaces.CustomerService;
import de.telran.g_280323_m_be_shop._3service.interfaces.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

//   @Bean
//   public Database database() {
//      return new CommonDatabase();
//   }

//   @Bean
//   public ProductRepository productRepository() {
//      return new MySqlProductRepository();
//   }

//   @Bean
//   public CustomerRepository customerRepository() {
//      return new MySqlCustomerRepository();
//   }

//   @Bean
//   public ProductService productService() {
//      return new CommonProductService();
//   }

//   @Bean
//   public CustomerService customerService() {
//      return new CommonCustomerService();
//   }
}