package ejercicio_02.corrected;

public abstract class Character {

    protected  String name;
    protected String platform;
    protected int health;
    protected Weapon weapon;



    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
        System.out.println(this.name + " equipó " + weapon.name);
    }

    public void takeDamage(int damage) {

        if(getClass().getSimpleName().contains("PC")){
            platform = "PC";
        }else{
            platform = "MOBILE";
        }

        this.health -= damage;
        System.out.println(this.name + " (" + this.platform + ") recibe " + damage + " de daño. Vida restante: " + this.health);
    }

    public abstract void attack(Character target);

    public void setName(String nombre){
        this.name = nombre;
    }

}

