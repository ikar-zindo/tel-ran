package de.telran.g_280323_m_be_lesson_2_2._3service;

import de.telran.g_280323_m_be_lesson_2_2._1domain.entity.User;

import java.util.List;

public interface UserService {

   List<User> getAll();

   User getByName(String name);

   void add(User user);

//   void delete(String name);
}
