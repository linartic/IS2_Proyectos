package ejercicio_01.corrected;

public abstract class GameFactory {

    public abstract Game createGame(String name);

    public void playGame(){
        System.out.println("JUGANDO...");
        //iniciar juego aqui
    }

}
