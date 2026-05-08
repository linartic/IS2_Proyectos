package preg1;

public class FabricaSMS extends FactoryCanal{
    @Override
    public CanalComunicacion crearCanal() {
        return new SMSAdapter();
    }
}
