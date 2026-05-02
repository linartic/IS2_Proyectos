package com.ulima.is2.og;

public class ServiceB {

    public void generateReport(){ //generar reporte de ventas
        System.out.println("ServiceB: Generando reporte...");
        DatabaseConnector db = new DatabaseConnector();

        db.executeQuery("SELECT * FROM reports");
    }

}
