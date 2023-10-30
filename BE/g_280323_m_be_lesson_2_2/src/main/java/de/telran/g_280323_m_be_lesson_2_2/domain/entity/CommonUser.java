package de.telran.g_280323_m_be_lesson_2_2.domain.entity;

public class CommonUser implements User {

   private String name;
   private String password;

   @Override
   public String getName() {
      return name;
   }

   @Override
   public String getPassword() {
      return password;
   }

   public CommonUser(String name, String password) {
      this.name = name;
      this.password = password;
   }

   @Override
   public String toString() {
      return getClass().getSimpleName() + '{' +
              "name='" + name + '\'' +
              ", password='" + password + '\'' +
              '}';
   }
}
