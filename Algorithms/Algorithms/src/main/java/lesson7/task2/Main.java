package lesson7.task2;

import java.util.Stack;

public class Main {
   public static void main(String[] args) {

      StackTest stack = new StackTest();
      stack.push(1);
      stack.push(2);
      stack.push(8);
      stack.push(0);
      stack.push(6);


      System.out.println(stack.items);
      System.out.println("min := " + stack.getMin());
      System.out.println("max := " + stack.getMax());

      System.out.println("length := " + stack.getLength());
      System.out.println("last element := " + stack.peek());

//      stack.clear();
      stack.increment();
      System.out.println(stack.items);
   }
}
