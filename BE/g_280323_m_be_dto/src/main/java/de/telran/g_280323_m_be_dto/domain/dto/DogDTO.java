package de.telran.g_280323_m_be_dto.domain.dto;

import java.util.Objects;

public class DogDTO {

   private long id;
   private String name;
   private int age;

   public DogDTO() {
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

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      DogDTO dogDTO = (DogDTO) o;
      return id == dogDTO.id && age == dogDTO.age && Objects.equals(name, dogDTO.name);
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, name, age);
   }

   @Override
   public String toString() {
      return "DogDTO{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", age=" + age +
              '}';
   }
}
