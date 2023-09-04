package lesson19_flat_map.task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void main(String[] args) {

      // Есть список товаров
      // Отфильтровать товары таким образом, чтобы получить
      // список товаров дороже 100 единиц и без дубликатов

      List<Product> products = new ArrayList<>();

      products.add(new Product("Sofa", 150));
      products.add(new Product("Table", 120));
      products.add(new Product("Сhair", 80));
      products.add(new Product("Bad", 80));
      products.add(new Product("Bad", 180));
      products.add(new Product("Microwave", 70));
      products.add(new Product("Fridge", 90));

      List<String> result = products.stream() // Получаем стрим продуктов
              .filter(x -> x.getPrice() > 100) // Фильтруем продукты по цене (на выходе стрим продуктов)
              .map(x -> x.getName()) // Стрим продуктов преобразуем в стрим String
              .distinct() // Из стрима String убираем дубликаты
              .toList(); // Стрим String преобразуем в лист

      System.out.println(result);
   }
}
