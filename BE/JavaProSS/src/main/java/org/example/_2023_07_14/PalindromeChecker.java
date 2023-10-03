package org.example._2023_07_14;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class PalindromeChecker {

   public static void main(String[] args) {

      System.out.print("Please enter a word: ");
      Scanner scanner = new Scanner(System.in);
      String source = scanner.nextLine();
      scanner.close();

      char emptyChar = '\0';
      for (int i = 0; i < source.length(); i++) {
         if (source.charAt(i) == ' ' || source.charAt(i) == ','
                 || source.charAt(i) == '.' || source.charAt(i) == '?'
                 || source.charAt(i) == '!' || source.charAt(i) == ':'
                 || source.charAt(i) == ';' || source.charAt(i) == '-'
                 || source.charAt(i) == '"' || source.charAt(i) == '\''
                 || source.charAt(i) == '_' || source.charAt(i) == '/') {
            source = source.replace(source.charAt(i), emptyChar);
         }
      }

      List<Character> characterList = new ArrayList<>();

      for (int i = 0; i < source.length(); i++) {
         characterList.add(source.charAt(i));
      }

      System.out.println(characterList);

      ListIterator myIteratorForward = characterList.listIterator();
      ListIterator myIteratorBack = characterList.listIterator(characterList.size());

      boolean isPalindrome = true;
      int myIteratorForwardIndex = 0;
      int myIteratorBackIndex = characterList.size() - 1;
      while (myIteratorForward.hasNext() && myIteratorBack.hasPrevious()
              && myIteratorForwardIndex < myIteratorBackIndex) {

         if (myIteratorForward.next() != myIteratorBack.previous()) {
            System.out.println("Is not a palindrome");
            isPalindrome = false;
            break;
         }
         myIteratorForwardIndex++;
         myIteratorForwardIndex--;
      }

      if (isPalindrome) System.out.println("Is Palindrome");
   }
}
