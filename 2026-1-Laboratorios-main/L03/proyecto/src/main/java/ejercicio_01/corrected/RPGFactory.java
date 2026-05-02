package ejercicio_01.corrected;

public class RPGFactory extends GameFactory {

    @Override
    public Game createGame(String name) {
        Game game = null;
        game = new RPGGame(name);
        return game;
    }
}
