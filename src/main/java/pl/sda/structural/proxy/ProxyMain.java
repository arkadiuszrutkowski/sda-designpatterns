package pl.sda.structural.proxy;

import pl.sda.creational.exercises.ex1.User;

public class ProxyMain {

    public static void main(String[] args) {
        UserStoreProxy proxy = new UserStoreProxy();
        proxy.setUser(new User("John", "Doe", 1980, "test", "test"));
        User user = proxy.getUser();
    }
}
