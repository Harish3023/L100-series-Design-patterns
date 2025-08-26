package behavioral.memento;

public class GameMementoDemo {
    public static void main(String[] args) {
        Game game = new Game(1, 100);
        GameHistory history = new GameHistory();

        game.play();
        history.save(game);

        game.play();
        history.save(game);

        game.play();
        game.showStatus(); // Level: 4, Health: 70

        history.undo(game);
        game.showStatus(); // Level: 3, Health: 80

        history.undo(game);
        game.showStatus(); // Level: 2, Health: 90
    }
}
