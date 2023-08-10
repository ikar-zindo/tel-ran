package _2023_08_09.task3;

import java.util.TreeMap;

public class TreeMapExample {

   public static void main(String[] args) {

//      TreeMap<MyClass, Integer> map = new TreeMap<>();
      TreeMap<MyClass, Integer> map = new TreeMap<>();
      

      map.put(new MyClass("One"), 1);
      map.put(new MyClass("Two"), 2);
      System.out.println(map);
   }

   static class MyClass implements Comparable<MyClass>{
      private String word;

      public MyClass(String word) {
         this.word = word;
      }

      public String getWord() {
         return word;
      }

      public void setWord(String word) {
         this.word = word;
      }

      @Override
      public String toString() {
         return "MyClass{" +
                 "word='" + word + '\'' +
                 '}';
      }

      @Override
      public int compareTo(MyClass o) {
         return this.word.compareTo(o.word);
      }
   }
}
