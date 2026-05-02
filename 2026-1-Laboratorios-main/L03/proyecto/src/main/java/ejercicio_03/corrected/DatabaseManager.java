package ejercicio_03.corrected;

import java.util.UUID;

public class DatabaseManager {

    public void saveData() {
        GameConfig config = GameConfig.getInstance();
        System.out.println("Guardando en: " + config.getDatabaseUrl());
        System.out.println("Máximo jugadores permitidos: " + config.getMaxPlayers());
    }



}
