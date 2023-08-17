package _2023_08_14.binaryTree;

public class Main {

   public static void main(String[] args) {

      BinaryTree tree = new BinaryTree();

      System.out.println("Пустое ли дерево? - " + tree.isEmpty());

      tree.add(10, "Node 10");
      tree.add(2, "Node 2");
      tree.add(13, "Node 13");
      tree.add(1, "Node 1");
      tree.add(6, "Node 6");
      tree.add(12, "Node 12");
      tree.add(81, "Node 81");
      tree.add(5, "Node 5");

      System.out.println("Пустое ли дерево? - " + tree.isEmpty());

      // 10  2  13  1  6  12  81  5
      TreeUtils.breadthFirstSearch(tree);

      // 1  2  5  6  10  12  13  81
      TreeUtils.depthInorder(tree);

      // 10  2  1  6  5  13  12  81
      TreeUtils.depthPreorder(tree);

      // 1  5  6  2  12  81  13  10
      TreeUtils.depthPostorder(tree);

      System.out.println(tree.search(12));
      System.out.println(tree.search(6));
   }
}