package ulima.edu.ejer1_Factory.problem;

public class RPGGame extends Game {

    public RPGGame() {
        this.name = "Epic Quest";
        this.genre = "RPG";
    }

    @Override
    public void start() {
        System.out.println("Iniciando aventura épica...");
        System.out.println("Selecciona tu clase de personaje");
    }
}