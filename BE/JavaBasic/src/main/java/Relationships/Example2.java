package Relationships;

// пример класса, который вложен в другой класс
public class Example2 {

    class Inner1 {
        private int a = 10;
        private String b = "test";

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public String getB() {
            return b;
        }

        public void setB(String b) {
            if (b == null)
                this.b = "";
            else
                this.b = b;
        }
    }


    public static void main(String[] args) {
//        Example2 e2 = new Example2();
//        Inner1 in1 = e2.new Inner1();

        Example2.Inner1 in1 = new Example2().new Inner1();

        System.out.println(in1.getA() + " " + in1.getB().toUpperCase());
    }
}