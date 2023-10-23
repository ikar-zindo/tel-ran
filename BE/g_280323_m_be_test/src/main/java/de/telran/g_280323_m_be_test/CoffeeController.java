package de.telran.g_280323_m_be_test;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// http://localhost:8080/coffee := именно на запросы, поступившие на этот адрес,
//
// http://localhost:8080/user    на запросы
// http://localhost:8080/admin

@RestController
@RequestMapping("/coffee")
public class CoffeeController {

   private final List<Coffee> coffeeList = new ArrayList<>();

   public CoffeeController() {
      coffeeList.add(new Coffee(1, "Latte"));
      coffeeList.add(new Coffee(2, "Cappuccino"));
      coffeeList.add(new Coffee(3, "Espresso"));
      coffeeList.add(new Coffee(4, "Irish"));
      coffeeList.add(new Coffee(5, "Mocha"));
   }

   // GET -> http://localhost:8080/coffee/all

   @GetMapping("/all")
   public List<Coffee> getAll() {
      return coffeeList;
   }

   // GET -> http://localhost:8080/coffee/2
   @GetMapping("/{id}")
   public Coffee getById(@PathVariable int id) {
      for (Coffee coffee : coffeeList) {
         if (coffee.getId() == id) {
            return coffee;
         }
      }

      return null;
   }

   // POST -> http://localhost:8080/coffee/add

   @PostMapping("/add")
   public Coffee addCoffee(@RequestBody Coffee coffee) {
      coffeeList.add(coffee);
      return coffee;
   }

   // DELETE -> http://localhost:8080/coffee/delete/2

   @DeleteMapping("delete/{id}")
   public void deleteCoffee(@PathVariable int id) {
      Iterator<Coffee> iterator = coffeeList.iterator();
      while (iterator.hasNext()) {
         if (iterator.next().getId() == id) {
            iterator.remove();
            break;
         }
      }
   }
}
