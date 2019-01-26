package pl.sda.creational.singleton;

// Eager
public class Singleton {

    private static final Singleton instance = new Singleton();
    private int counter = 0;

    public static Singleton getInstance() {
        return instance;
    }

    private Singleton() {
    }

    public void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
