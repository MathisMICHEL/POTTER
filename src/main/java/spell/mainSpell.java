package spell;
import java.util.ArrayList;


public class mainSpell {
    public ArrayList<Spell> spellList = new ArrayList<>();
    public ArrayList<ForbiddenSpell> forbiddenSpellList = new ArrayList<>();

    public mainSpell(){
        spellList.add(new Spell("Incendio", 550, 0.95f));
        spellList.add(new Spell("Accio", 0, 0.8f));//siporteloin attrapé = win
        spellList.add(new Spell("Wingardium Leviosa", 50, 0.8f));//si trollnv1
        spellList.add(new Spell("Expecto Patronum", 0, 0.7f));//si mangemort
        spellList.add(new Spell("Sectumsempra ", 80, 0.4f));
        spellList.add(new Spell("Expelliarmus", 20, 0.8f));//impossibilité de jouer

        forbiddenSpellList.add(new ForbiddenSpell("Avada Kedabra",10000,0.1f));
        forbiddenSpellList.add(new ForbiddenSpell("Imperio",0,0.01f));//rejoint le joueur
        forbiddenSpellList.add(new ForbiddenSpell("Crucio",0,0.1f));//impossibilité de jouer plusieur tours
    }
}
