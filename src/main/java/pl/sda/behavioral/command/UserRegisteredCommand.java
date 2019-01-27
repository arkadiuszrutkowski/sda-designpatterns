package pl.sda.behavioral.command;

public class UserRegisteredCommand implements Command {

    private final String userName;

    public UserRegisteredCommand(String userName) {
        this.userName = userName;
    }

    public void execute() {
        System.out.println("User " + userName + " has been registered");
    }
}
