package ejercicio_01.corrected;

public class RPGGame extends Game {

    public RPGGame(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("Iniciando aventura épica...");
        System.out.println("Selecciona tu clase de personaje");
    }

    @Override
    public String getInfo(){
        return "Juego:" + name + "| tipo: "+ this.getClass().getSimpleName();
    }
}
