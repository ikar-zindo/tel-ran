package lesson13.task2;

public class Main {
   public static void main(String[] args) {

      MyBinaryTree tree = new MyBinaryTree();

      System.out.println("Пустое ли дерево? := " + tree.isEmpty());

      tree.add(10, "Node 10");
      tree.add(2, "Node 2");
      tree.add(13, "Node 13");
      tree.add(1, "Node 1");
      tree.add(6, "Node 6");
      tree.add(12, "Node 12");
      tree.add(81, "Node 81");
      tree.add(5, "Node 5");

      System.out.println("Пустое ли дерево? := " + tree.isEmpty());

      // 10  2  13  1  6  12  81  5
      TreeUtils.breadthFirstSearch(tree);

      // 1  2  5  6  10  12  13  81
      TreeUtils.depthInorder(tree);
   }
}
