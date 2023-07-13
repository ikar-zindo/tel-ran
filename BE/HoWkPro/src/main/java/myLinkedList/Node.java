package myLinkedList;

public class Node {

   private String value;
   private Node next;
   private Node previous;

   public Node(String value) {
      this.value = value;
   }

   public Node(String value, Node next) {
      this.value = value;
      this.next = next;
   }

   public Node(Node previous, String value) {
      this.value = value;
      this.previous = previous;
   }

   public Node(String value, Node next, Node previous) {
      this.value = value;
      this.next = next;
      this.previous = previous;
   }

   public String getValue() {
      return value;
   }

   public void setValue(String value) {
      this.value = value;
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
