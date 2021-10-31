package model;

import java.util.ArrayList;

/**
 * @author Siyuan He
 * @create 2021-10-28 17:25
 */
public class City {
    private ArrayList<Community> communities;

    public City() {
        communities  = new ArrayList<>();
    }

    public ArrayList<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(ArrayList<Community> communities) {
        this.communities = communities;
    }
}
