package lesson14.task1;

import java.util.List;

/**
 * [1 -> 2][1 -> 6]
 */
public class GraphUtils {

   public static void printGraph(Graph graph) {

      List<List<Integer>> list = graph.getList();

      for (int i = 0; i < list.size(); i++) {
         List<Integer> currentList = list.get(i);
         StringBuilder sb = new StringBuilder();

         for (Integer currentInteger : currentList) {
            sb.append("[").append(i).append(" -> ").append(currentInteger).append("] ");
         }
         System.out.println(sb);
      }
   }
}
