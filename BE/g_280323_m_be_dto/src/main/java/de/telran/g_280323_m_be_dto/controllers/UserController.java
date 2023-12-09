package de.telran.g_280323_m_be_dto.controllers;

import de.telran.g_280323_m_be_dto.domain.dto.UserDto;
import de.telran.g_280323_m_be_dto.domain.entity.User;
import de.telran.g_280323_m_be_dto.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

   private UserService service;

   public UserController(UserService service) {
      this.service = service;
   }

   @GetMapping("")
   public List<UserDto> getAll() {
      return service.getAll();
   }

   @GetMapping("/{id}")
   public UserDto getById(@PathVariable long id) {
      return service.getById(id);
   }

   @PostMapping("")
   public UserDto addUser(@RequestBody UserDto user) {
      return service.save(user);
   }

   @DeleteMapping("/{id}")
   public void deleteById(@PathVariable long id) {
      service.delete(id);
   }
}
