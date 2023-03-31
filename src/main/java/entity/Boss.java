package entity;
import sleep.Sleep;

public class Boss extends AbstractEnemy {
    String spellname;
    public Boss(String name, int health, int damage , Float chance,String spellname) {
        super(name, health, damage, chance);
        this.spellname = spellname;
    }

    @Override
    public void attack(Character character) {
        Sleep.sleep(1000);
        float accuracy = (float) Math.random();
        if (accuracy <= chance) {
            System.out.println(name + " casted "+ spellname + " on you and dealt " + damage + " damage !\n");
            character.setHealth(character.getHealth() - damage);
            Sleep.sleep(1000);
        } else {
            System.out.println(name + " missed his spell ! !\n ");
        }
    }
}