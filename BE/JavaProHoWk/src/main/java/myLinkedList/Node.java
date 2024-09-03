package myLinkedList;

public class Node {

   private final String value;
   private Node next;
   private Node previous;

   public Node(String value) {
      this.value = value;
   }

   public String getValue() {
      return value;
   }

   public Node getNext() {
      return next;
   }

   public void setNext(Node next) {
      this.next = next;
   }

   public Node getPrevious() {
      return previous;
   }

   public void setPrevious(Node previous) {
      this.previous = previous;
   }
}
