package com.ulima.is2.singleton;

import java.util.UUID;

public class DatabaseConnector {
    private static DatabaseConnector instance;
    private String connectionId;

    private DatabaseConnector(){
        this.connectionId = UUID.randomUUID().toString(); //genera codigos random
        System.out.println("Nueva conexion establecida: "+this.connectionId);
        simulateHeavyResource();
    }

    public static synchronized DatabaseConnector getInstance(){
        if(instance == null){
            instance = new DatabaseConnector();
        }
        return instance;
    }


    private void simulateHeavyResource(){ //simulación de conectar a la DB -- con carga "pesada"
        try{
            Thread.sleep(100); //tiempo de "espera"
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void executeQuery(String query){
        System.out.println("DB-"+connectionId + " Ejecutando: " + query);
    }

}
