package lesson12_Binary_Hash_Map;

class Node {
   int value;
   Node left = null;
   Node right = null;

   public Node(int value) {
      this.value = value;
   }
}

public class Tree {
   Node node;

   public Tree(int value) {
      this.node = new Node(value);
   }

   public void add(int value) {
      Node current = this.node;

      while (true) {
         if (value < current.value) {
            if (current.left == null) {
               current.left = new Node(value);
               return;
            } else current = current.left;
         } else {
            if (current.right == null) {
               current.right = new Node(value);
               return;
            } else current = current.right;
         }
      }
   }

   public boolean find(int value) {
      Node current = this.node;

      while (true) {
         if (value == current.value) return true;
         if (value < current.value) {
            if (current.left == null) {
               return false;
            } else current = current.left;
         } else {
            if (current.right == null) {
               return false;
            } else current = current.right;
         }
      }
   }
//   public boolean find1(int num) {
//
//      if (value == num) return true;
//
//      if (num < value && left != null) return left.find(num);
//
//      if (num > value && right != null) return right.find(num);
//
//      return false;
//   }


   // Удаление поддерева
   public void remove(int value) {


      if (!find(value)) throw new Error("The element you`re looking for is not here");

      if (value == node.value) throw new Error("You can`t remove the root element");

      Node current = this.node;
      while (true) {
         if (value < current.value) {
            if (value == current.left.value) {
               current.left = null;
               return;
            } else {
               current = current.left;
            }
         } else {
            if (value == current.right.value) {
               current.right = null;
               return;
            } else {
               current = current.right;
            }
         }
      }
   }

   // Вычеслеие высоты дерева
   public int height(Node tree) {

      Node node = this.node;

      if (tree == null) return 0;

      return 1 + Math.max(height(node.left), height(node.right));
   }

   public int count(Node tree) {
      Node node = this.node;

      if (node == null) return 0;
      return 1 + count(node.left) + count(node.right);
   }
}
