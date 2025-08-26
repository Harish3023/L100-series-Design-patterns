package behavioral.memento;
// Memento class

public class GameMemento {
    private final int level;
    private final int health;

    public GameMemento(int level, int health) {
        this.level = level;
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }
}
