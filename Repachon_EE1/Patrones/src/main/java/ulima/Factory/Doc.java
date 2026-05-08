package ulima.Factory;

public class Doc extends Documento {
    @Override
    public void abrir() {
        System.out.println("Abriendo Doc de Word");
    }

    @Override
    public void cerrar() {
        System.out.println("Cerrando Doc");
    }
}
