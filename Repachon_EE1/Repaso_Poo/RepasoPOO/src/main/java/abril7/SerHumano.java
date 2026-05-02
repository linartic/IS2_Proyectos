package abril7;

public class SerHumano {
    String nombre;
    String colorOjos;
    int edad;

    public SerHumano(String nombre, String colorOjos, int edad) {
        this.nombre = nombre;
        this.colorOjos = colorOjos;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
