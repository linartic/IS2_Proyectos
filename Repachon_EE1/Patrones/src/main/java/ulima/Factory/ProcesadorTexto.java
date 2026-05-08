package ulima.Factory;

public class ProcesadorTexto extends Aplicacion{
    @Override
    public Documento crear() {
        return new Doc();
    }
}
