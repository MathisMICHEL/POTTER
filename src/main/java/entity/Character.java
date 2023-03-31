package entity;

public abstract class Character {
    public String name;
    public int health;
    public int damage;
    public Float chance;

    public Character(String name, int health, int damage, Float chance) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.chance = chance;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public String getName(){
        return name;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public Float getChance(){
        return chance;
    }

    public void setChance(Float chance){
        this.chance = chance;
    }

    public abstract void attack(Character character);
}
