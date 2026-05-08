package ulima.Factory;

public class Ppt extends Documento{
    @Override
    public void abrir() {
        System.out.println("Abriendo PPT");
    }

    @Override
    public void cerrar() {
        System.out.printf("Cerrando PPT");

    }
}
