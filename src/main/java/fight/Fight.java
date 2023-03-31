package fight;
import entity.Wizard;
import entity.Enemy;
import spell.AbstractSpell;
import spell.KnowSpell;
import spell.mainSpell;
import sleep.Sleep;
import java.util.Scanner;

public class Fight {
    public static boolean fight(KnowSpell knowSpell, Wizard wizard, Enemy enemy) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        int timebasic = 1;
        int baseHealth = wizard.getHealth();
        int OutRunCount=0;
        while (true) {
            enemy.attack(wizard);
            if (wizard.getHealth() <= 0) {
                System.out.println("Game over! You have been defeated by " + enemy.getName() + ".");
                Sleep.sleep(timebasic*2);
                return false;
            }
            System.out.println("You have "+wizard.getHealth()+" hp left.\n");
            Sleep.sleep(timebasic);
            System.out.println("Choose between those options !\n");
            System.out.println("Spells: 1");
            System.out.println("Potions: 2");
            System.out.println("Run: 3");
            System.out.println("Attack 4");
            boolean correctAnswer = false;
            while(!correctAnswer) {
                int doChoice = scanner.nextInt();
                switch (doChoice) {
                    case 1 -> {
                        boolean correctAnswer3 = false;
                        while (!correctAnswer3) {
                            System.out.println("Choose a spell:");
                            for (int i = 0; i < knowSpell.getKnownSpells().size(); i++) {
                                System.out.println((i + 1) + ": " + knowSpell.getKnownSpells().get(i).getSpellInfo());
                            }
                            int spellChoice = scanner.nextInt();
                            if(spellChoice<1 || spellChoice> knowSpell.getKnownSpells().size()){
                                System.out.println("Print the correct answer");
                            }
                            else if(spellChoice<=knowSpell.getKnownSpells().size()){
                                AbstractSpell spell = knowSpell.getKnownSpells().get(spellChoice - 1);
                                spell.cast(enemy, wizard);
                                correctAnswer3 = true;
                            }
                        }
                        Sleep.sleep(timebasic);
                        correctAnswer = true;
                    }
                    case 2 -> {
                        boolean correctAnswer1 = false;
                        while (!correctAnswer1) {
                            System.out.println("Choose a potion in the list: ");
                            System.out.println(wizard.getPotionsInfo());
                            System.out.println("Type a number between 1 and " + wizard.getPotionsInfo().size() + ".");
                            int potionChoice = scanner.nextInt();

                            if (potionChoice < 1 || potionChoice > wizard.getPotionsInfo().size()) {
                                System.out.println("Print the correct answer.");
                            } else if (potionChoice <= wizard.getPotionsInfo().size()) {
                                wizard.setHealth(wizard.getHealth() + wizard.getPotionHealth(potionChoice));
                                wizard.getPotions().remove(1);
                                correctAnswer1 = true;
                            }
                        }
                        if (wizard.getHealth() > baseHealth) {
                            wizard.setHealth(baseHealth);
                        }
                        Sleep.sleep(timebasic * 2);
                        System.out.println("You now have " + wizard.getHealth() + "hp.");
                        correctAnswer = true;
                    }
                    case 3 -> {
                        if (enemy.getName().equals("Dementors") && (OutRunCount == 0 || OutRunCount == 1)) {
                            System.out.println("You try to outrun Dementors !");
                            OutRunCount++;
                        } else if (enemy.getName().equals("Dementors") && OutRunCount == 2) {
                            System.out.println("While running, you have learned a new spell ! ");
                            mainSpell spells = new mainSpell();
                            knowSpell.addSpell(spells.spellList.get(3));
                        } else {
                            System.out.println("You can't outrun " + enemy.getName() + " !");
                        }
                        correctAnswer = true;
                    }
                    case 4 -> {
                        if (wizard.getHouse().getName().equals("Gryffindor") && enemy.getName().equals("Basilisk")) {
                            System.out.println("You slash with Gryffindor 's sword !");
                            enemy.setHealth(enemy.getHealth() - 5000);
                            Sleep.sleep(timebasic);
                            System.out.println("This is incredibly efficient !");
                        } else {
                            System.out.println("You attack enemy with your pet and dealt " + wizard.getPet().getDamage() + " damage");
                            enemy.setHealth(enemy.getHealth() - wizard.getPet().getDamage());
                        }
                        Sleep.sleep(timebasic);
                        System.out.println(enemy.getName() + " now have " + enemy.getHealth() + " hp.");
                        correctAnswer = true;
                    }
                    default -> System.out.println("Invalid choice. Please choose between 1 and 4.");
                }
            }
            if (enemy.getHealth() <= 0) {
                System.out.println("Congratulations! You have defeated " + enemy.getName() + ".");
                wizard.setHealth(baseHealth);
                System.out.println("Do you wish to increase your Health or your Damage ?");
                System.out.println("type Health or Damage.");
                boolean correctAnswer2 = false;
                while(!correctAnswer2) {
                    String input = scanner1.nextLine();
                    switch (input) {
                        case "Health" -> {
                            wizard.setHealth(wizard.getHealth() + 10);
                            System.out.println("Your health have been increased !");
                            correctAnswer2 = true;
                        }
                        case "Damage" -> {
                            wizard.setDamage(wizard.getDamage() + 1);
                            System.out.println("Your damage have been increased !");
                            correctAnswer2 = true;
                        }
                        default -> System.out.println("Invalid choice. Please choose between Health and Damage.");
                    }
                }
                return true;
            }
            Sleep.sleep(2000);
        }
    }
}