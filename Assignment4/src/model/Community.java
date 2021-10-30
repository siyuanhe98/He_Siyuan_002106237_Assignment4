package model;

import java.util.ArrayList;

/**
 * @author Siyuan He
 * @create 2021-10-28 17:24
 */
public class Community {
    private ArrayList<House> houses;
    private String name;

    public Community(String name) {
        houses = new ArrayList<>();
        this.name = name;
    }

    public ArrayList<House> getHouses() {
        return houses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHouses(ArrayList<House> houses) {
        this.houses = houses;
    }
}
