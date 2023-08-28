package lesson12_map.task2;

import java.util.HashMap;
import java.util.Map;

public class Main {

   public static void main(String[] args) {

//        Найти маршрут из заданного списка билетов
//        Учитывая список билетов, найти маршрут по порядку, используя данный список.
//        Вход:
//        «Berlin» -> «London»
//        «Tokyo» -> «Seoul»
//        «Mumbai» -> «Berlin»
//        «Seoul» -> «Mumbai»
//
//        Выход:
//        Tokyo -> Seoul, Seoul -> Mumbai, Mumbai -> Berlin, Berlin -> London

      Map<String, String> tickets = new HashMap<>();
      tickets.put("Berlin", "London");
      tickets.put("Tokyo", "Seoul");
      tickets.put("Mumbai", "Berlin");
      tickets.put("Seoul", "Mumbai");

      String startCity = getStartCity(tickets);

      String route = getRoute(tickets, startCity);

//        Выход:
//        Tokyo -> Seoul, Seoul -> Mumbai, Mumbai -> Berlin, Berlin -> London
      System.out.println(startCity);
      System.out.println(route);
   }

   public static String getStartCity(Map<String, String> map) {

      String startCity = "";

      for (String city : map.keySet()) {
         if (!map.containsValue(city)) {
            startCity = city;
         }
      }

      return startCity;
   }

   //        Tokyo -> Seoul, Seoul -> Mumbai, Mumbai -> Berlin, Berlin -> London
   public static String getRoute(Map<String, String> map, String startCity) {

      String destination;
      StringBuilder sb = new StringBuilder();

      while (map.get(startCity) != null) {
         destination = map.get(startCity);
         sb.append(startCity).append(" -> ").append(destination).append(", ");
         startCity = destination;
      }

      sb.setLength(sb.length() - 2);
      return sb.toString();
   }
}
