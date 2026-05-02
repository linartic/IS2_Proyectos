package ejercicio_02.corrected;

public abstract class Weapon {

    protected String name;
    protected String platform;
    protected int damage;

    public abstract void use();

    public int getDamage() {
        return damage;
    }

    public void setName(String nombre){
        this.name = nombre;
    }
}
