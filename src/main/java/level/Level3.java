package level;
import entity.Enemy;
import entity.Wizard;
import fight.Fight;
import sleep.Sleep;
import spell.KnowSpell;
import spell.mainSpell;

public class Level3 {
    private Wizard wizard;
    public Level3(Wizard wizard) {
        this.wizard = wizard;
        int timebasic = 1;
        Enemy Dementors = new Enemy("Dementors", 1000, 100, 0.25f);
        KnowSpell knowSpell = new KnowSpell();
        mainSpell spells = new mainSpell();
        knowSpell.addSpell(spells.spellList.get(0));
        knowSpell.addSpell(spells.spellList.get(1));
        knowSpell.addSpell(spells.spellList.get(2));
        System.out.println("----LEVEL 2----\n\n");
        Sleep.sleep(2*timebasic);
        boolean combatresult = false;
        while(!combatresult) {
            System.out.println("Student: The Dementors want to suck your soul, run !");
            System.out.println(wizard.getName() + ": Hmm Ok!");
            System.out.println("Student: Oh no they have catched you !");
            Sleep.sleep(timebasic);
            System.out.println(Dementors.getName() + " wants to fight you ! \n\n");
            Sleep.sleep(timebasic);
            combatresult= Fight.fight(knowSpell, wizard, Dementors);
        }
        System.out.println("You finished level 3 !\n\n");
        Sleep.sleep(timebasic);
    }
    public Wizard getWizard() {
        return wizard;
    }
}