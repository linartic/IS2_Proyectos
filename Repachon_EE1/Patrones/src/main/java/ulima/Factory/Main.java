package ulima.Factory;

public class Main {
    static void main() {

        Aplicacion app = new HojaCalculo();
        Documento doc = app.crear();
        ejectuarFactoryMethos(doc);


    }

    public static void ejectuarFactoryMethos(Documento doc){
        doc.abrir();
        doc.cerrar();
    }

}
