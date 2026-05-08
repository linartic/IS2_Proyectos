package ulima.Singleton;

public class ServiceA {
    public void processData(){
        System.out.println("Service A: Iniciando proceso");
        DataBaseConnector db = DataBaseConnector.getInstance();

        db.executeQuery("SELECT * FROM QUERY");
    }
}
