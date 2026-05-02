package com.ulima.is2.og;

import java.util.UUID;

public class DatabaseConnector {
    private String connectionId;

    public DatabaseConnector(){
        this.connectionId = UUID.randomUUID().toString(); //genera codigos random
        System.out.println("Nueva conexion establecida: "+this.connectionId);
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
