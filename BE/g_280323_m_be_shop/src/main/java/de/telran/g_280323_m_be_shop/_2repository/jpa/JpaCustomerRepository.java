package de.telran.g_280323_m_be_shop._2repository.jpa;

import de.telran.g_280323_m_be_shop._1domain.entity.jpa.JpaCustomer;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface JpaCustomerRepository extends JpaRepository<JpaCustomer, Integer> {

   @Query(value = "SELECT sum(`price`) FROM `cart_product` " +
           "LEFT JOIN `cart` USING(`cart_id`) " +
           "LEFT JOIN `product` USING(`product_id`) " +
           "WHERE `customer_id`=:customerId;", nativeQuery = true)
   double getTotalPriceById(@Param("customerId") int customerId);

   @Query(value = "SELECT avg(`price`) FROM `cart_product` " +
           "LEFT JOIN `cart` USING(`cart_id`) " +
           "LEFT JOIN `product` USING(`product_id`) " +
           "WHERE `customer_id`=:customerId;", nativeQuery = true)
   double getAveragePriceById(@Param("customerId") int customerId);

   @Transactional
   void deleteByName(String name);

   @Query(value = "INSERT INTO `cart_product` (`cart_id`, `product_id`) VALUES ('1', '2');", nativeQuery = true)
   void addToCartById(int customerId, int productId);

   @Query(value = "DELETE `cart_product` FROM `cart_product` " +
           "LEFT JOIN `cart` USING(`cart_id`) " +
           "LEFT JOIN `product` USING(`product_id`) " +
           "WHERE `customer_id`=:customerId AND `product_id`=:productId " +
           "LIMIT 1;", nativeQuery = true)
   void deleteFromCartById(@Param("customerId") int customerId,@Param("productId") int productId);

   @Query(value = "delete `cart_product` FROM `cart_product` " +
           "LEFT JOIN `cart` USING(`cart_id`) " +
           "LEFT JOIN `product` USING(`product_id`) " +
           "WHERE `customer_id`=:customerId;", nativeQuery = true)
   void clearCartById(@Param("customerId") int customerId);
}
