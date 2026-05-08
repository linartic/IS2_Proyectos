package ulima.Factory;

import java.sql.SQLOutput;

public class Xls extends Documento{
    @Override
    public void abrir() {
        System.out.println("Abriendo Excel");
    }

    @Override
    public void cerrar() {
        System.out.println("Cerrando Excel");

    }
}
