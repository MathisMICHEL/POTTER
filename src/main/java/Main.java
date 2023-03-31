import entity.Wizard;
import level.*;
import stuff.wand.WandList;
import stuff.house.HouseList;


public class Main {
    public static void main(String[] args) {
        WandList wandList = new WandList();
        HouseList houseList = new HouseList();
        Wizard wizard = new Wizard("none", 200, 0, 0f, null,null,null,null,null);
        Level0 level0 = new Level0(wizard, wandList, houseList);
        Wizard wizard1 = level0.getWizard();
        Level1 level1 = new Level1(wizard1);
        Wizard wizard2 = level1.getWizard();
        Level2 level2 = new Level2(wizard2);
        Wizard wizard3 = level2.getWizard();
        Level3 level3 = new Level3(wizard3);
        Wizard wizard4 = level3.getWizard();
        Level4 level4 = new Level4(wizard4);
    }
}

