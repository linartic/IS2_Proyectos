package pe.edu.ulima.is2.patrones.bridge;

public class ImplementorWindows implements Implementor{

    @Override
    public void dibujar() {
        System.out.printf("Implementado en Windows");
    }
}
