package preg1;

public class Main {

    static void main() {
        System.out.println("YA FUE YA");

        Estudiante estudiante =
                new Estudiante(
                        "alumno@ulima.edu.pe",
                        "999111222"
                );

        Profesor docente =
                new Profesor(
                        "docente@ulima.edu.pe",
                        "988777666"
                );

        FactoryCanal fabrica1 = new FabricaEmail();

        CanalComunicacion canal1 =
                fabrica1.crearCanal();

        canal1.enviar(
                estudiante.email,
                estudiante.generarMensaje()
        );

        FactoryCanal fabrica2 = new FabricaSMS();

        CanalComunicacion canal2 =
                fabrica2.crearCanal();

        canal2.enviar(
                docente.telefono,
                docente.generarMensaje());
    }

}
