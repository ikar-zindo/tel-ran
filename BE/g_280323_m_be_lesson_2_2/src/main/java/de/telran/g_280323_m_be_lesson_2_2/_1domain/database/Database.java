package de.telran.g_280323_m_be_lesson_2_2._1domain.database;

import de.telran.g_280323_m_be_lesson_2_2._1domain.entity.User;

import java.util.List;

public interface Database {

   void execute(String query);
   List<User> select(String query);
}
