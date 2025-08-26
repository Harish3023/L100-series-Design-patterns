package behavioral.memento;
// Originator class

public class Game {
    private int level;
    private int health;

    public Game(int level, int health) {
        this.level = level;
        this.health = health;
    }

    public void play() {
        System.out.println("Playing level " + level + " with health " + health);
        level++;
        health -= 10;
    }

    public GameMemento save() {
        return new GameMemento(level, health);
    }

    public void restore(GameMemento memento) {
        this.level = memento.getLevel();
        this.health = memento.getHealth();
    }

    public void showStatus() {
        System.out.println("Level: " + level + ", Health: " + health);
    }
}
