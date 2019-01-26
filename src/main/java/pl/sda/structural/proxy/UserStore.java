package pl.sda.structural.proxy;

import pl.sda.creational.exercises.ex1.User;

class UserStore {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
