package Relationships;


public class Example {
    public static void main(String[] args) {

        Animal a = new Animal();
        System.out.println(a);

        Dog d = new Dog();

        FrBulldog fb = new FrBulldog();
        System.out.println(fb);

        GerSheppard gs = new GerSheppard();
        System.out.println(gs);
        // возможность скорректировать длину хвоста
//        gs.getTail().setLength(25);
//        System.out.println(gs.getTail().getLength());

        Bird b = new Bird();

        Eagle e = new Eagle();

        Parrot p = new Parrot();

        System.out.println();

    }
}

class Tail {
    private int length;

    public Tail(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Tail = " + length + " cm";
    }
}

class Animal {
    private int paws = 4;
    private int tails = 1;
    private Tail tail = new Tail(20);

    public Tail getTail() {
        return tail;
    }

    public void setTail(Tail tail) {
        this.tail = tail;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public int getTails() {
        return tails;
    }

    public void setTails(int tails) {
        this.tails = tails;
    }

    @Override
    public String toString() {
        return getClass().getName() + " with paws = " + paws + ", tails = " + tails;
    }
}

class Dog extends Animal implements Barkable {
    @Override
    public void bark() {
        System.out.println("Bark, bark!!!");
    }
}

class FrBulldog extends Dog {
    private int avgLengthPaws = 15;
    private int avgLengthFur = 1;
    private Tail tail = new Tail(4);

    @Override
    public Tail getTail() {
        return tail;
    }

    @Override
    public void setTail(Tail tail) {
        this.tail = tail;
    }

    @Override
    public void bark() {
        System.out.println("Bark, french bulldog, bark!!!");
    }

    public int getAvgLengthPaws() {
        return avgLengthPaws;
    }

    public void setAvgLengthPaws(int avgLengthPaws) {
        this.avgLengthPaws = avgLengthPaws;
    }

    public int getAvgLengthFur() {
        return avgLengthFur;
    }

    public void setAvgLengthFur(int avgLengthFur) {
        this.avgLengthFur = avgLengthFur;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + tail;
    }
}

class GerSheppard extends Dog {
    private int avgLengthPaws = 40;
    private int avgLengthFur = 4;
    private Tail tail = new Tail(30);

    @Override
    public Tail getTail() {
        return tail;
    }

    @Override
    public void setTail(Tail tail) {
        this.tail = tail;
    }

    @Override
    public void bark() {
        System.out.println("Bark, german sheppard, bark!!!");
    }

    public int getAvgLengthPaws() {
        return avgLengthPaws;
    }

    public void setAvgLengthPaws(int avgLengthPaws) {
        this.avgLengthPaws = avgLengthPaws;
    }

    public int getAvgLengthFur() {
        return avgLengthFur;
    }

    public void setAvgLengthFur(int avgLengthFur) {
        this.avgLengthFur = avgLengthFur;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + tail;
    }
}

// интерфейс для примера
interface A {
    void preparing();
    void cocking();
    void serving();
    void eating();
}

interface Barkable {
    void bark();
}

class Bird extends Animal {
    private int paws = 2;
    private int winds = 2;
    private int beak = 1;

    @Override
    public int getPaws() {
        return paws;
    }

    @Override
    public void setPaws(int paws) {
        this.paws = paws;
    }

    public int getWinds() {
        return winds;
    }

    public void setWinds(int winds) {
        this.winds = winds;
    }

    public int getBeak() {
        return beak;
    }

    public void setBeak(int beak) {
        this.beak = beak;
    }
}

class Eagle extends Bird implements Flying {
    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }
}

class Parrot extends Bird implements Flying {

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }
}

interface Flying {
    void fly();
}