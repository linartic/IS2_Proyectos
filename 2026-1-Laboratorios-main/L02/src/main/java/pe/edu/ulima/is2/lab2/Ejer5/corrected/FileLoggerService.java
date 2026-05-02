package pe.edu.ulima.is2.lab2.Ejer5.corrected;

public class FileLoggerService implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Prueba FileLoggerService - "+message);
    }
}
