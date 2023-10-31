package de.telran.g_280323_m_be_shop._4controllers;

import de.telran.g_280323_m_be_shop._1domain.entity.interfaces.Customer;
import de.telran.g_280323_m_be_shop._3service.common.CommonCustomerService;
import de.telran.g_280323_m_be_shop._3service.interfaces.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

   private final CustomerService customerService = new CommonCustomerService();

   @GetMapping("/all")
   public List<Customer> getCustomer() {
      return customerService.getAll();
   }

   @GetMapping("/{id}")
   public Customer getById(@PathVariable int id) {
      return customerService.getById(id);
   }

   @PostMapping("/add")
   public void add(Customer customer) {
      customerService.add(customer);
   }

   @DeleteMapping("/delete-{id}")
   public void deleteById(@PathVariable int id) {
      customerService.deleteById(id);
   }

   @GetMapping("/count")
   public int getCount() {
      return customerService.getCount();
   }

   @GetMapping("/total-price-{id}")
   public double getTotalPriceById(@PathVariable int id) {
      return customerService.getTotalPriceById(id);
   }

   @GetMapping("/avg-price-{id}")
   public double getAveragePriceById(@PathVariable int id) {
      return customerService.getAveragePriceById(id);
   }

   @DeleteMapping("/delete-{name}")
   public void deleteByName(@PathVariable String name) {
      customerService.deleteByName(name);
   }

   @PostMapping("/add-to-{customerId}-by-{productId}")
   public void addToCartById(@PathVariable int customerId,@PathVariable int productId) {
      customerService.addToCartById(customerId, productId);
   }

   @DeleteMapping("/delete-from-{customerId}-by-{productId}")
   public void deleteFromCartById(@PathVariable int customerId,@PathVariable int productId) {
      customerService.deleteFromCartById(customerId, productId);
   }

   @DeleteMapping("/clear-{id}")
   public void clearCartById(@PathVariable int id) {
      customerService.clearCartById(id);
   }
}
