package pl.sda.creational.singleton_lazy;

public class SingletonMain {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        singleton.increment();
        System.out.println("singleton = " + singleton.getCounter());
        singleton1.increment();
        System.out.println("singleton1 = " + singleton1.getCounter());
    }
}
