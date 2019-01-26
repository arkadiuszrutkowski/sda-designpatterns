package pl.sda.behavioral.mediator;

public class MediatorMain {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediator();
        User john = new RegularUser(mediator,"John");
        User jessy = new RegularUser(mediator, "Jessy");
        User george = new AdminUser(mediator, "George");
        User anna = new AdminUser(mediator, "Anna");

        mediator.addUserToChat(john);
        mediator.addUserToChat(jessy);
        mediator.addUserToChat(george);
        mediator.addUserToChat(anna);

        john.sendMessage("Hi everyone!");
        anna.sendMessage("Hi John!");
    }
}
