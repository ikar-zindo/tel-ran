package lesson17_lambdas_practice.task8;

import java.util.function.Function;

public class Main {

   // todo: Написать класс Request.
   //  Запрос должен содержать два поля - текст сообщения
   //  и целочисленный идентификатор отправителя.
   //  Используя функциональный интерфейс, написать функцию,
   //  которая принимает запрос и возвращает строку в виде:
   //  {Получен запрос: сообщение - [здесь_текст_сообщения], отправитель - [здесь_ид_отправителя]}
   //  Написать метод, который принимает запрос и данную функцию и выводит результат в консоль.

   public static void main(String[] args) {

      Function<Request, String> function = x -> String.format("{Получен запрос: сообщение - " +
              "[%s], отправитель - [%d]}", x.getMessage(), x.getId());

      Request request = new Request("Ваш заказ готов", 1);

      printMess(request, function);
   }

   public static void printMess(Request r, Function<Request, String> f) {
      System.out.println(f.apply(r));
   }
}
