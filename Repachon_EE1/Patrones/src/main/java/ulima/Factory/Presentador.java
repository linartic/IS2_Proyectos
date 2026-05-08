package ulima.Factory;

public class Presentador extends Aplicacion{
    @Override
    public Documento crear() {
        return new Ppt();
    }
}
