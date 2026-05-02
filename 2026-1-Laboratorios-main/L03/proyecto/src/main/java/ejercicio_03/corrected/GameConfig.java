package ejercicio_03.corrected;

import java.util.UUID;

public class GameConfig {

    private static GameConfig instance;
    private String databaseUrl;
    private boolean debugMode;
    private int maxPlayers;

    public GameConfig() {
        this.databaseUrl = "jdbc:mysql://localhost:3306/gamedb";
        this.debugMode = false;
        this.maxPlayers = 100;
    }

    public static synchronized GameConfig getInstance(){
        if(instance == null){
            instance = new GameConfig();
        }
        return instance;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setDebugMode(boolean debug) {
        this.debugMode = debug;
    }

    public boolean isDebugMode() {
        return debugMode;
    }


}
