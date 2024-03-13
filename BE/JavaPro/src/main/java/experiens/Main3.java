package experiens;

class Main3 {
   public static void main(String[] args) {
      boolean a = false;
      boolean b = true;
      boolean c = false;
      boolean r1 = a || b && c;
      boolean r2 = b || c && a || c;
      System.out.println(r1);
      System.out.println(r2);
   }
}

