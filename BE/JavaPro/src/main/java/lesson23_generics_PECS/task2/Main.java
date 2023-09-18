package lesson23_generics_PECS.task2;

import lesson17_lambdas_practice.task2.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void main(String[] args) {

      List<Integer> numbers = new ArrayList<>();

      List list = new ArrayList();

      list.add(new Cat(4, "GREY", 5.12));
      list.add("Hello");
      list.add(7);

      System.out.println(((Cat) list.get(1)).getColor());

      for (int i = 0; i < list.size(); i++) {
         System.out.println(list.get(i));
      }
   }
}
