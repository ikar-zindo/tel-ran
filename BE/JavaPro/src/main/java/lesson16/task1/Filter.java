package lesson16.task1;

@FunctionalInterface
public interface Filter {

   boolean test(Student student);

   // Не можем добавить в функциональный
   // интерфейс 2й абстрактный метод,
   // это будет ошибкой комриляции
}
