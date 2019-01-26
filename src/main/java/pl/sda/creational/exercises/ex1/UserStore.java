package pl.sda.creational.exercises.ex1;

public class UserStore {

    private static final UserStore instance = new UserStore();
    private User user;

    public static UserStore getInstance() {
        return instance;
    }

    private UserStore() {
        // no-op
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
