package de.telran.g_280323_m_be_shop._1domain.entity.jpa;

import com.fasterxml.jackson.annotation.JsonIgnore;
import de.telran.g_280323_m_be_shop._1domain.entity.interfaces.Customer;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;

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

   public JpaCustomer() {
   }

   public JpaCustomer(int id, String name) {
      this.id = id;
      this.name = name;
   }

   public JpaCustomer(int id, String name, String email, int age, JpaCart cart) {
      this.id = id;
      this.name = name;
      this.email = email;
      this.age = age;
      this.cart = cart;
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
