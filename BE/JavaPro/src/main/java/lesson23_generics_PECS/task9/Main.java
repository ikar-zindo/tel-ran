package lesson23_generics_PECS.task9;

// todo   a. Есть классы Fruit (абстрактный), его наследники —->
//        Apple, Orange;(больше фруктов не надо)
//        b. Класс Box в который можно складывать фрукты, коробки типизируются по типу фрукта,
//        поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//        c. Для хранения фруктов внутри коробки можете использовать ArrayList;
//        d. Сделать метод getWeight() который высчитывает вес коробки,
//        зная количество фруктов и вес одного фрукта
//        (вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
//        e. Внутри класса коробка сделать метод compare,
//        который позволяет сравнить текущую коробку с той,
//        которую подадут в compare в качестве параметра, true - если их веса равны,
//        false в противном случае
//        (коробки с яблоками мы можем сравнивать с коробками с апельсинами);
//        f. Написать метод, который позволяет пересыпать фрукты из текущей
//        коробки в другую коробку
//        (помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами),
//        соответственно в текущей коробке фруктов не остается,
//        а в другую перекидываются объекты, которые были в этой коробке;
//        g. Не забываем про метод добавления фрукта в коробку.
public class Main {
   public static void main(String[] args) {

      Box<Apple> appleBox = new Box<>();
      appleBox.put(new Apple());
      appleBox.put(new Apple());
      appleBox.put(new Apple());
      appleBox.put(new Apple());
      appleBox.put(new Apple());
      appleBox.put(new Apple());

      Box<Orange> orangeBox = new Box<>();
      orangeBox.put(new Orange());
      orangeBox.put(new Orange());
      orangeBox.put(new Orange());
      orangeBox.put(new Orange());

      System.out.println(appleBox);
      System.out.println(orangeBox);

      System.out.println(appleBox.boxWeight());
      System.out.println(orangeBox.boxWeight());

      Box<Orange> orangeBox1 = new Box<>();
      System.out.println(orangeBox1.boxWeight());

      System.out.println(orangeBox.compare(appleBox));
      System.out.println(orangeBox1.compare(appleBox));

      System.out.println("==================================");

      Box<Apple> appleBoxMove = new Box<>();
      appleBox.move(appleBoxMove);
      System.out.println(appleBox);
      System.out.println(appleBoxMove);
   }
}
