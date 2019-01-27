package pl.sda.behavioral.exercise1;

public class UserStoreMain {

    public static void main(String[] args) {
        UserStore userStore = new UserStore();
        userStore.addOnSavedUserObserver(new OnSavedUserObserver() {
            public void onUserSaved(User user) {
                System.out.println("Observer #1: " + user);
            }
        });
        userStore.addOnSavedUserObserver(new OnSavedUserObserver() {
            public void onUserSaved(User user) {
                System.out.println("Observer #2: " + user);
            }
        });
        userStore.setUser(new User("John", "Doe"));
    }
}
