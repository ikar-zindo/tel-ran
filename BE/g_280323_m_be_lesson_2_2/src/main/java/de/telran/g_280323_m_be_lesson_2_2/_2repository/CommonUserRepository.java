package de.telran.g_280323_m_be_lesson_2_2._2repository;

import de.telran.g_280323_m_be_lesson_2_2._1domain.database.Database;
import de.telran.g_280323_m_be_lesson_2_2._1domain.database.SimpleDatabase;
import de.telran.g_280323_m_be_lesson_2_2._1domain.entity.User;

import java.util.List;

public class CommonUserRepository implements UserRepository{

   private final Database database = new SimpleDatabase();

   @Override
   public List<User> getAll() {
      return database.select("get all");
   }

   @Override
   public List<User> getByName(String name) {
      return database.select("get " + name);
   }

   @Override
   public void addUser(User user) {
      database.execute("add " + user.getName() + " " + user.getPassword());
   }

   @Override
   public void deleteUser(String name) {
       database.execute("delete " + name);
   }
}
