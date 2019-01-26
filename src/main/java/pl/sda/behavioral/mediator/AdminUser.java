package pl.sda.behavioral.mediator;

public class AdminUser extends User {

    private final String name;

    protected AdminUser(ChatMediator chatMediator, String name) {
        super(chatMediator);
        this.name = name;
    }

    protected void receive(String message) {
        System.out.println("[Admin] " + name + " received: " + message);
    }
}
