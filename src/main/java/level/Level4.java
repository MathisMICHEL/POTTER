package level;
import entity.Boss;
import entity.Wizard;
import fight.Fight1;
import sleep.Sleep;
import spell.KnowSpell;
import spell.mainSpell;

public class Level4 {
    private Wizard wizard;

    public Level4(Wizard wizard) {
        this.wizard = wizard;
        int timebasic = 1;
        Boss Peter = new Boss("Peter Petigrow", 300, 10, 0.25f,"Occulis");
        Boss Voldemort = new Boss("Drunk Voldemort", 10000, 10000, 0.10f,"AVADA KEDABRA");
        KnowSpell knowSpell = new KnowSpell();
        mainSpell spells = new mainSpell();
        knowSpell.addSpell(spells.spellList.get(0));
        knowSpell.addSpell(spells.spellList.get(1));
        knowSpell.addSpell(spells.spellList.get(2));
        knowSpell.addSpell(spells.spellList.get(3));
        System.out.println("----LEVEL 4----\n\n");
        Sleep.sleep(2*timebasic);
        boolean combatresult = false;
        boolean combatresult1=false;
        while(!combatresult) {
            System.out.println("You fell in a trap in the cemetery !");
            System.out.println("Peter Petigrow: Heheh I will kill you for me master!");
            Sleep.sleep(timebasic);
            System.out.println("Peter Petigrow wants to fight you");
            Sleep.sleep(timebasic);
            combatresult= Fight1.fight(knowSpell, wizard, Peter);
        }
        while(!combatresult1){
            System.out.println("Drunk Voldemort: SOPALINARA");
            System.out.println("Drunk Voldemort wants to fight you !");
            combatresult1= Fight1.fight(knowSpell, wizard, Voldemort);
        }
        System.out.println("You finished level 4 !\n\n");
    }
    public Wizard getWizard() {return wizard;}
}
