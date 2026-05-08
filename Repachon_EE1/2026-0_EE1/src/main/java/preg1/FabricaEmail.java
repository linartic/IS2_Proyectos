package preg1;

public class FabricaEmail extends FactoryCanal{

    @Override
    public CanalComunicacion crearCanal() {
        return new EmailAdapter();
    }
}
