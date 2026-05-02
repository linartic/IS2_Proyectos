package ejercicio_02.corrected;

public class Main {

    public static void main(String[] args) {
        System.out.println("EJER 2: ABSTRACT FACTORY");
        System.out.println("\nPC FACTORY");
        GameElementFactory_ pc = new PCFactory();

        Character warrior = pc._createWarrior();
        warrior.setName("Marcelo");
        Character enemy = pc._createEnemy();
        enemy.setName("Gonzalo");

        Weapon sword = pc._createSword();
        Weapon claw = pc._createClaw();

        warrior.equipWeapon(sword);
        enemy.equipWeapon(claw);

        enemy.attack(warrior);
        warrior.takeDamage(100);

        System.out.println("\nMOBILE FACTORY");
        GameElementFactory_ mobile = new MobileFactory();
        Character warrior2 = mobile._createWarrior();
        warrior2.setName("Guerrero");
        Character enemy2 = mobile._createEnemy();
        enemy2.setName("Enemigo");

        Weapon sword2 = mobile._createSword();
        Weapon claw2 = mobile._createClaw();

        warrior2.equipWeapon(sword2);
        enemy2.equipWeapon(claw2);

        warrior2.attack(enemy2);

        enemy2.takeDamage(50);
    }
}
