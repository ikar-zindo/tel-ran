package ArrayExamples;

import java.util.Arrays;
import java.util.Comparator;

// пример сортировки
public class Example6 {
   public static void main(String[] args) {
      Integer[] a = {7,3,1,9,4,2,6,5,5,1};

      System.out.println("original = " + Arrays.toString(a));

      // сортировка по умолчанию (по возрастанию)
      Arrays.sort(a);
      System.out.println("sorted = " + Arrays.toString(a));

      // сортировка по умолчанию (по убыванию)

      Arrays.sort(a, new Comparator<Integer>() {
         @Override
         public int compare(Integer o1, Integer o2) {
            return -(o1 - o2); // корректировка сортировки в обратную сторону
         }
      });
      System.out.println("sorted reversed = " + Arrays.toString(a));


      System.out.println();

      String[] b = {"Bob", "Alice", "Tom"};
      System.out.println("original = " + Arrays.toString(b));

      // сортировка по умолчанию (по алфавиту)
      Arrays.sort(b);
      System.out.println("sorted = " + Arrays.toString(b));

      // сортировка в против алфавита
      Arrays.sort(b, new StrungCompareReverse());
      System.out.println("sorted reverse = " + Arrays.toString(b));

      // Пример 3.
      System.out.println();
      House[] houses = {
              new House(700_000, 100, "Dusseldorf"),
              new House(120_000, 70, "Munster"),
              new House(1_000_000, 75, "Munich"),
              new House(700_000, 90, "Cologne")
      };

      System.out.println(Arrays.toString(houses));

      // сортировка по убыванию по цене
      Arrays.sort(houses, new Comparator<House>() {
         @Override
         public int compare(House o1, House o2) {
            return - (int) (o1.getPrice() - o2.getPrice());
         }
      });

      System.out.println(Arrays.toString(houses));

      // сортировка по городу (по алфавиту)
      Arrays.sort(houses, new Comparator<House>() {
         @Override
         public int compare(House o1, House o2) {
            return o1.getCity().compareTo(o2.getCity());
         }
      });
      System.out.println(Arrays.toString(houses));

      // сортировка по стоимости (по возрастанию), а если стоимость одинаковая
      // - сортировка по городу (по алфавиту)
      Arrays.sort(houses, new Comparator<House>() {
         @Override
         public int compare(House o1, House o2) {
            int result = (int) (o1.getPrice() - o2.getPrice());
            if (result == 0) return o1.getCity().compareTo(o2.getCity());
            return result;
         }
      });

      System.out.println(Arrays.toString(houses));
   }
}

class StrungCompareReverse implements Comparator<String> {
   @Override
   public int compare(String o1, String o2) {
      return -o1.compareTo(o2);
   }
}

class House {
   private double price, area;
   private String city;

   public House(double price, double area, String city) {
      this.price = price;
      this.area = area;
      this.city = city;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public double getArea() {
      return area;
   }

   public void setArea(double area) {
      this.area = area;
   }

   public String getCity() {
      return city;
   }

   public void setCity(String city) {
      this.city = city;
   }

   @Override
   public String toString() {
      return "House{" +
              "price=" + price +
              ", area=" + area +
              ", city='" + city + '\'' +
              '}';
   }
}
