package de.telran.g_280323_m_be_shop._1domain.entity.jpa;

import de.telran.g_280323_m_be_shop._1domain.entity.interfaces.Product;
import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class JpaProduct implements Product {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "product_id")
   private int id;

   @Column(name = "name")
   private String name;

   @Column(name = "price")
   private double price;

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
}
