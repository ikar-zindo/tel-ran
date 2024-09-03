
/*
 1 уровень сложности: Создайте класс Box, в котором будут три поля:
 ширина, высота, длина этой коробки. Создайте внутри этого класса конструктор,
 который принимает 3 значения и определяет их в вышеописанные поля, помимо этого,
 сделайте так, чтоб в конструкторе подсчитывался объём коробки и печатался в консоль
width height length
 */
public class Box {
   public int width;
   public int height;
   public int length;

   public Box(int width, int height, int length) {
      this.width = width;
      this.height = height;
      this.length = length;
      int boxVolume = width * height * length;
      System.out.println("Box volume is " + boxVolume + " cubic unit.");
   }
}