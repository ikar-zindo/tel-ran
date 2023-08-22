package myLinkedList;

public class Main {
   public static void main(String[] args) {

      MyLinkedList list = new MyLinkedList();

      list.addFirst("AAA");
      list.addFirst("BBB");
      list.addFirst("CCC");

      list.addLast("FFF");

      System.out.println(list);
   }
}
