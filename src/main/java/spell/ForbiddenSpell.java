package spell;
import entity.AbstractEnemy;
import entity.Wizard;

public class ForbiddenSpell extends AbstractSpell {

    public ForbiddenSpell(String name, int damage, Float chance) {
        super(name, damage, chance);
    }

    @Override
    public void cast(AbstractEnemy enemy, Wizard wizard) {
        float accuracy = (float) Math.random();
        if (accuracy <= chance) {

            System.out.println("You cast " + name + " on " + enemy.getName() + " and dealt " + damage + " damage !\n");
            enemy.setHealth(enemy.getHealth()-damage);
        } else {
            System.out.println("You missed the spell !\n");
        }
    }
}