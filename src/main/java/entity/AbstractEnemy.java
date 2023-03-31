package entity;
import spell.*;
import java.util.ArrayList;

public abstract class AbstractEnemy extends Character {
    protected ArrayList<AbstractSpell> spellList;
    protected ArrayList<ForbiddenSpell> forbiddenSpellList;

    public AbstractEnemy(String name,int health, int damage, Float chance) {
        super(name, health, damage, chance);
        spellList = new ArrayList<>();
        forbiddenSpellList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void addSpell(AbstractSpell spell) {
        spellList.add(spell);
    }

    public void addForbiddenSpell(ForbiddenSpell forbiddenSpell) {
        forbiddenSpellList.add(forbiddenSpell);
    }

    public ArrayList<AbstractSpell> getSpellList() {
        return spellList;
    }

    public ArrayList<ForbiddenSpell> getForbiddenSpellList() {
        return forbiddenSpellList;
    }

    @Override
    public void attack(
            Character character) {
    }
}
