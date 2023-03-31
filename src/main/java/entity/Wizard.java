package entity;
import stuff.pet.Pet;
import stuff.wand.Wand;
import stuff.potion.Potion;
import spell.KnowSpell;
import java.util.ArrayList;
import stuff.house.House;

public class Wizard extends Character{
    public float chance;
    public KnowSpell knowSpell;
    public Wand wand;
    public ArrayList<Potion> potions;
    public Pet pet;
    public  House house;

    public Wizard(String name, int health, int damage, float chance, KnowSpell knowSpell, Wand wand,Potion potions,Pet pet,House house) {
        super(name, health, damage, chance);
        this.knowSpell = knowSpell;
        this.wand = wand;
        this.potions = new ArrayList<Potion>();
        this.pet=pet;
        this.house = house;
    }

    public void setHouse(House house){
        this.house = house;
    }

    public House getHouse(){
        return house;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWandName() {
        return wand.getName();
    }

    public String getWandCore() {
        return wand.getCore();
    }

    public Float getChance(){
        return chance;
    }

    public Pet getPet(){
        return pet;
    }

    public void setPet(Pet pet){
        this.pet=pet;
    }

    public void setPotions(ArrayList<Potion> potions){
        this.potions = potions;
    }

    public ArrayList<Potion> getPotions(){
        return potions;}

    public ArrayList<String> getPotionsInfo() {
        ArrayList<String> potionInfoList = new ArrayList<>();
        for (Potion potion : potions) {
            String potionInfo = potion.getName() + " (" + potion.getHealthRestore() + " health restore)";
            potionInfoList.add(potionInfo);
        }
        return potionInfoList;
    }

    public int getPotionHealth(int index){
        if (index-1 >= 0 && index-1 < potions.size()) {
            Potion potion = potions.get(index-1);
            return potion.getHealthRestore();
        } else {
            return 0;
        }
    }

    public void attack(Character character) {}
}