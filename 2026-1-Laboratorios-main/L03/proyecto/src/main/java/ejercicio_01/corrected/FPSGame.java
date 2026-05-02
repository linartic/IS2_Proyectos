package ejercicio_01.corrected;

public class FPSGame extends Game{

    public FPSGame(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("Cargando mapa de combate...");
        System.out.println("Selecciona tu arma inicial");
    }

    @Override
    public String getInfo() {
        return "Juego:" + name + "| tipo: "+ this.getClass().getSimpleName();
    }

}
