package level;
import entity.Wizard;
import entity.Enemy;
import fight.Fight;
import sleep.Sleep;
import spell.KnowSpell;
import spell.mainSpell;


public class Level1 {
    private Wizard wizard;

    public Level1(Wizard wizard) {
        this.wizard = wizard;
        int timebasic = 1;
        Enemy troll = new Enemy("Troll", 500, 10, 0.55f);
        mainSpell spells = new mainSpell();
        KnowSpell knowSpell = new KnowSpell();
        knowSpell.addSpell(spells.spellList.get(0));
        knowSpell.addSpell(spells.spellList.get(2));
        System.out.println("----LEVEL 1----");
        Sleep.sleep(timebasic*2);
        System.out.println("You have learned two new spells: Wingardium Leviosa and Incendio.\n");
        boolean combatresult = false;
        while(!combatresult) {
            Sleep.sleep(timebasic);
            System.out.println("Student: " + wizard.getName() + ", you are needed to nettoyer the toilet STP.");
            Sleep.sleep(timebasic);
            System.out.println(wizard.getName() + ": Ui ui Im coming");
            Sleep.sleep(timebasic);
            System.out.println(wizard.getName() + " reaches the toilet...");
            Sleep.sleep(timebasic);
            System.out.println("...and sees a big, weird animal.");
            Sleep.sleep(timebasic);
            System.out.println("Troll: Greuu Soy una troll di mierda y me gusta la paella.");
            Sleep.sleep(timebasic);
            System.out.println("The Troll wants to fight you !\n\n");
            Sleep.sleep(timebasic * 2);
            combatresult = Fight.fight(knowSpell, wizard, troll);
        }
        System.out.println("You finished level 1 !\n\n");
    }

    public Wizard getWizard() {
        return wizard;
    }
}
