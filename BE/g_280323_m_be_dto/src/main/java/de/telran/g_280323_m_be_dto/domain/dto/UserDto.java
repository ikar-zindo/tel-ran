package de.telran.g_280323_m_be_dto.domain.dto;

import java.math.BigDecimal;
import java.util.Objects;

public class UserDto {

   private long id;

   private String name;

   private String password;

   private BigDecimal money;

   private DogDTO dog;

   public UserDto() {
   }

   public DogDTO getDog() {
      return dog;
   }

   public void setDog(DogDTO dog) {
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

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      UserDto userDto = (UserDto) o;
      return id == userDto.id && Objects.equals(name, userDto.name) && Objects.equals(password, userDto.password) && Objects.equals(money, userDto.money) && Objects.equals(dog, userDto.dog);
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, name, password, money, dog);
   }

   @Override
   public String toString() {
      return "UserDto{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", password='" + password + '\'' +
              ", money=" + money +
              ", dog=" + dog +
              '}';
   }
}
