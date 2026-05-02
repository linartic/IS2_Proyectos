package ejercicio_03.corrected;

public class Main {

    public static void main(String[] args) {

        System.out.println("EJER 3: SINGLETON GameConfig\n");
        GameConfig config = GameConfig.getInstance();
        config.setDebugMode(true);

        NetworkManager net = new NetworkManager();
        GameSession session = new GameSession();
        DatabaseManager db = new DatabaseManager();

        net.connect();
        session.startSession();
        db.saveData();

    }
}
