package entity;
import sleep.Sleep;

public class Enemy extends AbstractEnemy {
    public Enemy(String name, int health, int damage, Float chance) {
        super(name, health, damage, chance);
    }

    @Override
    public void attack(Character character) {
        Sleep.sleep(1000);
        float accuracy = (float) Math.random();
        if (accuracy <= chance) {
            System.out.println("The " + name + " attacked you and dealt " + damage + " damage !\n");
            character.setHealth(character.getHealth() - damage);
            Sleep.sleep(1000);
        } else {
            System.out.println("The " + name + " missed his attack !\n ");
        }
    }
}
