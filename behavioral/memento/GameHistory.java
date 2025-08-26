package behavioral.memento;
// Caretaker class

import java.util.Stack;

public class GameHistory {
    private Stack<GameMemento> history = new Stack<>();

    public void save(Game game) {
        history.push(game.save());
    }

    public void undo(Game game) {
        if (!history.isEmpty()) {
            game.restore(history.pop());
        }
    }
}
