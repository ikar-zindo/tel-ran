package lesson11.task1;

import java.util.Stack;

public class StackTest {
   public static void main(String[] args) {

      Stack<String> stack = new Stack<>();

      stack.push("Hello");
      stack.push("World");
      stack.push("I");
      stack.push("study");
      stack.push("Java");

      System.out.println(stack);

      // Метод peek() позволяет получить метод с вершины Stack,
      // при этом не удаляя его из Stack
      String current = stack.peek();
      System.out.println("Текущий элемент с вершины стэка := " + current);
      System.out.println(stack);

      // В отличии от метода peek(), метод pop() удаляет элемент с вершины Stack
      current = stack.pop();
      System.out.println("Текущий элемент с вершины стэка := " + current);
      System.out.println(stack);

      // Метод empty() позволяет узнать, пустой ли Stack ? true : false
      // Если указанный объект в стеке отсутствует, то метод search возвращает -1.
      System.out.println("Пустой ли Stack? := " + stack.empty());

      System.out.println("Ищем в Stack элемент 'World' := " + stack.search("World"));
      System.out.println("Ищем в Stack элемент 'studying' := " + stack.search("study"));
   }
}
