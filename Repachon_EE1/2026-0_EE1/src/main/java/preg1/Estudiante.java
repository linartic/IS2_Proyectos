package preg1;

public class Estudiante extends Usuario{

    public Estudiante(String email, String telefono) {
        super(email, telefono);
    }

    @Override
    public String generarMensaje() {
        return "Tarea realizada";
    }
}
