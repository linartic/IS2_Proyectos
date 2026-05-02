package ejercicio_01.corrected;

public class FPSFactory extends GameFactory{
    @Override
    public Game createGame(String name) {
        Game game = null;
        game = new FPSGame(name);
        return game;
    }
}