package ulima.edu.ejer1_Factory.corrected;

public abstract class Game {
    protected String name;
    protected String genre;

    public abstract void start();

    public String getInfo() {
        return "Juego: " + name + " | Género: " + genre;
    }
}