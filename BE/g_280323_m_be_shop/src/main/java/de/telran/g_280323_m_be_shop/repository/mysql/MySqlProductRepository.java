package de.telran.g_280323_m_be_shop.repository.mysql;

import de.telran.g_280323_m_be_shop.domain.entity.common.CommonProduct;
import de.telran.g_280323_m_be_shop.domain.entity.interfaces.Product;
import de.telran.g_280323_m_be_shop.repository.interfaces.ProductRepository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static de.telran.g_280323_m_be_shop.domain.database.MySqlConnector.getConnection;

/**
 * Репозиторий продуктов.
 * Содержит сформированные SQL запросы в методах для поиска отображения всех продуктов,
 * поиску, а так же добавление, удаление продуктов из БД.
 */
public class MySqlProductRepository implements ProductRepository {

   private final String ID = "product_id";
   private final String NAME = "name";
   private final String PRICE = "price";

   /**
    * Получение всех продуктов.
    * @return список всех продуктов, хранящихся в БД.
    */
   @Override
   public List<Product> getAll() {
      try (Connection connection = getConnection()) {
         String query = "SELECT * FROM `product`;";
         ResultSet resultSet = connection.createStatement().executeQuery(query);

         List<Product> result = new ArrayList<>();

         while (resultSet.next()) {
            int id = resultSet.getInt(ID);
            String name = resultSet.getString(NAME);
            double price = resultSet.getInt(PRICE);

            result.add(new CommonProduct(id, name, price));
         }

         return result;
      } catch (Exception e) {
         throw new RuntimeException(e);
      }
   }

   /**
    * Получение продукта по идентификатору.
    * @param id    идентификатор продукта.
    * @return      продукт, имеющий переданный идентификатор.
    */
   @Override
   public Product getById(int id) {
      try (Connection connection = getConnection()) {
         String query = String.format("SELECT * FROM `product` WHERE `product_id`=%d;", id);
         ResultSet resultSet = connection.createStatement().executeQuery(query);

         Product product = null;

         while (resultSet.next()) {
            String name = resultSet.getString(NAME);
            double price = resultSet.getDouble(PRICE);
            product = new CommonProduct(id, name, price);
         }

         return product;
      } catch (Exception e) {
         throw new RuntimeException(e);
      }
   }

   /**
    * Добавление продукта
    * @param name    наименование продукта, добавляемого в БД
    * @param price   цена продукта, добавляемого в БД
    */
   @Override
   public void add(String name, double price) {
      try (Connection connection = getConnection()) {
         String query = String.format(Locale.US, "INSERT INTO `product` (`name`, `price`) VALUES ('%s', '%.2f');", name, price);
         connection.createStatement().execute(query);
      } catch (Exception e) {
         throw new RuntimeException(e);
      }
   }

   /**
    * Удаление продукта.
    * @param id идентификатор удаляемого из БД продукта.
    */
   @Override
   public void delete(int id) {
      try (Connection connection = getConnection()) {
         String query = String.format("DELETE FROM `product` WHERE (`product_id` = '%d');", id);
         connection.createStatement().execute(query);
      } catch (Exception e) {
         throw new RuntimeException(e);
      }
   }
}
