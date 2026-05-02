package pe.edu.ulima.is2.patrones.singleton;

public class Persona {
    private static Persona instance = null; //quiero solo 1
    private String nombre;
    private int edad;

    public static Persona getInstance(){
        if(instance == null){
            instance = new Persona(); //si no existe 1, se crea
        }
        return instance; //le da la referencia del anterior
    }

    private Persona() {}; //constructor privado

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
