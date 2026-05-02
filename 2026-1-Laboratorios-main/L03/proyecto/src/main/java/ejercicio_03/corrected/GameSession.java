package ejercicio_03.corrected;

public class GameSession {

    public void startSession() {
        GameConfig config = GameConfig.getInstance();
        System.out.println("Iniciando sesión...");
        System.out.println("Máximo jugadores: " + config.getMaxPlayers());
        System.out.println("Debug mode: " + config.isDebugMode());
    }


}
