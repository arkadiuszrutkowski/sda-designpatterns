package pl.sda.creational.exercises.ex1;

public class UserStoreMain {

    public static void main(String[] args) {
        UserStore userStore = UserStore.getInstance();
        UserStore anotherUserStore = UserStore.getInstance();

        User user = new UserBuilder()
                .setFirstName("John")
                .setLastName("Doe")
                .build();

        System.out.println("userStore = " + userStore.getUser());
        anotherUserStore.setUser(user);
        System.out.println("userStore = " + userStore.getUser());
    }
}
