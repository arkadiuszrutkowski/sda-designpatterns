package pl.sda.structural.proxy;

import pl.sda.creational.exercises.ex1.User;

public class UserStoreProxy {

    private final UserStore userStore = new UserStore();

    public void setUser(User user) {
        System.out.println("User saved = " + user);
        userStore.setUser(user);
    }

    public User getUser() {
        System.out.println("User fetched");
        return userStore.getUser();
    }
}
