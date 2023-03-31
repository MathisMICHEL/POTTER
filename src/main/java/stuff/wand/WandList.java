package stuff.wand;
import java.util.ArrayList;

public class WandList {
    private ArrayList<Wand> wands = new ArrayList<Wand>();

    public WandList() {
        wands.add(new Wand("Huge Wand",15f,Core.PHOENIX_FEATHER));
        wands.add(new Wand("Above Average Wand",10.5f,Core.DRAGON_SHELL));
        wands.add(new Wand("Bread Wand",10f,Core.FLOUR_YEAST_SALT_WATER));
        wands.add(new Wand("Voldemort's Twin",10f,Core.BIGFOOT_FOOT));
        wands.add(new Wand("Wand",11f,Core.WING_PLANE));
        wands.add(new Wand("Good Wand",12f,Core.WHITE_POWDER));
    }

    public ArrayList<Wand> getWands() {
        return wands;
    }
}