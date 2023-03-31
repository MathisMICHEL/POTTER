package stuff.potion;
import java.util.ArrayList;

public class PotionList {
    public ArrayList<Potion> potionList = new ArrayList<Potion>();

    public PotionList(){
        potionList.add(new Potion("Potion of Health",25));
        potionList.add(new Potion("Draught of Health",50));
        potionList.add(new Potion("Solution of Health",75));
        potionList.add(new Potion("Philter of Health",100));
        potionList.add(new Potion("Elixir of Health",130));
        potionList.add(new Potion("Barrel of Health",1000));
    }
}
