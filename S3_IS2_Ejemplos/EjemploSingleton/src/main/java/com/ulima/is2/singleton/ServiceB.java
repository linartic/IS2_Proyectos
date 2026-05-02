package com.ulima.is2.singleton;

public class ServiceB {

    public void generateReport(){ //generar reporte de ventas
        System.out.println("ServiceB: Generando reporte...");
        DatabaseConnector db = DatabaseConnector.getInstance();

        db.executeQuery("SELECT * FROM reports");
    }

}
