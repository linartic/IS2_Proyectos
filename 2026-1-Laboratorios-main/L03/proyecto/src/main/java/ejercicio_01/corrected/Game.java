package ejercicio_01.corrected;

public abstract class Game {
    protected String name;

    public Game(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void start();
    public String getInfo() {
        return "Juego: " + name;
    }

}
