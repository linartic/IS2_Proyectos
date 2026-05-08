package ulima.edu.ejer1_Factory.problem;

public class GameCreator {

    public Game createGame(String type) {
        Game game = null;

        if (type.equals("RPG")) {
            game = new RPGGame();
        } else if (type.equals("FPS")) {
            game = new FPSGame();
        } else {
            throw new IllegalArgumentException("Tipo de juego no soportado: " + type);
        }

        return game;
    }
}