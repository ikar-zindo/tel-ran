package org.example._2023_07_07.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
   public static void main(String[] args) {

//      List<String> list = new ArrayList<>();
//      list.add("Apple");
//      list.add("Orange");
//      list.add("Kiwi");
//      list.add("Banana");

//      Collections.sort(list);
//      System.out.println(list);

      List<Person> personList = new ArrayList<>();
      personList.add(new Person("Roman", 2365));
      personList.add(new Person("Ivan", 1234));
      personList.add(new Person("Artemii", 4452));
      personList.add(new Person("Sergeis", 3890));
      personList.add(new Person("Viktar", 6250));

      Collections.sort(personList, new SalaryComparator());
      System.out.println(personList);
   }
}
