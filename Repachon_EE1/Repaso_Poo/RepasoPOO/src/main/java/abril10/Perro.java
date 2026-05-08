package abril10;

public class Perro extends Animal implements IDraggable, IDibujable{
    @Override
    public void hacerSonido() {
        System.out.println("gua guau");
    }

    @Override
    public void startDrag() {

    }

    @Override
    public void endDrag() {

    }

    @Override
    public void dibujar() {

    }
}
