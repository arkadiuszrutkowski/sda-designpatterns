package pl.sda.behavioral.mediator;

public abstract class User {

    private final ChatMediator chatMediator;

    protected User(ChatMediator chatMediator) {
        this.chatMediator = chatMediator;
    }

    void sendMessage(String message) {
        chatMediator.sendMessage(message, this);
    }

    protected abstract void receive(String message);
}
