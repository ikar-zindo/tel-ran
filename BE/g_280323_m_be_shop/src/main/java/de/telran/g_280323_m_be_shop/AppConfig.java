package de.telran.g_280323_m_be_shop;

import de.telran.g_280323_m_be_shop._1domain.database.common.CommonDatabase;
import de.telran.g_280323_m_be_shop._1domain.database.interfaces.Database;
import de.telran.g_280323_m_be_shop._2repository.common.CommonProductRepository;
import de.telran.g_280323_m_be_shop._2repository.interfaces.ProductRepository;
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
