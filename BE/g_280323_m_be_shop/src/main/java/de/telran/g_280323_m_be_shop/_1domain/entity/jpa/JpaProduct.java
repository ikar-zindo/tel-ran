package de.telran.g_280323_m_be_shop._1domain.entity.jpa;

import de.telran.g_280323_m_be_shop._1domain.entity.interfaces.Product;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
@Table(name = "product")
public class JpaProduct implements Product {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "product_id")
   private int id;

   // Test - OK
   // Te - X
   // TEST - X
   // TEst - X
   // test - X
   @Column(name = "name")
//   @NotNull
//   @NotBlank
   @Pattern(regexp = "^[a-zA-Z0-9\\s\\-_]+$")
   private String name;

   @Column(name = "price")
   @DecimalMin(value = "0.2")
   @DecimalMax(value = "99999.99")
   private double price;

   /**
    * В этом месте не позволяет создать Logger
    */
//   private final Logger LOGGER = LogManager.getLogger(JpaCart.class);

   public JpaProduct() {
   }

   public JpaProduct(int id, String name, double price) {
      this.id = id;
      this.name = name;
      this.price = price;
   }

   @Override
   public int getId() {
      return id;
   }

   @Override
   public String getName() {
      return name;
   }

   @Override
   public double getPrice() {
      return price;
   }

   public void setId(int id) {
      this.id = id;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   @Override
   public String toString() {
      return getClass().getSimpleName() +
              "{ id=" + id +
              ", name='" + name + '\'' +
              ", price=" + price +
              '}';
   }
}
