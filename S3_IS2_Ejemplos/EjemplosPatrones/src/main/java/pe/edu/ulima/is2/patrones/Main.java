package pe.edu.ulima.is2.patrones;

import pe.edu.ulima.is2.patrones.factory_method.Aplication;
import pe.edu.ulima.is2.patrones.factory_method.Documento;
import pe.edu.ulima.is2.patrones.factory_method.HojaCalculo;
import pe.edu.ulima.is2.patrones.factory_method.Ppt;
import pe.edu.ulima.is2.patrones.singleton.Persona;

public class Main {

    static void main(){
        System.out.println("PRUEBA SINGLETON");
        Persona rui = Persona.getInstance();
        Persona tsu = Persona.getInstance();

        System.out.println("\nPRUEBA FACTORY METHOD");
        Aplication app = new HojaCalculo();
        Documento doc = app.crear();

        ejecutarFactoryMethod(doc);
    }

    public static void ejecutarFactoryMethod(Documento doc){
        doc.abrir();
        doc.cerrar();
    }

}
