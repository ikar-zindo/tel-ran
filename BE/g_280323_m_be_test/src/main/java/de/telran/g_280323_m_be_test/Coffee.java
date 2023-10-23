package de.telran.g_280323_m_be_test;

public class Coffee {

   private int id;
   private String name;

   public Coffee(int id, String name) {
      this.id = id;
      this.name = name;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return String.format(getClass().getSimpleName() + ": id:= %d, type:= %s", id, name);
   }
}
