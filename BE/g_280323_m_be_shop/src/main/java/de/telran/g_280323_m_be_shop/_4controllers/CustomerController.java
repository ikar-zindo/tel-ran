package de.telran.g_280323_m_be_shop._4controllers;

import de.telran.g_280323_m_be_shop._1domain.entity.interfaces.Customer;
import de.telran.g_280323_m_be_shop._2repository.interfaces.CustomerRepository;
import de.telran.g_280323_m_be_shop._3service.common.CommonCustomerService;
import de.telran.g_280323_m_be_shop._3service.interfaces.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
