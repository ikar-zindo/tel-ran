package de.telran.g_280323_m_be_dto.domain.entity;

import java.util.Objects;

public class Dog {

   private long id;

   private int age;

   private String name;

   public Dog() {
   }


   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Dog dog = (Dog) o;
      return id == dog.id && age == dog.age && Objects.equals(name, dog.name);
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, age, name);
   }

   @Override
   public String toString() {
      return "Dog{" +
              "id=" + id +
              ", age=" + age +
              ", name='" + name + '\'' +
              '}';
   }
}
