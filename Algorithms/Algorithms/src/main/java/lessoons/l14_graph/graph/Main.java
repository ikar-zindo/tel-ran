package lessoons.l14_graph.graph;


public class Main {
   public static void main(String[] args) {

      Graph graph1 = new Graph();

      graph1.addVertex('A');
      graph1.addVertex('B');
      graph1.addVertex('C');
      graph1.addVertex('D');
      graph1.addEdge('A', 'B');
      graph1.addEdge('A', 'C');
      graph1.addEdge('B', 'D');

//      System.out.println(graph1.neighbors('D'));
//      System.out.println(graph1.vertices);
//      graph1.print();

      System.out.println(graph1.dfs('A'));

      Graph graph2 = new Graph();

      graph2.addVertex('A');
      graph2.addVertex('B');
      graph2.addVertex('C');
      graph2.addVertex('D');
      graph2.addEdge('A', 'B');
      graph2.addEdge('A', 'C');
      graph2.addEdge('B', 'D');

      System.out.println(graph1.dfs('A').equals(graph2.dfs('A')));
   }
}
