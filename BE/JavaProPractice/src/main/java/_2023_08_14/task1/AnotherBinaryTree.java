package _2023_08_14.task1;

public class AnotherBinaryTree {

   private Node root;

   public void add(int key, int value) {
   }

   private Node addRecursive(Node current, int value) {

      if (current == null) {
         return new Node(value, null, null);
      }

      if (value < current.value) {
         current.left = addRecursive(current.left, value);
      } else {
         current.right = addRecursive(current.right, value);
      }

      return current;
   }

   static class Node {
      private int key;
      private int value;
      Node right;
      Node left;

      public Node(int value, Node right, Node left) {
         this.value = value;
         this.right = right;
         this.left = left;
      }

      public Node(int key, int value) {
         this.key = key;
         this.value = value;
      }
   }
}
