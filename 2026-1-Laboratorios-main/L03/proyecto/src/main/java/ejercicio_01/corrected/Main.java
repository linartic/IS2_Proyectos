package ejercicio_01.corrected;

public class Main {

    public static void main(String[] args) {
        System.out.println("EJER 1: FACTORY METHOD PATTERN\n");
        RPGFactory rpgF = new RPGFactory();
        FPSFactory fpsF = new FPSFactory();


        Game j1 = rpgF.createGame("marioRPG");
        Game j2 = fpsF.createGame("JuegoFPS");

        System.out.println(j1.getInfo());
        j1.start();
        System.out.println("=================================");
        System.out.println(j2.getInfo());
        j2.start();



    }
}
