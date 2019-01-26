package pl.sda.creational.singleton_doublechecked;

// Lazy
public class Singleton {

    private static Singleton instance;
    private int counter = 0;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    System.out.println("Created instance");
                    instance = new Singleton();
                }
            }
        }
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
