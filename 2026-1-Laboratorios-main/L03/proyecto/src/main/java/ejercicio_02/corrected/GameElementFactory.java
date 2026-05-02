package ejercicio_02.corrected;

import ejercicio_02.problema.*;

public abstract class GameElementFactory {

    public abstract Character createWarrior();
    public abstract Character createEnemy();

    public abstract Weapon createSword();
    public abstract Weapon createClaw();
}
