package spell;
import entity.AbstractEnemy;
import sleep.Sleep;
import entity.Wizard;


public class Spell extends AbstractSpell {

    public Spell(String name, int damage, Float chance) {
        super(name, damage, chance);
    }

    @Override
    public void cast(AbstractEnemy enemy, Wizard wizard) {
        float accuracy = (float) Math.random();
        int damage1 = damage * wizard.getDamage()/10;
        float chance1 = chance + wizard.getChance();
        if (accuracy <= chance1 ) {
            switch(enemy.getName()){
                case "Troll":
                    if(name.equals("Wingardium Leviosa")){
                        damage1=damage*wizard.getDamage()*3;
                    }
                    break;
                case "Dementors":
                    if(name.equals("Expecto Patronum")){
                        damage1=damage*wizard.getDamage()+500;
                    }
                case "Basilisk":
                    if(name.equals("Accio")){
                        float AccioTest=(float)Math.random();
                        if(AccioTest>0.36 && enemy.getName()=="Basilisk"){
                            System.out.println("You took out a teeth of the basilisk!");
                            enemy.setHealth(10);
                        }
                    }
                    break;
                case "Drunk Voldemort":
                    if(name.equals("Accio")){
                        float AccioTest=(float)Math.random();
                        if(AccioTest>0.36 && enemy.getName()=="Drunk Voldemort"){
                            System.out.println("You accioted the weird hat !");
                            enemy.setHealth(0);
                            Sleep.sleep(1000);
                            System.out.println("You escaped Voldemort !");
                        }
                    }
                    break;
                default:
                    break;
            }
            System.out.println("You cast " + name + " on " + enemy.getName() + " and dealt " + damage1 + " damage !\n");
            enemy.setHealth(enemy.getHealth()-damage1);
            Sleep.sleep(1000);
            System.out.println(enemy.getName()+" now have "+enemy.getHealth()+" hp.");
            if(damage1>(damage*wizard.getDamage())*2.9){
                Sleep.sleep(1000);
                System.out.println("This is incredibly efficient !\n\n");
            }

        } else {
            System.out.println("You missed the spell !\n\n");
        }
    }
}