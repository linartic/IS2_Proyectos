package com.ulima.is2.singleton;

public class ServiceA {
    public void processData(){
        System.out.println("Service A: Iniciando proceso...");
        DatabaseConnector db = DatabaseConnector.getInstance();

        db.executeQuery("SELECT * FROM users");
    }
}
