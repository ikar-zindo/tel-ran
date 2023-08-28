package lesson14_graph.task1;

import java.util.Objects;

public class Edge {

   private int source;
   private int destination;

   public Edge(int source, int destination) {
      if (source == destination) {
         throw new RuntimeException();
      }
      this.source = source;
      this.destination = destination;
   }

   public int getSource() {
      return source;
   }

   public int getDestination() {
      return destination;
   }

   @Override
   public String toString() {
      return String.format("Ребро: от - %d, до - %d.", source, destination);
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Edge edge = (Edge) o;
      return source == edge.source && destination == edge.destination;
   }

   @Override
   public int hashCode() {
      return Objects.hash(source, destination);
   }
}
