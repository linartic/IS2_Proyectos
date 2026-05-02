package ejercicio_02.corrected;

import ejercicio_02.problema.Enemy;
import ejercicio_02.problema.Warrior;

public class MobileFactory extends GameElementFactory implements GameElementFactory_{
    @Override
    public Character createWarrior() {
        Character warrior;
        warrior = new MobileWarrior();
        return warrior;
    }

    @Override
    public Character createEnemy() {
        Character enemy;
        enemy = new MobileEnemy();
        return enemy;
    }

    @Override
    public Weapon createSword() {
        Weapon sword;
        sword = new MobileSword();
        return sword;
    }

    @Override
    public Weapon createClaw() {
        Weapon claw;
        claw = new MobileClaw();
        return claw;
    }

    ///////////////////////////////////// Interface

    @Override
    public Character _createWarrior() {
        Character warrior;
        warrior = new MobileWarrior();
        return warrior;
    }

    @Override
    public Character _createEnemy() {
        Character enemy;
        enemy = new MobileEnemy();
        return enemy;
    }

    @Override
    public Weapon _createSword() {
        Weapon sword;
        sword = new MobileSword();
        sword.setName("espada");
        return sword;
    }

    @Override
    public Weapon _createClaw() {
        Weapon claw;
        claw = new MobileClaw();
        claw.setName("garra");
        return claw;
    }
}
