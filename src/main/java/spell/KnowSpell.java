package spell;
import java.util.ArrayList;
import java.util.List;

public class KnowSpell {
    private List<AbstractSpell> knowSpell;

    public KnowSpell() {
        this.knowSpell = new ArrayList<>();
    }

    public void addSpell(AbstractSpell spell) {
        this.knowSpell.add(spell);
    }

    public List<AbstractSpell> getKnownSpells() {
        return knowSpell;
    }
}