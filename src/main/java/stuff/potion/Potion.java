package stuff.potion;

public class Potion {
    String name;
    int healthRestore;

    public Potion(String name,int healthRestore){
        this.name=name;
        this.healthRestore=healthRestore;
    }

    public String getName(){
        return name;
    }

    public int getHealthRestore(){
        return healthRestore;
    }

    public void setHealthRestore(int healthRestore) {
        this.healthRestore = healthRestore;
    }
}
