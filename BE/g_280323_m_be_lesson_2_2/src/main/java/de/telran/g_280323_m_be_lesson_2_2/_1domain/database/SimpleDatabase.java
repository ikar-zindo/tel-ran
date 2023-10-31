package de.telran.g_280323_m_be_lesson_2_2._1domain.database;

import de.telran.g_280323_m_be_lesson_2_2._1domain.entity.CommonUser;
import de.telran.g_280323_m_be_lesson_2_2._1domain.entity.User;

import java.util.ArrayList;
import java.util.List;

public class SimpleDatabase implements Database {

   List<User> users = new ArrayList<>();

   public SimpleDatabase() {
      users.add(new CommonUser("Ivan", "qwe"));
      users.add(new CommonUser("Naomi", "asd"));
      users.add(new CommonUser("Maja", "zxc"));
   }
   @Override
   public void execute(String query) {
      // add Ivan qwe
      String[] parts = query.split(" ");
      users.add(new CommonUser(parts[1], parts[2]));
   }

   @Override
   public List<User> select(String query) {
      // get all
      // get Ivan
      String[] parts = query.split(" ");
      if (parts[1].equals("all")) {
         return users;
      } else {
         // по команде get all/Ivan
         List<User> result = new ArrayList<>();
         for (User user : users) {
            if (user.getName().equals(parts[1])) {
               // добавляет всех юзеров результирующий лист
               result.add(user);
               return result;
            }
         }
      }

      return null;
   }
}
