package pl.sda.behavioral.exercise1;

import java.util.ArrayList;
import java.util.List;

public class UserStore {

    private final List<OnSavedUserObserver> observers = new ArrayList<OnSavedUserObserver>();

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        for (OnSavedUserObserver observer : observers) {
            observer.onUserSaved(user);
        }
        this.user = user;
    }

    public void addOnSavedUserObserver(OnSavedUserObserver observer) {
        observers.add(observer);
    }
}
