package ulima.Singleton;

import java.util.UUID;

public class DataBaseConnector {
    public String connectionID;
    private static DataBaseConnector instance;

    private DataBaseConnector() {
        this.connectionID = UUID.randomUUID().toString();
        System.out.println("Conexion establecida" + this.connectionID);
    }

    public static synchronized DataBaseConnector getInstance(){
        if(instance == null){
            instance = new DataBaseConnector();
        }
        return instance;
    }

    public void executeQuery(String query){
        System.out.println("DB-"+connectionID+" atendiendo: "+query);
    }
}
