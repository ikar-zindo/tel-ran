package lesson13.task2;

public class Node {

   private int key;
   private String value;
   private Node left;
   private Node right;

   public Node(int key, String value) {
      this.key = key;
      this.value = value;
   }

   public int getKey() {
      return key;
   }

   public String getValue() {
      return value;
   }

   public Node getLeft() {
      return left;
   }

   public Node getRight() {
      return right;
   }

   public void setLeft(Node left) {
      this.left = left;
   }

   public void setRight(Node right) {
      this.right = right;
   }

   public void setValue(String value) {
      this.value = value;
   }

   @Override
   public String toString() {
      return String.format("Key - %d, value - %s, left - %d, right - %d.",
              key, value,
              left == null ? null : left.key,
              right == null ? null : right.key);
   }
}
