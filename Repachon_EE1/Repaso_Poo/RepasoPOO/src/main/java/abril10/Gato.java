package abril10;

public class Gato extends Animal implements IDibujable {
    @Override
    public void hacerSonido() {
        System.out.println("miau miau");
    }

    @Override
    public void dibujar() {
        
    }
}
