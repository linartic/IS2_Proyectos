package preg1;

public class Profesor extends Usuario{

    public Profesor(String email, String telefono) {
        super(email, telefono);
    }

    @Override
    public String generarMensaje() {
        return "Revision completa";
    }
}
