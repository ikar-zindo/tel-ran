package Relationships;

import java.util.Random;
import java.util.Scanner;

public class Example7 {
   public static void main(String[] args) {

      System.out.println(new Cinema().buyTicket());
      String result2 = new Cinema().seeMovie();

      // создание Scanner объекта (т.к. нет переменной, где лежит объект, то не к чему
      // закрывать Scanner
      int highBorder = new Scanner(System.in).nextInt();

      // пример создания анаонимного объекта от Random класса
      System.out.println(new Random().nextInt(10, highBorder));

      // анонимный класс + анонимный объект
      System.out.println(new Cinema() {
         @Override
         public String buyTicket() {
            return super.buyTicket() + " anon Class + anon Object";
         }
      }.buyTicket());
   }
}
