package level;
import entity.Enemy;
import entity.Wizard;
import fight.Fight;
import sleep.Sleep;
import spell.KnowSpell;
import spell.mainSpell;


public class Level2 {
    private Wizard wizard;

    public Level2(Wizard wizard) {
        this.wizard = wizard;
        int timebasic=1;
        Enemy basilisk = new Enemy("Basilisk", 10000, 100, 0.25f);
        KnowSpell knowSpell = new KnowSpell();
        mainSpell spells = new mainSpell();
        knowSpell.addSpell(spells.spellList.get(0));
        knowSpell.addSpell(spells.spellList.get(2));
        knowSpell.addSpell(spells.spellList.get(1));
        System.out.println("You have learned a new spell !");
        Sleep.sleep(timebasic);
        System.out.println(knowSpell.getKnownSpells().get(2).getSpellInfo());
        System.out.println("----LEVEL 2----\n\n");
        Sleep.sleep(2*timebasic);
        boolean combatresult = false;
        while(!combatresult) {
            System.out.println("Student: " + wizard.getName() + "come in this hole please.");
            System.out.println(wizard.getName() + ": Hmm Ok!");
            System.out.println("You falled in the chamber of secret !");
            System.out.println("And now see a big snake.");
            System.out.println("Big snake: SS sss s S sSSsSS? ssS!");
            System.out.println(basilisk.getName() + " wants to fight you ! \n\n");
            Sleep.sleep(timebasic);
            if(wizard.getHouse().getName().equals("Gryffindor")){
                System.out.println("The sword of Gryffindor is your only hope !");
            }
            else {
                System.out.println("Accio a teeth than destroy him with it !");
            }
            combatresult=Fight.fight(knowSpell, wizard, basilisk);
        }
        System.out.println("You finished level 2 !\n\n");
    }
    public Wizard getWizard() {
        return wizard;
    }
}