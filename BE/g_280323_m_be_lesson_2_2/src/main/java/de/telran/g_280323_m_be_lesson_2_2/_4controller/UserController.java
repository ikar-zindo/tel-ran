package de.telran.g_280323_m_be_lesson_2_2._4controller;


import de.telran.g_280323_m_be_lesson_2_2._1domain.entity.CommonUser;
import de.telran.g_280323_m_be_lesson_2_2._1domain.entity.User;
import de.telran.g_280323_m_be_lesson_2_2._3service.CommonUserService;
import de.telran.g_280323_m_be_lesson_2_2._3service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * http запросы:
 *    получить:
 *       всех пользователей
 *       1 пользователя по имени
 *       добавить нового пользователя в базы
 */

// http://localhost:8080/user

@RestController
@RequestMapping("/user")
public class UserController {

   private final UserService service = new CommonUserService();

   @GetMapping("/all")
   public List<User> getUsers() {
      return service.getAll();
   }

   @GetMapping("/{name}")
   public User getByName(@PathVariable String name) {
      return service.getByName(name);
   }

   @PostMapping("/add")
   public void addUser(@RequestBody CommonUser user) {
      service.add(user);
   }
}
