package SS_26_05_23;

public class Box {
   private int width;
   private int length;
   private int height;

   public Box(int width, int length, int height) {
      this.width = width;
      this.length = length;
      this.height = height;
   }

   public int calculateValue() {
      if (width <= 0 || length <= 0 || height <= 0) {
         throw new Error("invalid value");
      }
      return width * length * height;
   }
}
//width length height
