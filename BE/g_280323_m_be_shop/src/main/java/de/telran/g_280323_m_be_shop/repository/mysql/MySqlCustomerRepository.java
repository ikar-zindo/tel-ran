package de.telran.g_280323_m_be_shop.repository.mysql;

import de.telran.g_280323_m_be_shop.domain.entity.common.CommonCart;
import de.telran.g_280323_m_be_shop.domain.entity.common.CommonCustomer;
import de.telran.g_280323_m_be_shop.domain.entity.common.CommonProduct;
import de.telran.g_280323_m_be_shop.domain.entity.interfaces.Customer;
import de.telran.g_280323_m_be_shop.domain.entity.interfaces.Product;
import de.telran.g_280323_m_be_shop.repository.interfaces.CustomerRepository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static de.telran.g_280323_m_be_shop.domain.database.MySqlConnector.getConnection;

   /**
    * Репозиторий клиентов.
    * Содержит сформированные SQL запросы в методах для поиска клиента,
    * добавления, удаления клиентов, а так же управление корзиной клиентов
    */
public class MySqlCustomerRepository implements CustomerRepository {

   private final String ID = "customer_id";
   private final String NAME = "name";
   private final String PRODUCT_ID = "product_id";
   private final String PRODUCT_NAME = "product.name";
   private final String PRODUCT_PRICE = "product.price";


   /**
    * Получение всех покупателей.
    * @return список всех покупателей, хранящихся в БД.
    */
   @Override
   public List<Customer> getAll() {
      try (Connection connection = getConnection()) {
         String query = "SELECT * FROM `customer` " +
                 "LEFT JOIN `customer_product` USING(`customer_id`) " +
                 "LEFT JOIN `product` USING(`product_id`)";

         ResultSet resultSet = connection.createStatement().executeQuery(query);

         Map<Integer, Customer> customerMap = new HashMap<>();

         while (resultSet.next()) {
            int id = resultSet.getInt(ID);
            String name = resultSet.getString(NAME);
            int productId = resultSet.getInt(PRODUCT_ID);
            String productName = resultSet.getString(PRODUCT_NAME);
            double productPrice = resultSet.getDouble(PRODUCT_PRICE);

            Customer customer = customerMap.get(id);
            if (customer == null) {
               customer = new CommonCustomer(id, name, new CommonCart());
               customerMap.put(id, customer);
            }

            Product product = new CommonProduct(productId, productName, productPrice);
            customer.getCart().addProduct(product);
         }

         return new ArrayList<>(customerMap.values());
      } catch (Exception e) {
         throw new RuntimeException(e);
      }
   }

   /**
    * Получение покупателя по идентификатору.
    * @param customerId    идентификатор покупателя.
    * @return              покупатель, имеющий переданный идентификатор.
    */

   @Override
   public Customer getById(int customerId) {
      try (Connection connection = getConnection()) {
         String query = String.format("SELECT * FROM `customer` " +
                 "LEFT JOIN `customer_product` USING(`customer_id`) " +
                 "LEFT JOIN product USING(`product_id`) " +
                 "WHERE `customer`.`customer_id` = %d;", customerId);

         ResultSet resultSet = connection.createStatement().executeQuery(query);

         Customer customer = null;
         while (resultSet.next()) {
            String name = resultSet.getString(NAME);
            int productId = resultSet.getInt(PRODUCT_ID);
            String productName = resultSet.getString(PRODUCT_NAME);
            double productPrice = resultSet.getDouble(PRODUCT_PRICE);

            if (customer == null) {
               customer = new CommonCustomer(customerId, name, new CommonCart());
            }

            Product product = new CommonProduct(productId, productName, productPrice);
            customer.getCart().addProduct(product);
         }

         return customer;
      } catch (Exception e) {
         throw new RuntimeException(e);
      }
   }

   /**
    * Добавление покупателя.
    * @param name имя добавляемого покупателя в БД.
    */
   @Override
   public void add(String name) {
      try (Connection connection = getConnection()) {
         String query = String.format("INSERT INTO `customer` (`name`) VALUES ('%s');", name);
         connection.createStatement().execute(query);

      } catch (Exception e) {
         throw new RuntimeException(e);
      }
   }

   /**
    * Удаление покупателя.
    * @param id идентификатор удаляемого из БД покупателя.
    */
   @Override
   public void delete(int id) {
      try (Connection connection = getConnection()) {
         String query = String.format("DELETE FROM `customer` WHERE (`customer_id` = '%d');", id);
         connection.createStatement().execute(query);

      } catch (Exception e) {
         throw new RuntimeException(e);
      }
   }

   /**
    * Добавление продукта в корзину.
    * @param customerId    покупателя, которому добавляется продукт.
    * @param productId     идентификатор добавляемого продукта.
    */
    @Override
   public void addToCartById(int customerId, int productId) {
      try (Connection connection = getConnection()) {
         String query = String.format("INSERT INTO `customer_product` (`customer_id`, `product_id`) " +
                 "VALUES ('%d', '%d');", customerId, productId);
         connection.createStatement().execute(query);

      } catch (Exception e) {
         throw new RuntimeException(e);
      }
   }

   /**
    * Удаление продукта из корзины.
    * @param customerId    идентификатор покупателя, из корзины которого удаляется продукт.
    * @param productId     идентификатор удаляемого продукта.
    */
   @Override
   public void deleteFromCartById(int customerId, int productId) {
      try (Connection connection = getConnection()) {
         String query = String.format("DELETE FROM `customer_product` " +
                 "WHERE customer_id = %d AND product_id = %d LIMIT 1;", customerId, productId);
         connection.createStatement().execute(query);

      } catch (Exception e) {
         throw new RuntimeException(e);
      }
   }

   /**
    * Очистка корзины.
    * @param customerId идентификатор покупателя, у которого очищается корзина.
    */
   @Override
   public void clearCart(int customerId) {
      try (Connection connection = getConnection()) {
         String query = String.format("DELETE FROM `customer_product` " +
                 "WHERE customer_id = %d", customerId);
         connection.createStatement().execute(query);

      } catch (Exception e) {
         throw new RuntimeException(e);
      }
   }
}
