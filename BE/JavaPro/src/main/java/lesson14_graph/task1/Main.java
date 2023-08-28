package lesson14_graph.task1;

import java.util.HashSet;
import java.util.Set;

public class Main {
   public static void main(String[] args) {

      Set<Edge> edges = new HashSet<>();

      edges.add(new Edge(0, 3));
      edges.add(new Edge(1, 2));
      edges.add(new Edge(1, 6));
      edges.add(new Edge(2, 1));
      edges.add(new Edge(2, 3));
      edges.add(new Edge(2, 4));
      edges.add(new Edge(3, 0));
      edges.add(new Edge(3, 2));
      edges.add(new Edge(4, 2));
      edges.add(new Edge(4, 5));
      edges.add(new Edge(5, 4));
      edges.add(new Edge(6, 1));

      Graph graph = new Graph(edges);

      GraphUtils.printGraph(graph);
   }
}
