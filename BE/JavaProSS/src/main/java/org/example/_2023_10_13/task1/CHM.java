package org.example._2023_10_13.task1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CHM {
   public static void main(String[] args) throws InterruptedException {

      Map<Integer, String> map = new ConcurrentHashMap<>();
      map.put(1, "Q");
      map.put(2, "A");
      map.put(3, "X");
      map.put(4, "C");
      map.put(5, "G");
      System.out.println(map);

      Runnable runnable1 = () -> {
         Iterator<Integer> iterator = map.keySet().iterator();
         while (iterator.hasNext()) {
            try {
               Thread.sleep(250);
            } catch (InterruptedException e) {
               throw new RuntimeException(e);
            }

            Integer i = iterator.next();
            System.out.println(i + " : " + map.get(i));
         }
      };

      Runnable runnable2 = () -> {
         try {
            Thread.sleep(400);
         } catch (InterruptedException e) {
            throw new RuntimeException(e);
         }

         map.put(6, "UU");
      };

      Thread thread1 = new Thread(runnable1);
      Thread thread2 = new Thread(runnable2);

      thread1.start();
      thread2.start();

      thread1.join();
      thread2.join();

      System.out.println(map);
   }
}
