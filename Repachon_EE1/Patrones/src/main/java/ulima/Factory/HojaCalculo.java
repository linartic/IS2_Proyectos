package ulima.Factory;

public class HojaCalculo extends Aplicacion{
    @Override
    public Documento crear() {
        return new Xls();
    }
}
