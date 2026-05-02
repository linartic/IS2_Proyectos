package pe.edu.ulima.is2.patrones.factory_method;

public class Ppt extends Documento{
    @Override
    public void abrir() {
        System.out.println("Se abrira documento de PPT...");
    }

    @Override
    public void cerrar() {
        System.out.println("Se cerrara documento de PPT...");
    }
}
