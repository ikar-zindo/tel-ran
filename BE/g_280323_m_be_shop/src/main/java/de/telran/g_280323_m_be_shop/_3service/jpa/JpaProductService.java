package de.telran.g_280323_m_be_shop._3service.jpa;

import de.telran.g_280323_m_be_shop._1domain.entity.common.CommonProduct;
import de.telran.g_280323_m_be_shop._1domain.entity.interfaces.Product;
import de.telran.g_280323_m_be_shop._1domain.entity.jpa.JpaProduct;
import de.telran.g_280323_m_be_shop._1domain.entity.jpa.Task;
import de.telran.g_280323_m_be_shop._2repository.jpa.JpaProductRepository;
import de.telran.g_280323_m_be_shop._3service.interfaces.ProductService;
import de.telran.g_280323_m_be_shop.schedule.ScheduleExecutor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JpaProductService implements ProductService {

   private final Logger LOGGER = LogManager.getLogger(JpaProductService.class);

   private JpaProductRepository repository;

   private TaskService taskService;

   public JpaProductService(JpaProductRepository repository, TaskService taskService) {
      this.repository = repository;
      this.taskService = taskService;
   }

   @Override
   public List<Product> getAll() {
      Task task = taskService.createTask("Запрошен список всех продуктов");
      ScheduleExecutor.executeScheduledTask(task);
      return new ArrayList<>(repository.findAll());
   }

   @Override
   public Product getById(int id) {
//      LOGGER.log(Level.INFO, "Запрошен продукт с id={}.", id);
//      LOGGER.log(Level.WARN, "Запрошен продукт с id={}.", id);
//      LOGGER.log(Level.ERROR, "Запрошен продукт с id={}.", id);


      // Аналогичная запись
      LOGGER.info("Запрошен продукт с id={}.", id);
      LOGGER.warn("Запрошен продукт с id={}.", id);
      LOGGER.error("Запрошен продукт с id={}.", id);

      return repository.findById(id).orElse(null);
   }

   @Override
   public void add(Product product) {

      // Здесь отрабатывает внедрённый код @Before

      repository.save(new JpaProduct(product.getId(), product.getName(), product.getPrice()));
      // Следующая строка - в учебных целях, для тестирования АОП
      // Ни на что не влияет
      ((CommonProduct) product).setId(777);

      // Здесь отрабатывает внедрённый код @After
   }

   @Override
   public void deleteById(int id) {
      Task task = taskService.createTask("Попытка удаления продукта БД с id={$}" + id);
      LOGGER.info("Вызван метод deleteById()");
      ScheduleExecutor.executeScheduledTaskOne(task);
      repository.deleteById(id);
   }

   @Override
   public int getCount() {

      return (int) repository.count();
   }

   @Override
   public double getTotalPrice() {
      return repository.getTotalPrice();
   }

   @Override
   public double getAveragePrice() {
      return repository.getAveragePrice();
   }

   @Override
   public void deleteByName(String name) {
      repository.deleteByName(name);
   }
}
