package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

// Concrete Mediator
public class ChatMediatorImpl implements ChatMediator {
    private List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String msg, User user) {
        for (User u : users) {
            if (u != user) { // Don't send message to self
                u.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
