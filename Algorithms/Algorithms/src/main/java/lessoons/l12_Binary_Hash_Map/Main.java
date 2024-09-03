package lessoons.l12_Binary_Hash_Map;

public class Main {
   public static void main(String[] args) {

      Tree tree = new Tree(10);
      tree.add(8);
      tree.add(12);
      tree.add(9);
      tree.add(11);
      tree.add(6);
      tree.add(0);

      System.out.println(tree.node.right);

//      System.out.println("Значение главного узла дерева := " + tree.value);
//
      System.out.println("Поиск элемента 8 := " + tree.find(0));
      System.out.println("Поиск элемента 8 := " + tree.find(100));
//
//      System.out.println("Поиск элемента 8 := " + tree.find1(0));
//      System.out.println("Поиск элемента 8 := " + tree.find1(110));
//
      tree.remove(8);
      System.out.println("Левая ветка дерева после удаления 8 := " + tree.node.left);
//
      System.out.println("Высота дерева := " + tree.height(tree.node));
//
      System.out.println("Количество узлов в дереве := " + tree.count(tree.node));
   }
}
