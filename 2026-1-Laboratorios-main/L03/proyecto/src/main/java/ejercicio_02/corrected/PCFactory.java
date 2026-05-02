package ejercicio_02.corrected;

public class PCFactory extends GameElementFactory implements GameElementFactory_{
    @Override
    public Character createWarrior() {
        Character warrior;
        warrior = new PCWarrior();
        return warrior;
    }

    @Override
    public Character createEnemy() {
        Character enemy;
        enemy = new PCEnemy();
        return enemy;
    }

    @Override
    public Weapon createSword() {
        Weapon sword;
        sword = new PCSword();
        return sword;
    }

    @Override
    public Weapon createClaw() {
        Weapon claw;
        claw = new PCClaw();
        return claw;
    }

    ////////////////////////Interface

    @Override
    public Character _createWarrior() {
        Character warrior;
        warrior = new PCWarrior();
        return warrior;
    }

    @Override
    public Character _createEnemy() {
        Character enemy;
        enemy = new PCEnemy();
        return enemy;
    }

    @Override
    public Weapon _createSword() {
        Weapon sword;
        sword = new PCSword();
        sword.setName("espada");
        return sword;
    }

    @Override
    public Weapon _createClaw() {
        Weapon claw;
        claw = new PCClaw();
        claw.setName("garra");
        return claw;
    }
}
