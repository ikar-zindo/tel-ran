package org.example._2023_08_03.task1;

import java.util.Comparator;

public class CatComparator implements Comparator<Cat> {

   @Override
   public int compare(Cat cat1, Cat cat2) {
      int hungry1,hungry2;
      hungry1 = cat1.isHungry() == true ? 0 : 1;
      hungry2 = cat2.isHungry() == true ? 0 : 1;
      int result = hungry2 - hungry1;
      if (result != 0) return result;
      result = cat1.getName().compareTo(cat2.getName());
      if (result != 0) return result;
      result = cat1.getAge() - cat2.getAge();
      return cat1.getColor().compareTo(cat2.getColor());
   }
}
