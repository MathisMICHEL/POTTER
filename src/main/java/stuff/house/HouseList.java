package stuff.house;
import java.util.ArrayList;

public class HouseList {
    private ArrayList<House> houseList = new ArrayList<House>();

    public HouseList() {
        houseList.add(new House("Gryffindor",1));
        houseList.add(new House("Hufflepuff",2));
        houseList.add(new House("Ravenclaw",3));
        houseList.add(new House("Slytherin",4));
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }
}