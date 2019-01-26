package pl.sda.behavioral.mediator;

public class RegularUser extends User {

    private final String name;

    protected RegularUser(ChatMediator chatMediator, String name) {
        super(chatMediator);
        this.name = name;
    }

    protected void receive(String message) {
        System.out.println(name + " received: " + message);
    }
}
