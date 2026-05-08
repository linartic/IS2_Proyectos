package pe.edu.ulima.is2.patrones.bridge;

public class VentanaTriangular extends Ventana{

    private Implementor implementor;

    public VentanaTriangular(Implementor implementor) {
        this.implementor = implementor;
    }


    @Override
    protected void draw() {
        System.out.println("se dibuja ventana triangular mac");
    }
}
