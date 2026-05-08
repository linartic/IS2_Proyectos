package abril10;

public class Main {

    static void main() {
        System.out.println("POO parte 2");

        Perro boti = new Perro();
        boti.setPeso(40);
        System.out.println(boti.getPeso());

        saludar(boti);

    }

    public static void saludar(Animal animal){
        animal.hacerSonido();
    }
}
