package de.telran.g_280323_m_be_shop;

import de.telran.g_280323_m_be_shop.domain.database.common.CommonDatabase;
import de.telran.g_280323_m_be_shop.domain.database.interfaces.Database;
import de.telran.g_280323_m_be_shop.repository.common.CommonCustomerRepository;
import de.telran.g_280323_m_be_shop.repository.common.CommonProductRepository;
import de.telran.g_280323_m_be_shop.repository.interfaces.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

   @Bean
   public Database database() {
      return new CommonDatabase();
   }

   @Bean
   public ProductRepository productRepository() {
      return new CommonProductRepository();
   }

   @Bean

}
