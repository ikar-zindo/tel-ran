package prctice_07_08_2023;

public class LinkedStackTest {
   public static void main(String[] args) {

      ObjectLinkedStack stack = new ObjectLinkedStack();

      stack.push("One");
      stack.push("Two");
      stack.push("Three");
      stack.push("Four");
      System.out.println(stack);

      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.size());

   }
   public static void stringStack() {

      LinkedStack stack = new LinkedStack();

      stack.push("One");
      stack.push("Two");
      stack.push("Three");
      stack.push("Four");
      System.out.println(stack);

      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.size());
//      System.out.println(stack.pop());
   }
}
