package de.telran.g_280323_m_be_shop._1domain.entity.jpa;

import de.telran.g_280323_m_be_shop._1domain.entity.interfaces.Customer;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Запускал, вроде отрабатывает корректно
 *
 * такого парня добавило
 * {
 *     "name": "Michael",
 *     "age": 100,
 *     "email": "michael@gmail.com"
 * }
 *
 * такого парня - НЕТ
 * {
 *     "name": "Michael",
 *     "age": 12,
 *     "email": "michael@@gmail.com"
 * }
 */
@Entity
@Table(name = "customer")
public class JpaCustomer implements Customer {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "customer_id")
   private int id;

   @Column(name = "name")
   private String name;

   @Column(name = "email")
   @Pattern(regexp = "^[\\w\\.-]+@[a-zA-Z\\d\\.-]+\\.[a-zA-Z]{2,}$")
   private String email;

   @Column(name = "age")
   @Min(value = 14)
   @Max(value = 120)
   private int age;

   @OneToOne(mappedBy = "customer")
   private JpaCart cart;


   /**
    * В этом месте не позволяет создать Logger
    */
//   private final Logger LOGGER = LoggerFactory.getLogger(JpaCustomer.class);
   public JpaCustomer() {
   }

   public JpaCustomer(int id, String name) {
      this.id = id;
      this.name = name;
   }

   public JpaCustomer(int id, String name, String email, int age) {
      this.id = id;
      this.name = name;
      this.email = email;
      this.age = age;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   @Override
   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   @Override
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public JpaCart getCart() {
      return cart;
   }

   public void setCart(JpaCart cart) {
      this.cart = cart;
   }
}
