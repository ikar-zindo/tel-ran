package de.telran.g_280323_m_be_lesson_2_2._3service;

public class PasswordService {

   public boolean isPasswordCorrect(String password) {
      return password.length() >= 3;
   }
}
