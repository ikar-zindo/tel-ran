package de.telran.g_280323_m_be_shop.repository.mysql;

import de.telran.g_280323_m_be_shop.domain.entity.common.CommonCart;
import de.telran.g_280323_m_be_shop.domain.entity.common.CommonCustomer;
import de.telran.g_280323_m_be_shop.domain.entity.common.CommonProduct;
import de.telran.g_280323_m_be_shop.domain.entity.interfaces.Cart;
import de.telran.g_280323_m_be_shop.domain.entity.interfaces.Customer;
import de.telran.g_280323_m_be_shop.domain.entity.interfaces.Product;
import de.telran.g_280323_m_be_shop.repository.interfaces.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static de.telran.g_280323_m_be_shop.domain.database.MySqlConnector.getConnection;

public class MySqlCustomerRepository implements CustomerRepository {

   private final String ID = "customer_id";
   private final String NAME = "name";
   private final String CART = "cart";


   @Override
   public List<Customer> getAll() {
      try (Connection connection = getConnection()) {
         String query = "select * from customer as c " +
                 "left join customer_product as cp on c.customer_id=cp.customer_id " +
                 "left join product as p on cp.product_id=p.product_id";

         ResultSet resultSet = connection.createStatement().executeQuery(query);

         List<Customer> result = new ArrayList<>();

         while (resultSet.next()) {
            int id = resultSet.getInt(ID);
            String name = resultSet.getString(NAME);
            int productId = resultSet.getInt("product_id");
            String productName = resultSet.getString("p.name");
            double productPrice = resultSet.getDouble("p.price");

            Customer customer = null;
            for (Customer countCustomer : result) {
               if (countCustomer.getId() == id) {
                  customer = countCustomer;
                  break;
               }
            }

            if (customer == null) {
               customer = new CommonCustomer(id, name, new CommonCart());
               result.add(customer);
            }

            Product product = new CommonProduct(productId, productName, productPrice);
            customer.getCart().addProduct(product);
         }

         return result;
      } catch (Exception e) {
         throw new RuntimeException(e);
      }
   }

   // todo
   @Override
   public Customer getById(int id) {
      try (Connection connection = getConnection()) {
         String query = String.format("select * from customer as c " +
                 "left join customer_product as cp on c.customer_id=cp.customer_id " +
                 "left join product as p on cp.product_id=p.product_id " +
                 "where cp.customer_id = %d;", id);
//         String query = "select * from customer;";
         ResultSet resultSet = connection.createStatement().executeQuery(query);

         Customer customer = null;

         while (resultSet.next()) {
            String name = resultSet.getString(NAME);

            Cart cart = new CommonCart();
//            cart.addProduct();

         }

         return customer;
      } catch (Exception e) {
         throw new RuntimeException(e);
      }
   }

   @Override
   public void add(String name) {
      try (Connection connection = getConnection()) {


      } catch (Exception e) {
         throw new RuntimeException(e);
      }
   }

   @Override
   public void delete(int id) {
      try (Connection connection = getConnection()) {


      } catch (Exception e) {
         throw new RuntimeException(e);
      }
   }

   @Override
   public void addToCartById(int customerId, int productId) {
      try (Connection connection = getConnection()) {


      } catch (Exception e) {
         throw new RuntimeException(e);
      }
   }

   @Override
   public void deleteFromCartById(int customerId, int productId) {
      try (Connection connection = getConnection()) {


      } catch (Exception e) {
         throw new RuntimeException(e);
      }
   }

   @Override
   public void clearCart(int customerId) {
      try (Connection connection = getConnection()) {


      } catch (Exception e) {
         throw new RuntimeException(e);
      }
   }
}
