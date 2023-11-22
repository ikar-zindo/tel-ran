package de.telran.g_280323_m_be_security.controller;

import de.telran.g_280323_m_be_security.domain.entity.User;
import de.telran.g_280323_m_be_security.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

   private UserService service;

   public UserController(UserService service) {
      this.service = service;
   }

   // Разрешён для всех, в том числе неавторизованных

   @GetMapping("/all")
   public List<User> getAll() {
      return service.getAll();
   }

   // Разрешён только для авторизованных пользователей с любой ролью

   @GetMapping("/name/{username}")
   public UserDetails getByUsername(@PathVariable String username) {
      return service.loadUserByUsername(username);
   }

   // Разрешён только для авторизованных пользователей с ролью ROLE_ADMIN

   @PostMapping("/save")
   public User save(@RequestBody User user) {
      return service.save(user);
   }
}
