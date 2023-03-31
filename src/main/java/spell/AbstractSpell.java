package spell;
import entity.AbstractEnemy;
import entity.Enemy;
import entity.Wizard;

public abstract class AbstractSpell {
    protected String name;
    protected int damage;
    protected Float chance;


    public AbstractSpell(String name, int damage, Float chance) {
        this.name = name;
        this.damage = damage;
        this.chance = chance;
    }

    public abstract void cast(AbstractEnemy enemy, Wizard wizard);


    public String getSpellInfo() {
        return "Spell name: " + this.name + ", damage: " + this.damage + ", chance: " + this.chance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Float getChance() {
        return chance;
    }

    public void setChance(Float chance) {
        this.chance = chance;
    }
}