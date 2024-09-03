package lessoons.l13_binary_tree;//package l13_binary_tree;
//
//
//import java.util.ArrayList;
//
//class Node {
//   int value;
//   Node left = null;
//   Node right = null;
//
//   public Node(int value) {
//      this.value = value;
//   }
//
//}
//
//public class Tree {
//
//   Node root;
//
//   public Tree(int value) {
//      root = new Node(value);
//   }
//
//   public void add(int value) {
//      Node current = root;
//      while (true) {
//         if (value == current.value) {
//            throw new Error("The current value already exists in this tree");
//         }
//         if (value < current.value) {
//            if (current.left == null) {
//               current.left = new Node(value);
//               return;
//            } else current = current.left;
//         } else {
//            if (current.right == null) {
//               current.right = new Node(value);
//               return;
//            } else current = current.right;
//         }
//      }
//   }
//
//   public boolean find(int value) {
//      Node current = root;
//      while (true) {
//         if (value == current.value) return true;
//         if (value < current.value) {
//            if (current.left == null) {
//               return false;
//            } else current = current.left;
//         } else {
//            if (current.right == null) {
//               return false;
//            } else current = current.right;
//         }
//      }
//   }
//
//   public void remove(int value) {
//      if (!find(value)) {
//         throw new Error("Error - No such element to remove!");
//      }
//      if (value == root.value) throw new Error("Ye root shalt not be removed.");
//      Node current = root;
//      while (true) {
//         if (value < current.value) {
//            if (value == current.left.value) {
//               current.left = null;
//               return;
//            } else current = current.left;
//         } else {
//            if (value == current.right.value) {
//               current.right = null;
//               return;
//            } else current = current.right;
//         }
//      }
//   }
//
//   public int height(Node node) {
//      if (node == null) return 0;
//      return 1 + Math.max(height(node.left), height(node.right));
//   }
//
//   public int count(Node node) {
//      if (node == null) return 0;
//      return 1 + count(node.left) + count(node.right);
//   }
//
//   public int countCustom(int value) {
//      if (!find(value)) throw new Error("There is no such element in this tree");
//      Node current = root;
//      while (true) {
//         if (value == current.value)
//            return count(current);
//         else if (value < current.value)
//            current = current.left;
//         else
//            current = current.right;
//      }
//   }
//
//   public int heightCustom(int value) {
//      if (!find(value)) throw new Error("There is no such element in this tree");
//      Node current = root;
//      while (true) {
//         if (value == current.value)
//            return height(current);
//         else if (value < current.value)
//            current = current.left;
//         else
//            current = current.right;
//      }
//   }
//
////   public void dfs(Node node) {
////      if (node == null) return;
////
////      System.out.println(node.value);
////      dfs(node.left);
////      dfs(node.right);
////   }
//
//   public ArrayList<Integer> dfs(Node node) {
//      ArrayList<Integer> array = new ArrayList<>();
//      dfsRecursion(node, array);
//
//      return array;
//   }
//
//   public void dfsRecursion(Node node, ArrayList<Integer> array) {
//      if (node == null) return;
//      array.add(node.value);
//      dfsRecursion(node.left, array);
//      dfsRecursion(node.right, array);
//
//   }
//
//   public ArrayList<Integer> dfs(Node node) {
//      ArrayList<Integer> array = new ArrayList<>();
//      dfsRecursion(node, array);
//
//      return array;
//   }
//
//   private void dfsRecursion(Node node, ArrayList<Integer> array) {
//      if (node == null) return;
//      array.add(node.value);
//      dfsRecursion(node.left, array);
//      dfsRecursion(node.right, array);
//
//   }
//}
//
//
//
