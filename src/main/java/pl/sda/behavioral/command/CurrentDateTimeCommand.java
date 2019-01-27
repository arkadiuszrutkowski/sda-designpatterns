package pl.sda.behavioral.command;

import java.util.Date;

public class CurrentDateTimeCommand implements Command {

    public void execute() {
        System.out.println("Current time is " + new Date());
    }
}
