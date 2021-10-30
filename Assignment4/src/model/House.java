package model;

import java.util.ArrayList;

/**
 * @author Siyuan He
 * @create 2021-10-28 16:52
 */
public class House {
    private ArrayList<Person> residences;
    private String name;

    public House(String name) {
        residences = new ArrayList<>();
        this.name = name;
    }

    public ArrayList<Person> getResidences() {
        return residences;
    }

    public void setResidences(ArrayList<Person> residences) {
        this.residences = residences;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
