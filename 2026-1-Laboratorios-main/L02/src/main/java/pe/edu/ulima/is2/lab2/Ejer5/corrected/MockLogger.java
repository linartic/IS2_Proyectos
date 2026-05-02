package pe.edu.ulima.is2.lab2.Ejer5.corrected;

public class MockLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("MockLog - "+message);
    }
}
