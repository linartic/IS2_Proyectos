package ejercicio_02.corrected;

public class PCEnemy  extends ejercicio_02.corrected.Character {
    @Override
    public void attack(Character target) {
        System.out.println(this.name + " ataca a "+ target.name);
    }
}
