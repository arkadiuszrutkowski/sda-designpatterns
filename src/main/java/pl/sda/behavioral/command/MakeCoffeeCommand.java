package pl.sda.behavioral.command;

public class MakeCoffeeCommand implements Command {
    public void execute() {
        System.out.println("Making coffee...");
    }
}
