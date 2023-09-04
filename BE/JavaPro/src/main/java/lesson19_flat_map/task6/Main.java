package lesson19_flat_map.task6;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
   public static void main(String[] args) {

      // 0. Создать класс Employee (имя, должность, зарплата)
      // 1. Вывести всех сотрудников без высшего руководителя
      // 2. Сгруппировать сотрудников по должности
      // 3. Вычислить среднюю зарплату всех сотрудников (двумя способами)
      // 4. Получить список сотрудников с зп > 1000
      // 5. Получить список сотрудников из отдела маркетинг и увеличить зп на 15%
      // 6. Получить сотрудника с самой низкой зп
      // 7. Получите сотрудников из всех отделов с максимальной зп

      // Aleks Developer 1500
      // Thomas Manager 680.50
      // Thea CEO 2000
      // Mary Manager 700
      // Ken Developer 900

      List<Employee> employees = new ArrayList<>();

      employees.add(new Employee("Aleks", "Developer", 1500));
      employees.add(new Employee("Thomas", "Manager", 680.50));
      employees.add(new Employee("Thea", "CEO", 2000));
      employees.add(new Employee("Mary", "Manager", 700));
      employees.add(new Employee("Ken", "Developer", 900));

      // todo: 1. Вывести всех сотрудников без высшего руководителя
      List<Employee> withoutCEO = employees.stream()
              .filter(x -> !x.getPosition().equals("CEO"))
              .toList();

      employees.forEach(System.out::println);
      System.out.println("========================================================");
      withoutCEO.forEach(System.out::println);

      System.out.println("========================================================");
      Map<String, List<Employee>> listPosition = new HashMap<>();

      // todo: 2. Сгруппировать сотрудников по должности
      for (Employee employee : employees) {

         if (listPosition.containsKey(employee.getPosition())) {
            listPosition.get(employee.getPosition()).add(employee);
         } else {
            List<Employee> list = new ArrayList<>();
            list.add(employee);
            listPosition.put(employee.getPosition(), list);
         }
      }

      System.out.println(listPosition);

      // todo: 2.1 Сгруппировать сотрудников по должности
      Map<String, List<Employee>> listPosition1 = employees.stream()
              .collect(Collectors.groupingBy(x -> x.getPosition()));

      System.out.println("========================================================");
      System.out.println(listPosition1);

      // todo: 3. Вычислить среднюю зарплату всех сотрудников (двумя способами)
      int totalSalary = 0;
      int numberOfEmployees = 0;

      for (Employee employee : employees) {
         totalSalary += employee.getSalary();
         numberOfEmployees++;
      }
      System.out.println("Average salary (crude solution): " + (double) totalSalary / numberOfEmployees);

      // todo: 3.1 Вычислить среднюю зарплату всех сотрудников (двумя способами)
      Double avgSalary = employees.stream()
              .mapToDouble(x -> x.getSalary())
              .average()
              .orElse(0);

      System.out.println("Average salary (crude solution): " + avgSalary);
      System.out.println("========================================================");

      // todo: 4. Получить список сотрудников с зп > 1000
      List<Employee> list1000 = employees.stream().filter(x -> x.getSalary() > 1000).toList();
      System.out.println(list1000);
      System.out.println("========================================================");

      // todo: 5. Получить список сотрудников из отдела маркетинг и увеличить зп на 15%
      employees.stream()
              .filter(x -> x.getPosition().equals("Manager"))
              .forEach(x -> x.setSalary(x.getSalary() * 1.15));

      employees.forEach(System.out::println);
      System.out.println("========================================================");

      // todo: 6. Получить сотрудника с самой низкой зп
      Employee lowEmployee = employees.stream()
              .min((x1, x2) -> Double.compare(x1.getSalary(), x2.getSalary()))
              .orElse(null);
      System.out.println("Сотрудник с минималной зп := " + lowEmployee);
      System.out.println("========================================================");


      // todo: 7. Получите сотрудников из всех отделов с максимальной зп
      employees.stream()
              .collect(Collectors.groupingBy(x -> x.getPosition()))
              .forEach((x, y) -> y.stream()
                      .sorted((a, b) -> Double.compare(b.getSalary(), a.getSalary()))
                      .limit(1)
                      .forEach(System.out::println));
   }
}
