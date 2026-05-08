package pe.edu.ulima.is2.patrones.bridge;

public class VentanaCircular extends Ventana{

    private Implementor implementor;
    public VentanaCircular(Implementor implementor){
        this.implementor = implementor;
    }

    @Override
    protected void draw() {
        System.out.println("Se dibuja ventana circular windows");
    }
}
