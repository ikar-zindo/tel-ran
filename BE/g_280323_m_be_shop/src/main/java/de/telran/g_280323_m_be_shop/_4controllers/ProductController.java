package de.telran.g_280323_m_be_shop._4controllers;

import de.telran.g_280323_m_be_shop._1domain.entity.common.CommonProduct;
import de.telran.g_280323_m_be_shop._1domain.entity.interfaces.Product;
import de.telran.g_280323_m_be_shop._3service.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * GET: http://localhost:8080/product/all
 * {
 *     "timestamp": "2023-10-31T18:39:59.416+00:00",
 *     "status": 500,
 *     "error": "Internal Server Error",
 *     "path": "/product/all"
 * }
 */
@RestController
@RequestMapping("/product")
public class ProductController {

   @Autowired
   private ProductService productService;

   @GetMapping("/all")
   public List<Product> getAll() {
      return productService.getAll();
   }

   @GetMapping("/{id}")
   public Product getById(@PathVariable int id) {
      return productService.getById(id);
   }

   @PostMapping("/add")
   public Product add(@RequestBody CommonProduct product) {
      productService.add(product);
      return product;
   }

   @DeleteMapping("/delete-{id}")
   public void deleteById(@PathVariable int id) {
      productService.deleteById(id);
   }

   @GetMapping("/count")
   public int getCount() {
      return productService.getCount();
   }

   @GetMapping("/total-price")
   public double getTotalPrice() {
      return productService.getTotalPrice();
   }

   @GetMapping("/avg")
   public double getAveragePrice() {
      return productService.getAveragePrice();
   }

   @DeleteMapping("/delete-{name}")
   public void deleteByName(@PathVariable String name) {
      productService.deleteByName(name);
   }
}
