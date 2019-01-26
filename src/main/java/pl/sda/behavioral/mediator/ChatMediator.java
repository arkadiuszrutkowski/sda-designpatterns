package pl.sda.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator {

    private final List<User> activeUsers = new ArrayList<User>();

    public void addUserToChat(User user) {
        activeUsers.add(user);
    }

    void sendMessage(String message, User user) {
        for (User activeUser : activeUsers) {
            if (activeUser != user) {
                activeUser.receive(message);
            }
        }
    }
}
