package behavioral.mediator;

// Client
public class MediatorPatternDemo {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserImpl(mediator, "Harish");
        User user2 = new UserImpl(mediator, "Arjun");
        User user3 = new UserImpl(mediator, "Gokul");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.send("Hello everyone!");
        user2.send("Hi Gokul!");
    }
}
