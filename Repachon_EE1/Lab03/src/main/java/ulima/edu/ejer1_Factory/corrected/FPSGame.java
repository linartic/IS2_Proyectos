package ulima.edu.ejer1_Factory.corrected;

public class FPSGame extends Game {

    public FPSGame() {
        this.name = "Battle Arena";
        this.genre = "FPS";
    }

    @Override
    public void start() {
        System.out.println("Cargando mapa de combate...");
        System.out.println("Selecciona tu arma inicial");
    }
}