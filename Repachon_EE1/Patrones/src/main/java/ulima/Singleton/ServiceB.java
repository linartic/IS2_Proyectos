package ulima.Singleton;

public class ServiceB {
    public void reporte(String report){
        System.out.println("Generando reporte....");
        DataBaseConnector db = DataBaseConnector.getInstance();
        db.executeQuery("SELECT * FROM REPORT");
    }
}
