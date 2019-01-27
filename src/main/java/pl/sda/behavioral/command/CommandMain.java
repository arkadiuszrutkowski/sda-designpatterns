package pl.sda.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class CommandMain {

    public static void main(String[] args) {
        List<Command> commands = new ArrayList<Command>();
        commands.add(new UserRegisteredCommand("John"));
        commands.add(new CurrentDateTimeCommand());
        commands.add(new MakeCoffeeCommand());

        for (Command command : commands) {
            command.execute();
        }
    }
}
