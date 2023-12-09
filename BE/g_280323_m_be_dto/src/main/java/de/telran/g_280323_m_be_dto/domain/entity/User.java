package de.telran.g_280323_m_be_dto.domain.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "user")
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;

   @Column(name = "name")
   private String name;

   @Column(name = "password")
   private String password;

   @Column(name = "money")
   private BigDecimal money;


   private Dog dog;

   public User() {
   }

   public User(long id, String name, String password, BigDecimal money) {
      this.id = id;
      this.name = name;
      this.password = password;
      this.money = money;
   }

   public User(long id, String name, String password, BigDecimal money, Dog dog) {
      this.id = id;
      this.name = name;
      this.password = password;
      this.money = money;
      this.dog = dog;
   }

   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public BigDecimal getMoney() {
      return money;
   }

   public void setMoney(BigDecimal money) {
      this.money = money;
   }

   public Dog getDog() {
      return dog;
   }

   public void setDog(Dog dog) {
      this.dog = dog;
   }


   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      User user = (User) o;
      return id == user.id && Objects.equals(name, user.name) && Objects.equals(password, user.password) && Objects.equals(money, user.money) && Objects.equals(dog, user.dog);
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, name, password, money, dog);
   }

   @Override
   public String toString() {
      return getClass().getSimpleName() + "{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", password='" + password + '\'' +
              ", money=" + money +
              ", dog=" + dog +
              '}';
   }
}
