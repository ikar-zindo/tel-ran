package lessoons.l14_graph.graph;

import java.util.*;

public class Graph {

   HashMap<Character, ArrayList<Character>> vertices = new HashMap<>();

   public void addVertex(Character vertex) {

      if (vertices.containsKey(vertex)) {
         throw new Error("Element duplication");
      }

      vertices.put(vertex, new ArrayList<>());
   }

   public void addEdge(Character vertex1, Character vertex2) {
      if (!vertices.containsKey(vertex1) || !vertices.containsKey(vertex2)) {
         throw new Error("At least one of the vertices is absent");
      }

      if (vertices.get(vertex1).contains(vertex2) || vertices.get(vertex2).contains(vertex1)) {
         throw new Error("This edge already exists");
      }

      vertices.get(vertex1).add(vertex2);
      vertices.get(vertex2).add(vertex1);
   }

   public ArrayList<Character> neighbors(Character vertex) {

      if ((!vertices.containsKey(vertex))) {
         throw new Error("No vertex");
      }

      return vertices.get(vertex);
   }

   public void print() {
      for (Character X : vertices.keySet()) {
         System.out.print(X + " -> ");
         for (Character Y : vertices.get(X)) {
            if (Y != vertices.get(X).get(vertices.get(X).size() - 1)) {
               System.out.print(Y + ", ");
            } else {
               System.out.print(Y);
            }
         }
         System.out.println();
      }
   }

   public ArrayList dfs(Character vertex){
      ArrayList visited = new ArrayList();
      dfsRecursion(vertex, visited);
      return visited;
   }

   public void dfsRecursion(Character vertex, ArrayList visited){
      System.out.println(vertex);
      visited.add(vertex);
      for (Character X: vertices.get(vertex)){
         if (!visited.contains(X))
            dfsRecursion(X,visited);
      }
   }
}
