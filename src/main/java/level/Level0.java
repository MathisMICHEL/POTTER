package level;
import java.util.Scanner;
import entity.Wizard;
import sleep.Sleep;
import stuff.house.HouseList;
import stuff.wand.Wand;
import stuff.wand.WandList;
import java.util.Random;
import stuff.house.House;
import java.util.ArrayList;
import stuff.potion.Potion;
import stuff.potion.PotionList;
import stuff.pet.Pet;

public class Level0 {
    private Wizard wizard;

    public Level0(Wizard wizard, WandList wandList, HouseList houseList) {
        this.wizard = wizard;
        int timebasic = 10;
        System.out.println();

        PotionList potionList1 = new PotionList();
        Random random = new Random();
        Pet[] pets = Pet.values();
        Pet randomPet = pets[(int) (Math.random() * pets.length)];
        wizard.setPet(randomPet);
        wizard.setPotions(new ArrayList<>(potionList1.potionList.subList(0, 4)));
        Wand randomWand = wandList.getWands().get(random.nextInt(wandList.getWands().size()));
        House randomHouse=houseList.getHouseList().get(random.nextInt(houseList.getHouseList().size()));
        Sleep.sleep(timebasic);
        System.out.println("Student: You are new here? What's your name?");
        Scanner scanner = new Scanner(System.in);
        String NameWizard = scanner.next();
        wizard.setName(NameWizard);
        Sleep.sleep(timebasic);
        System.out.println("Student: Welcome " + wizard.getName() + ", the Sorting Hat will give you your House.");
        Sleep.sleep(timebasic*2);
        System.out.println("Student: Oh but I almost forgot, I have something for you !");
        Sleep.sleep(timebasic);
        System.out.println("Student: Here's your Wand!");
        Sleep.sleep(timebasic);
        System.out.println("The student has just given you...");
        Sleep.sleep(timebasic);
        System.out.println("A wand named "+randomWand.getName()+".");
        Sleep.sleep(timebasic);
        System.out.println("Student: It's a powerful wand made of "+randomWand.getCore() + ".");
        Sleep.sleep(timebasic);
        System.out.println("Student: Now thats you are ready let's see the Sorting Hat.");
        Sleep.sleep(timebasic);
        System.out.println("SortingHat: Hummmm yes so you will be...");
        Sleep.sleep(timebasic*2);
        System.out.println("SortingHat: Jéhovah Witness!");
        Sleep.sleep(timebasic*2);
        System.out.println("SortingHat: Oops not what i meant to say");
        Sleep.sleep(timebasic);
        System.out.println("SortingHat: You will be in house "+randomHouse.getName().toUpperCase() + ".");
        wizard.setHouse(randomHouse);
        wizard.setDamage(10);
        if(randomHouse.getId()==1){
            wizard.health+=30;
        }
        else if (randomHouse.getId() == 2) {
            PotionList potionList = new PotionList();
            for (Potion potion : potionList.potionList) {
                potion.setHealthRestore(potion.getHealthRestore() + 10);
            }
        }
        else if(randomHouse.getId()==3){
            wizard.chance+=0.1f;
        }
        else if(randomHouse.getId()==4){
            wizard.damage=11;
        }
        Sleep.sleep(timebasic);
        System.out.println("SortingHat: And here 's your pet :");
        Sleep.sleep(timebasic);
        System.out.println("Your pet is a "+wizard.getPet().getType() + ".");
        Sleep.sleep(timebasic*2);
        System.out.println("SortingHat: Welcome to Poudlard !\n\n\n\n");
    }
    public Wizard getWizard() {
        return wizard;
    }
}
